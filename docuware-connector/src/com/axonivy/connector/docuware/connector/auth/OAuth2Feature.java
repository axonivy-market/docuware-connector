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
    String HOST = "PATH.host";
    String USERNAME = "UserName";
    String PASSWORD = "Password";
    String CLIENT_ID = "docuware.platform.net.client";
    String SCOPE = "docuware.platform";
    String AUTH_BASE_URI = "AUTH.baseUri";
  }

  @Override
  public boolean configure(FeatureContext context) {
    var config = new FeatureConfig(context.getConfiguration(), OAuth2Feature.class);
    var identityServiceContext = new IdentityServiceContext(config);
    var docuWareTokenEndpoint = new OAuth2UriProperty(config, Property.AUTH_BASE_URI,
        identityServiceContext.identifyTokenEndpointUrl());
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
  protected static Response requestToken(AuthContext ctxt, OAuth2UriProperty uriFactory) {
    MultivaluedMap<String, String> paramsMap = new MultivaluedHashMap<>();
    GrantType grantType = ctxt.grantType().orElse(GrantType.PASSWORD);
    switch (grantType) {
    case PASSWORD:
      var username = ctxt.config.readMandatory(Property.USERNAME);
      var password = ctxt.config.readMandatory(Property.PASSWORD);
      AccessTokenByPasswordRequest passwordRequest = new AccessTokenByPasswordRequest(username, password);
      paramsMap = passwordRequest.paramsMap();
      break;
    case TRUSTED:
      AccessTokenByTrustedRequest trustedRequest = new AccessTokenByTrustedRequest();
      paramsMap = trustedRequest.paramsMap();
      break;
    default:
      break;
    }
    return ctxt.target.request().post(Entity.form(paramsMap));
  }

  public static class AccessTokenByPasswordRequest {
    String username;
    String password;

    public AccessTokenByPasswordRequest(String username, String password) {
      this.username = username;
      this.password = password;
    }

    public MultivaluedMap<String, String> paramsMap() {
      MultivaluedMap<String, String> values = new MultivaluedHashMap<>();
      values.put(Constants.ACCESS_TOKEN_REQUEST_GRANT_TYPE, List.of(GrantType.PASSWORD.getCode()));
      values.put(Constants.ACCESS_TOKEN_REQUEST_SCOPE, List.of(Property.SCOPE));
      values.put(Constants.ACCESS_TOKEN_REQUEST_CLIENT_ID, List.of(Property.CLIENT_ID));
      values.put(Constants.USERNAME, List.of(this.username));
      values.put(Constants.PASSWORD, List.of(this.password));
      return values;
    }
  }

  public static class AccessTokenByTrustedRequest {

    public AccessTokenByTrustedRequest() {
    }

    public MultivaluedMap<String, String> paramsMap() {
      MultivaluedMap<String, String> values = new MultivaluedHashMap<>();
      values.put(Constants.ACCESS_TOKEN_REQUEST_GRANT_TYPE, List.of(GrantType.PASSWORD.getCode()));
      values.put(Constants.ACCESS_TOKEN_REQUEST_SCOPE, List.of(Property.SCOPE));
      values.put(Constants.ACCESS_TOKEN_REQUEST_CLIENT_ID, List.of(Property.CLIENT_ID));
      values.put(Constants.ACCESS_TOKEN_REQUEST_IMPERSONATE_NAME, List.of(getIvyVar(DocuWareVariable.USERNAME)));
      values.put(Constants.USERNAME, List.of(getIvyVar(DocuWareVariable.TRUSTED_USERNAME)));
      values.put(Constants.PASSWORD, List.of(getIvyVar(DocuWareVariable.TRUSTED_USER_PASSWORD)));
      return values;
    }
  }
}