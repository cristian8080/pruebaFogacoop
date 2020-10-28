package com.fogacoop.flujofogacoop;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class VerificarPagoDTO implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("tipoPago")
	private java.lang.String tipoPago;
	@org.kie.api.definition.type.Label("entityCode")
	private java.lang.String entityCode;
	@org.kie.api.definition.type.Label("idTransac")
	private java.lang.String idTransac;

	@org.kie.api.definition.type.Label("estadoPago")
	private java.lang.String estadoPago;

	@org.kie.api.definition.type.Label("entidadLiq")
	private java.lang.String entidadLiq;

	@org.kie.api.definition.type.Label("esLiq")
	private java.lang.String esLiq;

	@org.kie.api.definition.type.Label(value = "idTicket")
	private java.lang.String idTicket;

	public VerificarPagoDTO() {
	}

	public java.lang.String getTipoPago() {
		return this.tipoPago;
	}

	public void setTipoPago(java.lang.String tipoPago) {
		this.tipoPago = tipoPago;
	}

	public java.lang.String getEntityCode() {
		return this.entityCode;
	}

	public void setEntityCode(java.lang.String entityCode) {
		this.entityCode = entityCode;
	}

	public java.lang.String getIdTransac() {
		return this.idTransac;
	}

	public void setIdTransac(java.lang.String idTransac) {
		this.idTransac = idTransac;
	}

	public java.lang.String getEstadoPago() {
		return this.estadoPago;
	}

	public void setEstadoPago(java.lang.String estadoPago) {
		this.estadoPago = estadoPago;
	}

	public java.lang.String getEntidadLiq() {
		return this.entidadLiq;
	}

	public void setEntidadLiq(java.lang.String entidadLiq) {
		this.entidadLiq = entidadLiq;
	}

	public java.lang.String getEsLiq() {
		return this.esLiq;
	}

	public void setEsLiq(java.lang.String esLiq) {
		this.esLiq = esLiq;
	}

	public java.lang.String getIdTicket() {
		return this.idTicket;
	}

	public void setIdTicket(java.lang.String idTicket) {
		this.idTicket = idTicket;
	}

	public VerificarPagoDTO(java.lang.String tipoPago,
			java.lang.String entityCode, java.lang.String idTransac,
			java.lang.String estadoPago, java.lang.String entidadLiq,
			java.lang.String esLiq, java.lang.String idTicket) {
		this.tipoPago = tipoPago;
		this.entityCode = entityCode;
		this.idTransac = idTransac;
		this.estadoPago = estadoPago;
		this.entidadLiq = entidadLiq;
		this.esLiq = esLiq;
		this.idTicket = idTicket;
	}

}