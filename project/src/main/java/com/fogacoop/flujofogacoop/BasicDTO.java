package com.fogacoop.flujofogacoop;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class BasicDTO implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "nit")
	private java.lang.String nit;
	@org.kie.api.definition.type.Label(value = "fechaCorte")
	private java.lang.String fechaCorte;

	public BasicDTO() {
	}

	public java.lang.String getNit() {
		return this.nit;
	}

	public void setNit(java.lang.String nit) {
		this.nit = nit;
	}

	public java.lang.String getFechaCorte() {
		return this.fechaCorte;
	}

	public void setFechaCorte(java.lang.String fechaCorte) {
		this.fechaCorte = fechaCorte;
	}

	public BasicDTO(java.lang.String nit, java.lang.String fechaCorte) {
		this.nit = nit;
		this.fechaCorte = fechaCorte;
	}

}