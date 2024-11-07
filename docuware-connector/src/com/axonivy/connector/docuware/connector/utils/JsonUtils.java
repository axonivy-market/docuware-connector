package com.axonivy.connector.docuware.connector.utils;


import java.lang.reflect.InvocationTargetException;

import com.axonivy.connector.docuware.connector.DocuWareProperties;
import com.axonivy.connector.docuware.connector.DocuWarePropertiesUpdate;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import ch.ivyteam.ivy.environment.Ivy;
import ch.ivyteam.util.StringUtil;

/**
 * Provides utilities related to json serialization like building an ObjectMapper with all required options and features.
 *
 * @author jpl
 *
 */
public class JsonUtils {
	/**
	 * Builds and returns an {@link ObjectMapper} with all required features and options required in the NScale interface.
	 *
	 * @return
	 */
	public static ObjectMapper buildObjectMapper() {
		ObjectMapper mapper = new ObjectMapper();

		Module timeModule = timeModule();
		mapper.registerModule(timeModule);

		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		mapper.configure(DeserializationFeature.READ_DATE_TIMESTAMPS_AS_NANOSECONDS, false);
		mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
		mapper.setSerializationInclusion(Include.NON_NULL);

		return mapper;
	}

	/**
	 * Serializes {@link DocuWareProperties} to {@link String}
	 *
	 * @param properties
	 * @return
	 * @throws JsonProcessingException
	 */
	public static String serializeProperties(DocuWareProperties properties) throws JsonProcessingException {
		String result;
		result = JsonUtils.buildObjectMapper().setSerializationInclusion(Include.NON_NULL).writeValueAsString(properties);

		return result;
	}
	
	/**
	 * Serializes {@link DocuWarePropertiesUpdate} to {@link String}
	 *
	 * @param properties
	 * @return
	 * @throws JsonProcessingException
	 */
	public static String serializeProperties(DocuWarePropertiesUpdate properties) throws JsonProcessingException {
		String result;
		result = JsonUtils.buildObjectMapper().setSerializationInclusion(Include.NON_NULL).writeValueAsString(properties);

		return result;
	}
	

	/**
	 * Registers the timeModule within the class loader
	 *
	 * @return
	 */
	private static Module timeModule() {
		try {
			return (Module) StringUtil.class.getClassLoader().loadClass("com.fasterxml.jackson.datatype.jsr310.JavaTimeModule")
					.getDeclaredConstructor().newInstance();
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException | NoSuchMethodException | SecurityException
				| ClassNotFoundException e) {
			throw new RuntimeException("JSR time module not available", e);
		}
	}

	public static String writeObjectAsJson(Object entity) {
		try {
			return JsonUtils.buildObjectMapper().writeValueAsString(entity);
		} catch (JsonProcessingException e) {
			Ivy.log().warn(e.getMessage());
		}
		return null;
	}
}
