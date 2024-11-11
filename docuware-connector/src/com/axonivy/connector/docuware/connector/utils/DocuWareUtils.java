package com.axonivy.connector.docuware.connector.utils;

import com.axonivy.connector.docuware.connector.enums.DocuWareVariable;

import ch.ivyteam.ivy.environment.Ivy;

public class DocuWareUtils {

  private DocuWareUtils() { }

  public static String getIvyVar(DocuWareVariable variable) {
    return Ivy.var().get(variable.getVariableName());
  }

}
