package com.fogacoop.flujofogacoop;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class ResponseBaseDto implements java.io.Serializable {

    static final long serialVersionUID = 1L;
    
    @org.kie.api.definition.type.Label("message")
	private java.lang.String message;
	@org.kie.api.definition.type.Label("path")
	private java.lang.String path;
	@org.kie.api.definition.type.Label("status")
	private java.lang.String status;
	@org.kie.api.definition.type.Label("businessStatus")
	private java.lang.String businessStatus;
	@org.kie.api.definition.type.Label("timeResponse")
	private java.lang.String timeResponse;

    public ResponseBaseDto() {
    }
    

	public java.lang.String getMessage() {
		return this.message;
	}

	public void setMessage(java.lang.String message) {
		this.message = message;
	}

	public java.lang.String getPath() {
		return this.path;
	}

	public void setPath(java.lang.String path) {
		this.path = path;
	}

	public java.lang.String getStatus() {
		return this.status;
	}

	public void setStatus(java.lang.String status) {
		this.status = status;
	}

	public java.lang.String getBusinessStatus() {
		return this.businessStatus;
	}

	public void setBusinessStatus(java.lang.String businessStatus) {
		this.businessStatus = businessStatus;
	}

	public java.lang.String getTimeResponse() {
		return this.timeResponse;
	}

	public void setTimeResponse(java.lang.String timeResponse) {
		this.timeResponse = timeResponse;
	}

	public ResponseBaseDto(
			java.lang.String message,
			java.lang.String path,
			java.lang.String status,
			java.lang.String businessStatus,
			java.lang.String timeResponse) {
		this.message = message;
		this.path = path;
		this.status = status;
		this.businessStatus = businessStatus;
		this.timeResponse = timeResponse;
	}




}