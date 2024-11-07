package com.axonivy.connector.docuware.connector.auth;

import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import ch.ivyteam.ivy.environment.Ivy;

public class JacksonUtils {
	private static ObjectMapper objectMapper;

	public static String writeObjectAsJson(Object entity) {
		try {
			return getObjectMapper().writeValueAsString(entity);
		} catch (JsonProcessingException e) {
			Ivy.log().warn(e.getMessage());
		}
		return null;
	}

	public static <T> T convertJsonToObject(String json, Class<T> objectType) {
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

	public static ObjectMapper getObjectMapper() {
		if (objectMapper == null) {
			objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			objectMapper.registerModule(new com.fasterxml.jackson.datatype.jsr310.JavaTimeModule());
			objectMapper.configure(DeserializationFeature.READ_DATE_TIMESTAMPS_AS_NANOSECONDS, false);
			objectMapper.setSerializationInclusion(Include.NON_NULL);
		}
		return objectMapper;
	}
}
