package com.fogacoop.flujofogacoop;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class ResponseGenericTransacDTO extends ResponseBaseDto
		implements
			java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "body")
	private com.fogacoop.flujofogacoop.BodyGenericTransac body;

	public ResponseGenericTransacDTO() {
	}

	public com.fogacoop.flujofogacoop.BodyGenericTransac getBody() {
		return this.body;
	}

	public void setBody(com.fogacoop.flujofogacoop.BodyGenericTransac body) {
		this.body = body;
	}

	public ResponseGenericTransacDTO(
			com.fogacoop.flujofogacoop.BodyGenericTransac body) {
		this.body = body;
	}

}