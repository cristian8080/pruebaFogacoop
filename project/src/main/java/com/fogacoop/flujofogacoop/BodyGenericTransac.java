package com.fogacoop.flujofogacoop;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class BodyGenericTransac implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "code")
	private java.lang.Integer code;
	@org.kie.api.definition.type.Label(value = "response")
	private java.lang.String response;
	@org.kie.api.definition.type.Label(value = "message")
	private java.lang.String message;

	public BodyGenericTransac() {
	}

	public java.lang.Integer getCode() {
		return this.code;
	}

	public void setCode(java.lang.Integer code) {
		this.code = code;
	}

	public java.lang.String getResponse() {
		return this.response;
	}

	public void setResponse(java.lang.String response) {
		this.response = response;
	}

	public java.lang.String getMessage() {
		return this.message;
	}

	public void setMessage(java.lang.String message) {
		this.message = message;
	}

	public BodyGenericTransac(java.lang.Integer code,
			java.lang.String response, java.lang.String message) {
		this.code = code;
		this.response = response;
		this.message = message;
	}

}