package com.axonivy.connector.docuware.connector;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

public final class JsonUtils {
	private static volatile ObjectMapper objectMapper;

	private JsonUtils() {
	}

	/**
	 * Get an object mapper to convert JSON parts.
	 * 
	 * @return
	 */
	public static ObjectMapper getObjectMapper() {
		if (objectMapper == null) {
			synchronized (JsonUtils.class) {
				if (objectMapper == null) {
					objectMapper = JsonMapper.builder().addModule(new JavaTimeModule())
							.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
							.configure(DeserializationFeature.READ_DATE_TIMESTAMPS_AS_NANOSECONDS, false)
							.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false)
							.defaultPropertyInclusion(JsonInclude.Value.construct(JsonInclude.Include.NON_NULL,
									JsonInclude.Include.NON_NULL))
							.build();
				}
			}
		}
		return objectMapper;
	}
}