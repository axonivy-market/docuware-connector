package com.axonivy.connector.docuware.connector.utils;

import com.axonivy.connector.docuware.connector.enums.DocuWareVariable;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import ch.ivyteam.ivy.environment.Ivy;

public class DocuWareUtils {

	private static ObjectMapper objectMapper = new ObjectMapper();

	private DocuWareUtils() {
	}

	public static String getIvyVar(DocuWareVariable variable) {
		return Ivy.var().get(variable.getVariableName());
	}

	public static JsonNode parseToJsonNode(String value) {
		try {
			var jsonNode = objectMapper.readTree(value);
			Ivy.log().info("JSON Response: " + jsonNode.toPrettyString());
			return jsonNode;

		} catch (Exception e) {
			Ivy.log().error(e);
		}
		return null;
	}
}
