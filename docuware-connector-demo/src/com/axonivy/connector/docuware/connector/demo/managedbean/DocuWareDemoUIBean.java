package com.axonivy.connector.docuware.connector.demo.managedbean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import ch.ivyteam.ivy.environment.Ivy;

@ManagedBean
@ViewScoped
public class DocuWareDemoUIBean implements Serializable {

	private static final long serialVersionUID = 4548574141754643263L;

	private String documentUrl;
	private final String DOCUMENT_URL_FORMAT = "https://%s/DocuWare/Platform/WebClient/Client/Document?did=%s&fc=%s";

	public void buildDocumentUrl(String documentId, String fileCabinetId) {
		String host = Ivy.var().get("docuwareConnector.host");
		this.documentUrl = String.format(DOCUMENT_URL_FORMAT, host, documentId, fileCabinetId);
	}

	public String getDocumentUrl() {
		return documentUrl;
	}
}
