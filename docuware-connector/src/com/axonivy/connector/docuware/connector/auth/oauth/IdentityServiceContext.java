package com.axonivy.connector.docuware.connector.auth.oauth;

import static org.apache.commons.lang3.StringUtils.EMPTY;

import java.net.URI;
import java.util.Objects;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import org.apache.http.HttpStatus;

import com.axonivy.connector.docuware.connector.auth.OAuth2Feature.Property;
import com.axonivy.connector.docuware.connector.utils.JsonUtils;
import com.fasterxml.jackson.databind.JsonNode;

import ch.ivyteam.ivy.environment.Ivy;
import ch.ivyteam.ivy.rest.client.FeatureConfig;

public class IdentityServiceContext {

  private static final String HTTPS_PROTOCOL = "https://";
  private static final String IDENTITY_SERVICE_INFO_URL = "Home/IdentityServiceInfo";
  private static final String OPEN_ID_CONFIGURATION_URL = ".well-known/openid-configuration";
  private static final String DEFAULT_PLATFORM = "docuware/platform";

  public final FeatureConfig config;

  public IdentityServiceContext(FeatureConfig featureConfig) {
    this.config = featureConfig;
  }

  private String fetchIdentityServiceUrl() {
    var docuWareHost = config.readMandatory(Property.HOST);
    var identityServiceInfoURL = UriBuilder.fromPath(HTTPS_PROTOCOL).path(docuWareHost).path(DEFAULT_PLATFORM)
        .path(IDENTITY_SERVICE_INFO_URL).build();
    JsonNode jsonResponse = getTargetResponseAsJsonNode(identityServiceInfoURL);
    return Objects.nonNull(jsonResponse)
        ? jsonResponse.get(IdentityServiceProperty.IDENTITY_SERVICE_PROPERTY.field).asText()
        : EMPTY;
  }

  private static JsonNode getTargetResponseAsJsonNode(URI targetURI) {
    JsonNode jsonData = null;
    Client client = ClientBuilder.newClient();
    WebTarget target = client.target(targetURI);
    Response response = target.request(MediaType.APPLICATION_JSON).get();
    if (response != null && HttpStatus.SC_OK == response.getStatus()) {
      String jsonResponse = response.readEntity(String.class);
      jsonData = JsonUtils.parseToJsonNode(jsonResponse);
    } else {
      Ivy.log().error("Error: status is {0} - {1}", response.getStatus(), response);
    }
    response.close();
    client.close();
    return jsonData;
  }

  public String identifyTokenEndpointUrl() {
    String identityServiceUrl = fetchIdentityServiceUrl();
    var openidConfiguration = UriBuilder.fromPath(identityServiceUrl).path(OPEN_ID_CONFIGURATION_URL).build();
    JsonNode jsonResponse = getTargetResponseAsJsonNode(openidConfiguration);
    return Objects.nonNull(jsonResponse) ? jsonResponse.get(IdentityServiceProperty.TOKEN_ENDPOINT.field).asText()
        : EMPTY;
  }

  public enum IdentityServiceProperty {
    IDENTITY_SERVICE_PROPERTY("IdentityServiceUrl"), TOKEN_ENDPOINT("token_endpoint");

    public String field;

    private IdentityServiceProperty(String field) {
      this.field = field;
    }
  }
}
