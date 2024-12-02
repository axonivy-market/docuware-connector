package com.axonivy.connector.docuware.connector.demo.managedbean;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import com.axonivy.connector.docuware.connector.DocuWareProperty;
import com.axonivy.connector.docuware.connector.demo.enums.ItemType;

import ch.ivyteam.ivy.environment.Ivy;

@ManagedBean
@ViewScoped
public class DocuWareDemoBean implements Serializable {

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

	public boolean isFieldNameTypeNumber(DocuWareProperty field) {
		return field.getItemElementName().equals(ItemType.DECIMAL.getValue())
				|| field.getItemElementName().equals(ItemType.INT.getValue());
	}

	public boolean isFieldNameTypeString(DocuWareProperty field) {
		return field.getItemElementName().equals(ItemType.STRING.getValue());
	}

	public void updateGrowl(boolean isUpdateSuccess) {
		if (isUpdateSuccess) {
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, Ivy.cms().co("/Labels/Success"), Ivy.cms().co(
							"/Dialogs/com/axonivy/connector/docuware/connector/demo/DocuWareDemoUI/Dialog/SuccessEditMessage")));
		} else {
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR, Ivy.cms().co("/Labels/Failed"), Ivy.cms().co(
							"/Dialogs/com/axonivy/connector/docuware/connector/demo/DocuWareDemoUI/Dialog/FailedEditMessage")));
		}
	}
}
