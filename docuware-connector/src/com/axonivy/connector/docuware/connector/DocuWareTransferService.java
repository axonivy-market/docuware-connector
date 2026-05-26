package com.axonivy.connector.docuware.connector;

import com.docuware.dev.schema._public.services.platform.FileCabinetTransferInfo;
import com.fasterxml.jackson.core.JsonProcessingException;

import ch.ivyteam.ivy.bpm.error.BpmError;

/**
 * Service class for document transfer operator
 */
public class DocuWareTransferService {
	protected static final DocuWareTransferService INSTANCE = new DocuWareTransferService();
	
	public static DocuWareTransferService get() {
		return INSTANCE;
	}

	/**
	 * move document from sourceFileCabinet 
	 * @param sourceFileCabinetId
	 * @param sourceDocumentId
	 * @return
	 * @throws JsonProcessingException
	 */
	public String moveDocumentRequestBody(String sourceFileCabinetId, String sourceDocumentId) throws JsonProcessingException {
		int sourceDocId = 0;
		try {
			sourceDocId = Integer.parseInt(sourceDocumentId);
		} catch (Exception e) {
			BpmError
			.create(DocuWareService.DOCUWARE_ERROR + "invalidSourceDocumentId")
			.withMessage("Could not parse sourceDocumentId '%s'".formatted(sourceDocumentId))
			.throwError();
		}
		FileCabinetTransferInfo request = new FileCabinetTransferInfo();
		request.setSourceFileCabinetId(sourceFileCabinetId);
		request.getSourceDocId().add(sourceDocId);
		request.setFillIntellix(false);
		request.setKeepSource(false);
		return JsonUtils.getObjectMapper().writeValueAsString(request);
	}
}
