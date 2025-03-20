package com.axonivy.connector.docuware.connector.utils;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status.Family;

import org.apache.commons.lang3.math.NumberUtils;

import com.axonivy.connector.docuware.connector.DocuWareEndpointConfiguration;
import com.axonivy.connector.docuware.connector.enums.DocuWareVariable;
import com.axonivy.connector.docuware.connector.enums.GrantType;
import com.fasterxml.jackson.databind.JsonNode;

import ch.ivyteam.ivy.environment.Ivy;
import ch.ivyteam.ivy.vars.Variable;
import ch.ivyteam.ivy.vars.Variables;

public class DocuWareUtils {

  private static final String INSTANCES = "instances";
  private static final String INSTANCE_VAR_PATTERN = DocuWareVariable.ROOT.variableKey + "." + INSTANCES + ".%s.%s";

  private DocuWareUtils() { }

  public static String getIvyVar(DocuWareVariable variable) {
    return Ivy.var().get(variable.getVariableName());
  }

  public static String setIvyVar(DocuWareVariable variable, String value) {
    return Ivy.var().set(variable.getVariableName(), value);
  }

  public static JsonNode getWebTargetResponseAsJsonNode(URI targetURI) {
    Client client = ClientBuilder.newClient();
    Response response = null;
    try {
      WebTarget target = client.target(targetURI);
      response = target.request(MediaType.APPLICATION_JSON).get();
      if (Family.SUCCESSFUL == response.getStatusInfo().getFamily()) {
        String jsonResponse = response.readEntity(String.class);
        return JsonUtils.parseToJsonNode(jsonResponse);
      }
    } catch (Exception e) {
      Ivy.log().error("Error: status is {0} - {1}", response.getStatus(), response);
    } finally {
      response.close();
      client.close();
    }
    return null;
  }

  public static String generateLoginTokenBody() {
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

  public static Map<String, Variable> extractVariableByName(DocuWareVariable docuWareVariable) {
    Map<String, Variable> docuWareVariables = new HashMap<>();
    for (var variable : Variables.current().all().stream().sorted((v1, v2) -> v1.name().compareTo(v2.name())).toList()) {
      String variableName = variable.name();
      if (variableName.startsWith(DocuWareVariable.ROOT.variableKey)) {
        // The expected value should be docuwareConnector.instances.key or docuwareConnector.key for old structure
        var variableNameArrays = variableName.split("\\.");
        DocuWareVariable docuWareVar = null;
        if (variableName.contains(INSTANCES)) {
          docuWareVar = DocuWareVariable.of(variableNameArrays[3]);
          if (docuWareVar == docuWareVariable) {
            docuWareVariables.put(variableNameArrays[2], variable);
          }
        } else {
          // For old variables
          docuWareVar = DocuWareVariable.of(variableNameArrays[1]);
          if (docuWareVar == docuWareVariable) {
            docuWareVariables.put(variableNameArrays[1], variable);
          }
        }
      }
    }
    return docuWareVariables;
  }

  public static DocuWareEndpointConfiguration getDefaultInstance() {
    var defaultInstanceName = Ivy.var().get(DocuWareVariable.DEFAULT_INSTANCE.getVariableName());
    return extractVariableByInstanceName(defaultInstanceName);
  }

  public static DocuWareEndpointConfiguration extractVariableByInstanceName(String instanceName) {
    var config = new DocuWareEndpointConfiguration();
    for (var docuVar : DocuWareVariable.values()) {
      getInstanceConfiguration(config, instanceName, docuVar);
    }
    return config;
  }

  public static DocuWareEndpointConfiguration getInstanceConfiguration(DocuWareEndpointConfiguration config,
      String instanceName, DocuWareVariable variable) {
    if (config == null) {
      config = new DocuWareEndpointConfiguration();
    }
    switch (variable) {
    case HOST:
      config.setHost(getVariableValueByInstance(instanceName, DocuWareVariable.HOST));
      break;
    case GRANT_TYPE:
      String grantType = getVariableValueByInstance(instanceName, DocuWareVariable.GRANT_TYPE);
      config.setGrantType(GrantType.of(grantType));
      break;
    case USERNAME:
      config.setUsername(getVariableValueByInstance(instanceName, DocuWareVariable.USERNAME));
      break;
    case PASSWORD:
      config.setPassword(getVariableValueByInstance(instanceName, DocuWareVariable.PASSWORD));
      break;
    case CONNECT_TIMEOUT:
      String connectTimeout = getVariableValueByInstance(instanceName, DocuWareVariable.CONNECT_TIMEOUT);
      config.setConnectTimeout(NumberUtils.isCreatable(connectTimeout) ? NumberUtils.toInt(connectTimeout) : 0);
      break;
    case TRUSTED_USERNAME:
      config.setTrustedUserName(getVariableValueByInstance(instanceName, DocuWareVariable.TRUSTED_USERNAME));
      break;
    case TRUSTED_USER_PASSWORD:
      config.setTrustedUserPassword(getVariableValueByInstance(instanceName, DocuWareVariable.TRUSTED_USER_PASSWORD));
      break;
    case ACCESS_TOKEN:
      config.setAccessToken(getVariableValueByInstance(instanceName, DocuWareVariable.ACCESS_TOKEN));
      break;
    case FILE_CABINET_ID:
      config.setFileCabinetId(getVariableValueByInstance(instanceName, DocuWareVariable.FILE_CABINET_ID));
      break;
    case LOGIN_TOKEN:
      config.setLoginToken(getVariableValueByInstance(instanceName, DocuWareVariable.LOGIN_TOKEN));
      break;
    default:
      break;
    }
    return config;
  }

  public static String getVariableValueByInstance(String instanceName, DocuWareVariable variable) {
    return Ivy.var().get(String.format(INSTANCE_VAR_PATTERN, instanceName, variable.variableKey));
  }

  public static void updateVariable(DocuWareVariable variable, String value) {
    Ivy.var().set(variable.getVariableName(), value);
  }
}
