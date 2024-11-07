package com.axonivy.connector.docuware.connector.auth.oauth;

import static com.axonivy.connector.docuware.connector.utils.DocuWareUtils.getIvyVar;

import java.net.URI;
import java.util.Objects;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.axonivy.connector.docuware.connector.enums.DocuWareVariable;
import com.axonivy.connector.docuware.connector.utils.DocuWareUtils;
import com.fasterxml.jackson.databind.JsonNode;

import ch.ivyteam.ivy.environment.Ivy;

public class IdentityServiceContext {

	public static String fetchIdentityServiceUrl() {
		var identityServiceInfo = UriBuilder.fromPath("https://").path(getIvyVar(DocuWareVariable.HOST))
				.path(getIvyVar(DocuWareVariable.PLATFORM)).path("Home/IdentityServiceInfo").build();
		var response = getTargetResponseAsJsonNode(identityServiceInfo);
		return Objects.nonNull(response) ? response.get("IdentityServiceUrl").asText() : "";
	}

	private static JsonNode getTargetResponseAsJsonNode(URI targetURI) {
		JsonNode result = null;
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(targetURI);
		Response response = target.request(MediaType.APPLICATION_JSON).get();
		if (response.getStatus() == 200) {
			String jsonResponse = response.readEntity(String.class);
			result = DocuWareUtils.parseToJsonNode(jsonResponse);
		} else {
			Ivy.log().error("Error: " + response.getStatus());
		}
		response.close();
		client.close();
		return result;
	}

	public static String fetchTokenEndpointUrl() {
		String identityServiceUrl = fetchIdentityServiceUrl();
		var openidConfiguration = UriBuilder.fromPath(identityServiceUrl).path(".well-known/openid-configuration")
				.build();
		var response = getTargetResponseAsJsonNode(openidConfiguration);
		return Objects.nonNull(response) ? response.get("token_endpoint").asText() : "";
	}

	public static String fetchDWToken() {
		///Organization/LoginToken
		var LoginToken = UriBuilder.fromPath("https://").path(getIvyVar(DocuWareVariable.HOST))
				.path(getIvyVar(DocuWareVariable.PLATFORM)).path("Organization/LoginToken").build();
		JsonNode result = null;
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(LoginToken);
		Response response = target.request(MediaType.APPLICATION_JSON).post(Entity.json("""
								{
				    "TargetProducts": [
				        "PlatformService"
				    ],
				    "Usage": "Multi",
				    "Lifetime": "1.00:00:00"
				}
								"""));
		if (response.getStatus() == 200) {
			String jsonResponse = response.readEntity(String.class);
		} else {
			Ivy.log().error("Error: " + response.getStatus());
		}
		response.close();
		client.close();
		return Objects.nonNull(response) ? result.get("IdentityServiceUrl").asText() : "";
	}
}
