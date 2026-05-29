package com.axonivy.connector.docuware.connector;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;

/**
 * Service class for Annotation/Stamp operator
 */
public class DocuWareAnnotationService {
	protected static final DocuWareAnnotationService INSTANCE = new DocuWareAnnotationService();

	private static final int DEFAULT_PAGE_NUMBER = 0;
	private static final int DEFAULT_SECTION_NUMBER = 0;
	private static final int DEFAULT_LAYER = 1;

	public static DocuWareAnnotationService get() {
		return INSTANCE;
	}

	public String stampRequestBody(String stampId, List<String> stampValues) throws JsonProcessingException {
		return stampRequestBody(stampId, stampValues, (String) null);
	}

	public String stampRequestBody(String stampId, List<String> stampValues, String stampPassword)
	        throws JsonProcessingException {
		return stampRequestBody(stampId, stampValues, stampPassword, DEFAULT_PAGE_NUMBER, DEFAULT_SECTION_NUMBER,
		        DEFAULT_LAYER);
	}

	public String stampRequestBody(String stampId, List<String> stampValues, int pageNumber, int sectionNumber,
	        int layer) throws JsonProcessingException {
		return stampRequestBody(stampId, stampValues, null, pageNumber, sectionNumber, layer);
	}

	public String stampRequestBody(String stampId, List<String> stampValues, String stampPassword, int pageNumber,
	        int sectionNumber, int layer) throws JsonProcessingException {
		String [] fieldValues = stampValues.toArray(new String[0]);
		DocuWareAnnotationUpdate request = DocuWareAnnotationUpdate.ofStamp(
		        pageNumber,    // PageNumber
		        sectionNumber, // SectionNumber
		        stampId,       // StampId
		        layer,         // Layer
		        stampPassword, // Password
		        fieldValues    // Field <#1> value, Field <#2> value, ..
		);

		return JsonUtils.getObjectMapper().writeValueAsString(request);
	}
}
