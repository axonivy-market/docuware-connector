package com.axonivy.connector.docuware.connector.managedbean;

import static com.axonivy.connector.docuware.connector.auth.oauth.OAuth2BearerFilter.AUTHORIZATION;
import static com.axonivy.connector.docuware.connector.auth.oauth.OAuth2BearerFilter.BEARER;

import java.net.URI;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status.Family;

import com.axonivy.connector.docuware.connector.auth.OAuth2Feature.AccessTokenByPasswordRequest;
import com.axonivy.connector.docuware.connector.auth.oauth.IdentityServiceContext;
import com.axonivy.connector.docuware.connector.auth.oauth.Token;
import com.axonivy.connector.docuware.connector.enums.DocuWareVariable;
import com.axonivy.connector.docuware.connector.utils.DocuWareUtils;
import com.fasterxml.jackson.databind.JsonNode;

import ch.ivyteam.ivy.environment.Ivy;

@ManagedBean
@ViewScoped
public class RequestLoginTokenBean {

  private String host;
  private String username;
  private String password;
  private String loginToken;

  @PostConstruct
  public void init() {
    host = DocuWareUtils.getIvyVar(DocuWareVariable.HOST);
  }

  public void requestNewLoginToken() {
    Objects.requireNonNull(username);
    Objects.requireNonNull(password);

    Token token = generateNewIdentityToken();

    Client client = ClientBuilder.newClient();
    var target = client.target(IdentityServiceContext.buildOrganizationLoginTokenURI(host));
    Response response = target.request(MediaType.APPLICATION_JSON).header(AUTHORIZATION, BEARER + token.accessToken())
        .post(Entity.json(DocuWareUtils.generateLoginTokenBody()));

    if (Family.SUCCESSFUL == response.getStatusInfo().getFamily()) {
      loginToken = response.readEntity(String.class);
      FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO,
          Ivy.cms().co("/Dialogs/com/axonivy/market/docuware/connector/RequestLoginToken/GotLoginToken"),
          Ivy.cms().co("/Dialogs/com/axonivy/market/docuware/connector/RequestLoginToken/GotLoginTokenMessage"));
      FacesContext.getCurrentInstance().addMessage(null, message);
      DocuWareUtils.setIvyVar(DocuWareVariable.LOGIN_TOKEN, loginToken);
    }
    response.close();
    client.close();
  }

  public Token generateNewIdentityToken() {
    String tokenEndpointUrl = identifyTokenEndpointUrl();

    GenericType<Map<String, Object>> map = new GenericType<>(Map.class);
    AccessTokenByPasswordRequest passwordRequest = new AccessTokenByPasswordRequest(username, password);
    var paramsMap = passwordRequest.paramsMap();

    Client client = ClientBuilder.newClient();
    WebTarget target = client.target(tokenEndpointUrl);
    Response postResponse = target.request(MediaType.APPLICATION_JSON).post(Entity.form(paramsMap));
    Token token = null;
    if (Family.SUCCESSFUL == postResponse.getStatusInfo().getFamily()) {
      token = new Token(postResponse.readEntity(map));
    }
    postResponse.close();
    client.close();
    return token;
  }

  public String identifyTokenEndpointUrl() {
    URI identityServiceInfoURI = IdentityServiceContext.buildIdentityServiceInfoURI(host);
    JsonNode jsonData = DocuWareUtils.getWebTargetResponseAsJsonNode(identityServiceInfoURI);
    String identityURL = Optional.ofNullable(jsonData).map(IdentityServiceContext.extractIdentityServiceProperty())
        .orElse(null);

    URI openIdConfigURI = IdentityServiceContext.buildOpenIdConfigurationURI(identityURL);
    jsonData = DocuWareUtils.getWebTargetResponseAsJsonNode(openIdConfigURI);
    return Optional.ofNullable(jsonData).map(IdentityServiceContext.extractTokenEndpointProperty()).orElse(null);
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getLoginToken() {
    return loginToken;
  }

  public void setLoginToken(String loginToken) {
    this.loginToken = loginToken;
  }

}
