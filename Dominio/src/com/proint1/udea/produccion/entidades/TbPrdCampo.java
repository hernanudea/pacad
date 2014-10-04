package com.proint1.udea.produccion.entidades;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * TbPrdCampos generated by hbm2java
 */
public class TbPrdCampo implements java.io.Serializable {

	private long nbIdn;
	private String vrAdtusuario;
	private Date dtAdtfecha;
	private String vrDescripcion;
	private char blEstado;
	private Set tbPrdTipoproducionesxcampos = new HashSet(0);

	public TbPrdCampo() {
	}

	public TbPrdCampo(String vrDescripcion, char blEstado, String vrAdtusuario, Date dtAdtfecha) {
		this.nbIdn = nbIdn;
		this.vrAdtusuario = vrAdtusuario;
		this.dtAdtfecha = dtAdtfecha;
		this.vrDescripcion = vrDescripcion;
		this.blEstado = blEstado;
	}

	public TbPrdCampo(long nbIdn, String vrAdtusuario, Date dtAdtfecha,
			String vrDescripcion, char blEstado, Set tbPrdTipoproducionesxcampos) {
		this.nbIdn = nbIdn;
		this.vrAdtusuario = vrAdtusuario;
		this.dtAdtfecha = dtAdtfecha;
		this.vrDescripcion = vrDescripcion;
		this.blEstado = blEstado;
		this.tbPrdTipoproducionesxcampos = tbPrdTipoproducionesxcampos;
	}

	public long getNbIdn() {
		return this.nbIdn;
	}

	public void setNbIdn(long nbIdn) {
		this.nbIdn = nbIdn;
	}

	public String getVrAdtusuario() {
		return this.vrAdtusuario;
	}

	public void setVrAdtusuario(String vrAdtusuario) {
		this.vrAdtusuario = vrAdtusuario;
	}

	public Date getDtAdtfecha() {
		return this.dtAdtfecha;
	}

	public void setDtAdtfecha(Date dtAdtfecha) {
		this.dtAdtfecha = dtAdtfecha;
	}

	public String getVrDescripcion() {
		return this.vrDescripcion;
	}

	public void setVrDescripcion(String vrDescripcion) {
		this.vrDescripcion = vrDescripcion;
	}

	public char getBlEstado() {
		return this.blEstado;
	}

	public void setBlEstado(char blEstado) {
		this.blEstado = blEstado;
	}

	public Set getTbPrdTipoproducionesxcampos() {
		return this.tbPrdTipoproducionesxcampos;
	}

	public void setTbPrdTipoproducionesxcampos(Set tbPrdTipoproducionesxcampos) {
		this.tbPrdTipoproducionesxcampos = tbPrdTipoproducionesxcampos;
	}

}