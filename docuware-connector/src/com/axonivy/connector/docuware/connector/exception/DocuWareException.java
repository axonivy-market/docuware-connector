package com.axonivy.connector.docuware.connector.exception;

import ch.ivyteam.ivy.bpm.error.BpmError;

public class DocuWareException extends RuntimeException {

  private static final long serialVersionUID = 1154880703799063664L;
  public static String OAUTH2_ERROR_CODE = "ivy:error:rest:client:oauth2";

  public DocuWareException(String message, Throwable cause) {
    super(message, cause);
  }

  public DocuWareException(String message) {
    BpmError.create(OAUTH2_ERROR_CODE).withMessage(message).throwError();
  }

}
