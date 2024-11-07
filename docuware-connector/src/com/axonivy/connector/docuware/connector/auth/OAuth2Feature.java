package com.axonivy.connector.docuware.connector.auth;

import static com.axonivy.connector.docuware.connector.utils.DocuWareUtils.getIvyVar;

import java.util.List;

import javax.ws.rs.Priorities;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Feature;
import javax.ws.rs.core.FeatureContext;
import javax.ws.rs.core.MultivaluedHashMap;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;

import org.apache.commons.lang3.StringUtils;

import com.axonivy.connector.docuware.connector.auth.oauth.IdentityServiceContext;
import com.axonivy.connector.docuware.connector.auth.oauth.OAuth2BearerFilter;
import com.axonivy.connector.docuware.connector.auth.oauth.OAuth2TokenRequester.AuthContext;
import com.axonivy.connector.docuware.connector.auth.oauth.OAuth2UriProperty;
import com.axonivy.connector.docuware.connector.constant.Constants;
import com.axonivy.connector.docuware.connector.enums.DocuWareVariable;
import com.axonivy.connector.docuware.connector.enums.GrantType;

import ch.ivyteam.ivy.rest.client.FeatureConfig;

public class OAuth2Feature implements Feature {

	public static interface Property {
		String CLIENT_ID = "AUTH.clientId";
		String CLIENT_SECRET = "AUTH.clientSecret";
		String AUTHORIZATION_CODE = "AUTH.code";
		String SCOPE = "AUTH.scope";
		String AUTH_BASE_URI = "AUTH.baseUri";
		String AUTH_INTEGRATION_KEY = "AUTH.integrationKey";
	}

	public static final String SESSION_TOKEN = "adobe.authCode";

	@Override
	public boolean configure(FeatureContext context) {
		var config = new FeatureConfig(context.getConfiguration(), OAuth2Feature.class);
	
		String baseUriPropertyName = Property.AUTH_BASE_URI;
		String defaultBaseUri = IdentityServiceContext.fetchTokenEndpointUrl();

		var docuWareTokenEndpoint = new OAuth2UriProperty(config, baseUriPropertyName, defaultBaseUri);
		var oauth2 = new OAuth2BearerFilter(ctxt -> requestToken(ctxt, docuWareTokenEndpoint), docuWareTokenEndpoint);
		context.register(oauth2, Priorities.AUTHORIZATION);

		return true;
	}

	/**
	 * Get token.
	 *
	 * @param ctxt
	 * @param uriFactory
	 */
	private static Response requestToken(AuthContext ctxt, OAuth2UriProperty uriFactory) {
		MultivaluedMap<String, String> paramsMap = null;
		GrantType grantType = ctxt.grantType().orElse(GrantType.PASSWORD);
		if (GrantType.PASSWORD == grantType) {
			AccessTokenByPasswordRequest authRequest = new AccessTokenByPasswordRequest();
			paramsMap = authRequest.paramsMap();
		} else {
			AccessTokenByDWTokenRequest authRequest = new AccessTokenByDWTokenRequest();
		}
		return ctxt.target.request().post(Entity.form(paramsMap));
	}

	public static class AccessTokenByPasswordRequest {
		public String clientId;
		public String scope;

		public AccessTokenByPasswordRequest() {
			this.clientId = "docuware.platform.net.client";
			this.scope = "docuware.platform";
		}

		public MultivaluedMap<String, String> paramsMap() {
			MultivaluedMap<String, String> values = new MultivaluedHashMap<>();
			values.put(Constants.ACCESS_TOKEN_REQUEST_GRANT_TYPE, List.of(GrantType.PASSWORD.getCode()));
			values.put(Constants.ACCESS_TOKEN_REQUEST_SCOPE, List.of(scope));
			values.put(Constants.ACCESS_TOKEN_REQUEST_CLIENT_ID, List.of(clientId));
			return values;
		}
	}
	
	public static class AccessTokenByDWTokenRequest {

		public String clientId;
		public String scope;

		public AccessTokenByDWTokenRequest() {
			this.clientId = "docuware.platform.net.client";
			this.scope = "docuware.platform";
		}

		public MultivaluedMap<String, String> paramsMap() {
			MultivaluedMap<String, String> values = new MultivaluedHashMap<>();
			values.put(Constants.ACCESS_TOKEN_REQUEST_GRANT_TYPE, List.of(GrantType.DW_TOKEN.getCode()));
			values.put(Constants.ACCESS_TOKEN_REQUEST_SCOPE, List.of(scope));
			values.put(Constants.ACCESS_TOKEN_REQUEST_CLIENT_ID, List.of(clientId));
			return values;
		}
	}

	static String getScope(FeatureConfig config) {
		return config.read(Property.SCOPE).orElse("signature impersonation");
	}

}