package com.axonivy.connector.docuware.connector.enums;

public enum GrantType {
	PASSWORD("password"), DW_TOKEN("password"), TRUSTED("password");
	
	private String code;

	private GrantType(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	
}
