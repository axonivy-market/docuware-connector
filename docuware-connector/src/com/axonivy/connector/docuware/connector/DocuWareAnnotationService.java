package com.axonivy.connector.docuware.connector;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;

/**
 * Service class for Annotation/Stamp operator
 */
public class DocuWareAnnotationService {
	protected static final DocuWareAnnotationService INSTANCE = new DocuWareAnnotationService();
	
	public static DocuWareAnnotationService get() {
		return INSTANCE;
	}

	public String stampRequestBody(String stampId, List<String> stampValues) throws JsonProcessingException {
		String [] fieldValues = stampValues.toArray(new String[0]);
		DocuWareAnnotationUpdate request = DocuWareAnnotationUpdate.ofStamp(
		        0,          // PageNumber
		        0,          // SectionNumber
		        stampId,    // StampId
		        1,          // Layer
		        fieldValues // Field <#1> value, Field <#2> value, .. 
		);
		
		return JsonUtils.getObjectMapper().writeValueAsString(request);
	}
}
