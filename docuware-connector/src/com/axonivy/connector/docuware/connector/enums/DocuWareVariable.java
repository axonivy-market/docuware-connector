package com.axonivy.connector.docuware.connector.enums;

import ch.ivyteam.ivy.environment.Ivy;

public enum DocuWareVariable {
	HOST("docuwareConnector.host"), PLATFORM("docuwareConnector.platform"), USERNAME("docuwareConnector.username"),
	PASSWORD("docuwareConnector.password"), ACCESS_TOKEN("docuwareConnector.accessToken"),
	LOGIN_TOKEN("docuwareConnector.loginToken");

	private String variableName;

	private DocuWareVariable(String variableName) {
		this.variableName = variableName;
	}

	public String getVariableName() {
		return variableName;
	}

	public String getValue() {
		return Ivy.var().get(variableName);
	}

	public String updateValue(String newValue) {
		return Ivy.var().set(variableName, newValue);
	}
}
