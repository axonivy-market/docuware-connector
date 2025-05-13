package com.axonivy.connector.docuware.connector;

import static com.axonivy.connector.docuware.connector.auth.oauth.OAuth2BearerFilter.AUTHORIZATION;
import static com.axonivy.connector.docuware.connector.auth.oauth.OAuth2BearerFilter.BEARER;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.security.MessageDigest;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.Response.Status.Family;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.client.utils.URIBuilder;
import org.glassfish.jersey.media.multipart.Boundary;
import org.glassfish.jersey.media.multipart.ContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataMultiPart;
import org.glassfish.jersey.media.multipart.file.StreamDataBodyPart;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import com.axonivy.connector.docuware.connector.auth.oauth.IdentityServiceContext;
import com.axonivy.connector.docuware.connector.auth.oauth.Token;
import com.axonivy.connector.docuware.connector.enums.DocuWareVariable;
import com.axonivy.connector.docuware.connector.enums.GrantType;
import com.docuware.dev.schema._public.services.platform.CheckInReturnDocument;
import com.docuware.dev.schema._public.services.platform.Document;
import com.docuware.dev.schema._public.services.platform.DocumentIndexField;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import ch.ivyteam.ivy.application.IApplication;
import ch.ivyteam.ivy.bpm.error.BpmError;
import ch.ivyteam.ivy.environment.Ivy;
import ch.ivyteam.ivy.scripting.objects.File;
import ch.ivyteam.ivy.security.ISecurityConstants;
import ch.ivyteam.util.IAttributeStore;
import ch.ivyteam.util.StringUtil;

public class DocuWareService {
	/*
	 * This is the format: /Date(1652285631000)/
	 */
	protected static final Pattern DATE_PATTERN = Pattern.compile("/Date\\(([0-9]+)\\)/");
	protected static final String PROPERTIES_FILE_NAME = "document";
	protected static final String PROPERTIES_FILE_EXTENSION = ".json";
	protected static final String PROPERTIES_FILE_CHARSET = "UTF-8";
	protected static final String CONTENT_DISPOSITION = "Content-Disposition";
	protected static final String RESPONSE_XML_ERROR_NODE = "Error";
	protected static final String RESPONSE_XML_MESSAGE_NODE = "Message";
	protected static final String STORE_DIALOG_ID = "storeDialogId";
	protected static final DocuWareService INSTANCE = new DocuWareService();
	protected static ObjectMapper objectMapper;
	public static final String DOCUWARE_ERROR = "docuware:connector:";

	public static DocuWareService get() {
		return INSTANCE;
	}

	public String getIvyVar(DocuWareVariable variable) {
		return Ivy.var().get(variable.getVariableName());
	}

	public String setIvyVar(DocuWareVariable variable, String value) {
		return Ivy.var().set(variable.getVariableName(), value);
	}

	public GrantType getIvyVarGrantType() {
		var type = getIvyVar(DocuWareVariable.GRANT_TYPE);
		return Optional.ofNullable(GrantType.of(type)).orElse(GrantType.PASSWORD);
	}

	/**
	 * Get the DocuWare Base URL.
	 * 
	 * @return
	 */
	public URIBuilder getBaseUrl() {
		return new URIBuilder()
				.setScheme(getIvyVar(DocuWareVariable.SCHEME))
				.setHost(getIvyVar(DocuWareVariable.HOST))
				.setPathSegments("DocuWare", "Platform");
	}

	/**
	 * Get the WebClient URL including an optional organizationName (if more than one org is available).
	 * 
	 * @param organizationName
	 * @return
	 */
	public URIBuilder getWebClientUrl(String organizationName) {
		var url = getBaseUrl();
		if(StringUtils.isNotBlank(organizationName)) {
			addPathSegments(url, organizationName);
		}
		addPathSegments(url, "WebClient");
		return url;
	}

	/**
	 * Get the Integration URL for embedding DocuWare into an IFrame including an optional organizationName (if more than one org is available).
	 * 
	 * @param organizationName
	 * @return
	 */
	public URIBuilder getIntegrationUrl(String organizationName) {
		var url = getWebClientUrl(organizationName);
		addPathSegments(url, "Integration");
		return url;
	}


	protected URIBuilder addPathSegments(URIBuilder builder, String...pathSegments) {
		List<String> segs = new ArrayList<>(builder.getPathSegments());

		for (String pathSegment : pathSegments) {
			segs.add(pathSegment);
		}

		builder.setPathSegments(segs);

		return builder;
	}


	/**
	 * Get the URL of a viewer usable for embedding. 
	 * 
	 * @param organizationName
	 * @param loginToken
	 * @param cabinetId
	 * @param documentId
	 * @return
	 */
	public String getViewerUrl(String organizationName, String loginToken, String cabinetId, String documentId) {
		var url = getIntegrationUrl(organizationName);

		var params = new LinkedHashMap<String, String>();

		params.put("p", "V");

		if(StringUtils.isNotBlank(loginToken)) {
			params.put("lct", loginToken);
		}
		if(StringUtils.isNotBlank(cabinetId)) {
			params.put("fc", cabinetId);
		}
		if(StringUtils.isNotBlank(documentId)) {
			params.put("did", documentId);
		}

		var clear = params.entrySet().stream().map(e -> "%s=%s".formatted(e.getKey(), e.getValue())).collect(Collectors.joining("&"));

		var ep = dwEncrypt(clear);

		url.addParameter("ep", ep);

		return url.toString();
	}


	/**
	 * Special variant of Base64 URL encoding with padding digit instead of '=' characters.
	 * 
	 * @param input
	 * @return
	 */
	public String dwUrlEncode(byte[] input) {
		if (input == null || input.length < 1) {
			return null;
		}

		var inputBase64 = Base64.getEncoder().encodeToString(input);

		var buf = new StringBuffer(inputBase64);
		var cnt = 0;
		while(buf.length() > 0 && buf.charAt(buf.length() - 1) == '=') {
			buf.deleteCharAt(buf.length() - 1);
			cnt++;
		}
		buf.append((char)('0' + cnt));

		return buf.toString().replace('+', '-').replace('/', '_');
	}

	/**
	 * Special variant of Base64 URL decoding with padding digit instead of '=' characters.
	 * 
	 * @param input
	 * @return
	 */
	public byte[] dwUrlDecode(String input) {
		if (input == null || input.length() < 1) {
			return null;
		}

		var buf = new StringBuffer(input.replace('-', '+').replace('_', '/'));

		int last = buf.length() - 1;
		var cnt = buf.charAt(last) - '0';
		buf.deleteCharAt(last);
		while(cnt-- > 0) {
			buf.append('=');
		}

		return Base64.getDecoder().decode(buf.toString());
	}




	/**
	 * Get a {@link Cipher}.
	 * 
	 * Use constants {@link Cipher#ENCRYPT_MODE} or {@link Cipher#DECRYPT_MODE} to determine the mode.
	 * 
	 * Key and Iv parameter needed for the Cipher are determined by building the SHA-512 hash of the password
	 * and taking the first 256 bits for the key and the next 128 bits for the Iv parameter.
	 * 
	 * @param mode
	 * @return 
	 */
	public Cipher getCipher(int mode) {
		Cipher cipher = null;
		var passphrase = DocuWareVariable.INTEGRATION_PASSPHRASE.getValue();
		if(StringUtils.isBlank(passphrase)) {
			BpmError
			.create(DOCUWARE_ERROR + "missingintegrationpassphrase")
			.withMessage("Integration Passphrase was not set.")
			.throwError();
		}

		try {
			cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
			var md = MessageDigest.getInstance("SHA-512");
			md.reset();

			var passphraseSHA512 = md.digest(passphrase.getBytes(StandardCharsets.UTF_8));

			// Split Hash into key and iv
			int keySize = 256 / 8;
			int ivSize = 128 / 8;
			byte[] key = Arrays.copyOfRange(passphraseSHA512, 0, keySize);
			byte[] iv = Arrays.copyOfRange(passphraseSHA512, keySize, keySize + ivSize);

			var secretKeySpec = new SecretKeySpec(key, "AES");
			var ivParameter = new IvParameterSpec(iv);

			cipher.init(mode, secretKeySpec, ivParameter);
		} catch (Exception e) {
			BpmError
			.create(DOCUWARE_ERROR + "ciphercreationerror")
			.withCause(e)
			.withMessage("Error while creating the cipher.")
			.throwError();
		}
		return cipher;
	}

	/**
	 * Encrypt a String.
	 * 
	 * @param clear
	 * @return
	 */
	public String dwEncrypt(String clear) {
		String encoded = null;
		var cipher = getCipher(Cipher.ENCRYPT_MODE);

		try {
			var encrypted = cipher.doFinal(clear.getBytes("UTF-8"));
			encoded = dwUrlEncode(encrypted);
		} catch (Exception e) {
			BpmError
			.create(DOCUWARE_ERROR + "encrypterror")
			.withCause(e)
			.withMessage("Error while encrypting.")
			.throwError();
		}

		return encoded;
	}

	/**
	 * Decrypt a String.
	 * 
	 * @param encrypted
	 * @return
	 */
	public String dwDecrypt(String encrypted) {
		String decrypted = null;

		var cipher = getCipher(Cipher.DECRYPT_MODE);

		try {
			var decoded = dwUrlDecode(encrypted);
			var decryptedBytes = cipher.doFinal(decoded);
			decrypted = new String(decryptedBytes, StandardCharsets.UTF_8);
		} catch (Exception e) {
			BpmError
			.create(DOCUWARE_ERROR + "decrypterror")
			.withCause(e)
			.withMessage("Error while decrypting.")
			.throwError();
		}

		return decrypted;
	}


	/**
	 * Get the DocuWare user to use based on the current Ivy user.
	 * 
	 * This is useful for trusted grant type, where this will be used for the impersonateName.
	 * Normal Ivy users will be used with the user-name. Unknown (unauthenticated), system
	 * or developer user will be matched to the fallback username. 
	 * 
	 * @return
	 */
	public String getDocuwareUserBasedOnCurrentUser() {
		var session = Ivy.session();

		String username = null;

		if (session.isSessionUserSystemUser() || session.isSessionUserUnknown()) {
			username = getIvyVar(DocuWareVariable.USERNAME);
		}
		else {
			username = session.getSessionUserName();
			if(ISecurityConstants.DEVELOPER_USER_NAME.equals(username)) {
				username = getIvyVar(DocuWareVariable.USERNAME);
			}
		}
		return username;
	}

	/**
	 * Get the cached token from the grant-type specific store.
	 * 
	 * @return
	 */
	public Token getCachedToken() {
		var key = createKey();
		var store = getGrantTypeStore();
		Token token = null;
		try {
			token = (Token)store.getAttribute(key);
		} catch (Exception e) {
			Ivy.log().error("Could not load token from store {0} with key {1}. Note: in the Designer ClassCaseExecptions can occur on source changes.", e, store, key);
		}
		return token;
	}

	/**
	 * Set the cached token to the grant-type specific store.
	 * 
	 * @param token
	 */
	public void setCachedToken(Token token) {
		var key = createKey();
		var store = getGrantTypeStore();
		store.setAttribute(key, token);
	}

	/**
	 * Get the grant-type specific store.
	 * 
	 * For grant type trusted, the token is stored in the session,
	 * for all others globally in the application.
	 * 
	 * @return
	 */
	private IAttributeStore<Object> getGrantTypeStore() {
		var grantType = DocuWareService.get().getIvyVarGrantType();

		return switch (grantType) {
		case TRUSTED -> Ivy.session();
		default -> IApplication.current();
		};
	}

	private String createKey() {
		return Token.class.getCanonicalName();
	}

	/**
	 * Get a LoginToken based on the current access token.
	 * 
	 * @return
	 */
	public String getLoginTokenString() {
		return getLoginTokenString(null);
	}

	/**
	 * Get a LoginToken based on the access token.
	 * 
	 * @return
	 */
	public String getLoginTokenString(Token token) {
		String loginToken = null;
		Response response = null;
		try {
			response = getLoginTokenResponse(token);

			if (Family.SUCCESSFUL == response.getStatusInfo().getFamily()) {
				loginToken = response.readEntity(String.class);
			}
		} catch (Exception e) {
			BpmError.create(DOCUWARE_ERROR + "logintoken")
			.withCause(e)
			.withMessage("Could not get login token.")
			.throwError();
		}
		return loginToken;
	}

	/**
	 * Get a LoginToken based on the current access token.
	 * 
	 * @return
	 */
	public Response getLoginTokenResponse() {
		return getLoginTokenResponse(null);
	}
	/**
	 * Get a LoginToken based on the access token.
	 * 
	 * @return
	 */
	public Response getLoginTokenResponse(Token token) {
		if(token == null) {
			token = getCachedToken();
		}
		var host = DocuWareService.get().getIvyVar(DocuWareVariable.HOST);
		var client = ClientBuilder.newClient();
		Response response = null;
		try {
			Objects.requireNonNull(token);
			var target = client.target(IdentityServiceContext.buildOrganizationLoginTokenURI(host));
			response = target
					.request(MediaType.APPLICATION_JSON)
					.header(AUTHORIZATION, BEARER + token.accessToken())
					.post(Entity.json(generateLoginTokenBody()));

		} catch (Exception e) {
			BpmError.create(DOCUWARE_ERROR + "logintoken")
			.withCause(e)
			.withMessage("Could not get login token.")
			.throwError();
		}
		return response;
	}

	private String generateLoginTokenBody() {
		return """
				{
				  "TargetProducts": [
				      "PlatformService"
				  ],
				  "Usage": "Multi",
				  "Lifetime": "1.00:00:00"
				}
				""";
	}

	public JsonNode getWebTargetResponseAsJsonNode(URI targetURI) {
		Client client = ClientBuilder.newClient();
		Response response = null;
		try {
			WebTarget target = client.target(targetURI);
			response = target.request(MediaType.APPLICATION_JSON).get();
			if (Family.SUCCESSFUL == response.getStatusInfo().getFamily()) {
				String jsonResponse = response.readEntity(String.class);
				return parseToJsonNode(jsonResponse);
			}
		} catch (Exception e) {
			Ivy.log().error("Error calling URL ''{0}'': status is {1} - {2}", e, targetURI, response != null ? response.getStatus() : null, response);
		} finally {
			if(response != null) {
				response.close();
			}
			if(client != null) {
				client.close();
			}
		}
		return null;
	}

	public DocumentIndexField createDocumentIndexStringField(String fieldName, String item) {
		DocumentIndexField field = new DocumentIndexField();
		field.setFieldName(fieldName);
		field.setString(item);
		return field;
	}

	public DocumentIndexField createDocumentIndexDateField(String fieldName, Date date) {
		DocumentIndexField field = new DocumentIndexField();
		field.setFieldName(fieldName);
		Calendar calendar = GregorianCalendar.getInstance();
		calendar.setTime(date);
		// set
		return field;
	}

	public String dateToString(Date date) {
		String string = null;
		if (date != null) {
			string = String.format("/Date(%d)/", date.getTime());
		}
		return string;
	}

	public Date stringToDate(String dateString) {
		Date date = null;
		if (dateString != null) {
			Matcher matcher = DATE_PATTERN.matcher(dateString);
			if (matcher.matches()) {
				long timestamp = Long.parseLong(matcher.group(1));
				date = new Date(timestamp);
			}
		}
		return date;
	}

	public Document uploadFile(WebTarget target, java.io.File file,
			DocuWareEndpointConfiguration configuration,
			List<DocuWareProperty> properties) throws IOException, DocuWareException {
		byte[] bytes = Files.readAllBytes(file.toPath());
		return uploadStream(target, bytes, file.getName(), configuration, properties);
	}

	public Document uploadStream(WebTarget target, ch.ivyteam.ivy.scripting.objects.List<Byte> fileBytes,
			String fileName, DocuWareEndpointConfiguration configuration, List<DocuWareProperty> properties)
					throws IOException, DocuWareException {
		Byte[] bytes = fileBytes.toArray(new Byte[fileBytes.size()]);
		byte[] byteArray = ArrayUtils.toPrimitive(bytes);
		return uploadStream(target, byteArray, fileName, configuration, properties);
	}

	public Document uploadStream(WebTarget target, byte[] file, String fileName,
			DocuWareEndpointConfiguration configuration, List<DocuWareProperty> properties)
					throws IOException, DocuWareException {
		FormDataMultiPart multipart;
		File propertiesFile = createPropertiesFile(properties);
		try (FormDataMultiPart formDataMultiPart = new FormDataMultiPart()) {
			InputStream streamProperties = new FileInputStream(propertiesFile.getJavaFile());
			StreamDataBodyPart streamPropertiesPart = new StreamDataBodyPart(PROPERTIES_FILE_NAME,
					streamProperties);
			streamPropertiesPart.setMediaType(MediaType.APPLICATION_JSON_TYPE);
			InputStream stream = new ByteArrayInputStream(file);
			StreamDataBodyPart streamPart = new StreamDataBodyPart(fileName, stream);
			multipart = (FormDataMultiPart) formDataMultiPart.bodyPart(streamPropertiesPart);
			multipart.bodyPart(streamPart);
		}
		MediaType contentType = MediaType.MULTIPART_FORM_DATA_TYPE;
		contentType = Boundary.addBoundary(contentType);
		if(StringUtils.isNotBlank(configuration.getStoreDialogId())) {
			target = target.queryParam(STORE_DIALOG_ID, configuration.getStoreDialogId());
		}
		Response response = prepareRestClient(target, configuration).post(Entity.entity(multipart, contentType));
		FileUtils.forceDelete(propertiesFile.getJavaFile());
		Document document = null;
		if (Status.Family.SUCCESSFUL == response.getStatusInfo().getFamily()) {
			document = response.readEntity(Document.class);
		} else {
			DocuWareException exception = handleError(response);
			throw exception;
		}
		response.close();
		return document;
	}

	public InputStream checkInFromFileSystem(WebTarget target, DocuWareCheckInActionParameters params, String fileName, InputStream file) throws IOException {
		InputStream stream = null;

		var checkIn = new ByteArrayInputStream(writeObjectAsJsonBytes(params));

		try (var multiPart = new FormDataMultiPart()) {
			multiPart
			.bodyPart(new StreamDataBodyPart("CheckIn", checkIn, "CheckIn.json", MediaType.APPLICATION_JSON_TYPE))
			.bodyPart(new StreamDataBodyPart("File[]", file, fileName));

			var response = target.request().post(Entity.entity(multiPart, multiPart.getMediaType()));
			if (Status.Family.SUCCESSFUL == response.getStatusInfo().getFamily()) {
				stream = response.readEntity(InputStream.class);
			} else {
				BpmError.create(DOCUWARE_ERROR + "checkin").build();
			}
		} 
		return stream;
	}

	/**
	 * Create check-in parameters.
	 * 
	 * @param checkInReturnDocument
	 * @param comments
	 * @param major
	 * @param minor
	 * @return
	 */
	public DocuWareCheckInActionParameters createCheckInActionParameters(CheckInReturnDocument checkInReturnDocument, String comments, int major, int minor) {
		var params = new DocuWareCheckInActionParameters();
		// params.setCheckInReturnDocument(checkInReturnDocument);
		params.setComments(comments);
		var version = new DocuWareDocumentVersion();
		version.setMajor(major);
		version.setMinor(minor);
		params.setDocumentVersion(version);

		return params;
	}



	public DocuWareException handleError(Response response) {
		String errXml = response.readEntity(String.class);
		String httpStatus = String.valueOf(response.getStatus());
		String msg = "DocuWare Service call failed";
		DocuWareException exception = new DocuWareException(msg, httpStatus);
		try {
			InputStream isr = new ByteArrayInputStream(errXml.getBytes(StandardCharsets.UTF_8));
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			org.w3c.dom.Document doc = db.parse(isr);
			Element element = doc.getDocumentElement();
			if (element != null && element.getNodeName() != null
					&& element.getNodeName().contains(RESPONSE_XML_ERROR_NODE)) {
				for (int n = 0; n < element.getChildNodes().getLength(); n++) {
					Node node = element.getChildNodes().item(n);
					if (node.getNodeName() != null && node.getNodeName().contains(RESPONSE_XML_MESSAGE_NODE)) {
						if (node.getChildNodes() != null) {
							Node child = node.getFirstChild();
							msg = child.getNodeValue();
							exception = new DocuWareException(msg, httpStatus);
						}
					}
				}
			}
		} catch (ParserConfigurationException e) {
		} catch (SAXException e) {
		} catch (IOException e) {
		}
		return exception;
	}

	public String getFilenameFromResponseHeader(Response response) {
		String filename = null;
		if (response != null) {
			String disposition = response.getHeaderString(CONTENT_DISPOSITION);

			try {
				var cd = new ContentDisposition(disposition);
				filename = cd.getFileName(true);
			} catch (ParseException e) {
				BpmError
				.create(DOCUWARE_ERROR + "invalidfilename")
				.withMessage("Could not extract filename of %s header value '%s'".formatted(CONTENT_DISPOSITION, disposition))
				.throwError();
			}
		}
		return filename;
	}

	public File createPropertiesFile(List<DocuWareProperty> properties) throws IOException {
		File propertiesFile = getUniquePropertiesFile();
		DocuWareProperties docuWareproperties = new DocuWareProperties();
		docuWareproperties.setProperties(properties);
		FileUtils.write(propertiesFile.getJavaFile(), serializeProperties(docuWareproperties),
				PROPERTIES_FILE_CHARSET);
		return propertiesFile;
	}

	protected Builder prepareRestClient(WebTarget target, DocuWareEndpointConfiguration configuration) {
		return target.request().header("X-Requested-By", "ivy").header("MIME-Version", "1.0")
				.header("Accept", "application/xml").header("Connection", "keep-alive");
	}

	protected File getUniquePropertiesFile() throws IOException {
		return new File(PROPERTIES_FILE_NAME + UUID.randomUUID().toString() + PROPERTIES_FILE_EXTENSION, true);
	}

	public DocuWareEndpointConfiguration initializeDefaultConfiguration() {
		DocuWareEndpointConfiguration config = new DocuWareEndpointConfiguration();
		config.setFileCabinetId(Ivy.var().get("docuwareConnector_filecabinetid"));
		config.setStoreDialogId(Ivy.var().get("docuwareConnector_storedialogid"));
		return config;
	}

	public DocuWareEndpointConfiguration initializeConfiguration(DocuWareEndpointConfiguration config) {
		DocuWareEndpointConfiguration defaultConfig = initializeDefaultConfiguration();
		if (StringUtils.isBlank(config.getFileCabinetId())) {
			config.setFileCabinetId(defaultConfig.getFileCabinetId());
		}
		if (StringUtils.isBlank(config.getStoreDialogId())) {
			config.setStoreDialogId(defaultConfig.getStoreDialogId());
		}
		return config;
	}

	/**
	 * Serializes {@link DocuWareProperties} to {@link String}
	 *
	 * @param properties
	 * @return
	 * @throws JsonProcessingException
	 */
	public String serializeProperties(DocuWareProperties properties) throws JsonProcessingException {
		return getObjectMapper().setSerializationInclusion(Include.NON_NULL).writeValueAsString(properties);
	}

	/**
	 * Serializes {@link DocuWarePropertiesUpdate} to {@link String}
	 *
	 * @param properties
	 * @return
	 * @throws JsonProcessingException
	 */
	public String serializeProperties(DocuWarePropertiesUpdate properties) throws JsonProcessingException {
		return getObjectMapper().setSerializationInclusion(Include.NON_NULL).writeValueAsString(properties);
	}

	/**
	 * Registers the timeModule within the class loader
	 *
	 * @return
	 */
	protected Module timeModule() {
		try {
			return (Module) StringUtil.class.getClassLoader()
					.loadClass("com.fasterxml.jackson.datatype.jsr310.JavaTimeModule").getDeclaredConstructor().newInstance();
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException | ClassNotFoundException e) {
			throw new RuntimeException("JSR time module not available", e);
		}
	}

	public String writeObjectAsJson(Object entity) {
		try {
			return getObjectMapper().writeValueAsString(entity);
		} catch (JsonProcessingException e) {
			Ivy.log().warn(e.getMessage());
		}
		return null;
	}

	public byte[] writeObjectAsJsonBytes(Object entity) {
		try {
			return getObjectMapper().writeValueAsBytes(entity);
		} catch (JsonProcessingException e) {
			Ivy.log().warn(e.getMessage());
		}
		return null;
	}

	public <T> T convertJsonToObject(String json, Class<T> objectType) {
		if (StringUtils.isEmpty(json)) {
			return null;
		}
		try {
			return getObjectMapper().readValue(json, objectType);
		} catch (JsonProcessingException e) {
			Ivy.log().warn(e.getMessage());
		}
		return null;
	}

	public ObjectMapper getObjectMapper() {
		if (objectMapper == null) {
			objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			Module timeModule = timeModule();
			objectMapper.registerModule(timeModule);
			objectMapper.registerModule(new com.fasterxml.jackson.datatype.jsr310.JavaTimeModule());
			objectMapper.configure(DeserializationFeature.READ_DATE_TIMESTAMPS_AS_NANOSECONDS, false);
			objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
			objectMapper.setSerializationInclusion(Include.NON_NULL);
		}
		return objectMapper;
	}


	protected JsonNode parseToJsonNode(String value) {
		try {
			var jsonNode = getObjectMapper().readTree(value);
			Ivy.log().info("JSON Response: " + jsonNode.toPrettyString());
			return jsonNode;
		} catch (Exception e) {
			Ivy.log().error(e);
		}
		return null;
	}

}
