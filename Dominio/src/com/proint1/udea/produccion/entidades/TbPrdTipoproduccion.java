package com.proint1.udea.produccion.entidades;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * TbPrdTipoproduccion generated by hbm2java
 */
public class TbPrdTipoproduccion implements java.io.Serializable {

	private long nbIdn;
	private String vrDescripcion;
	private char blEstado;
	private String vrAdtusuario;
	private Date dtAdtfecha;
	private Set tbPrdTipoproducionesxcampos = new HashSet(0);
	private Set tbPrdProduccions = new HashSet(0);

	public TbPrdTipoproduccion() {
	}

	public TbPrdTipoproduccion(long nbIdn, String vrDescripcion, char blEstado,
			String vrAdtusuario, Date dtAdtfecha) {
		this.nbIdn = nbIdn;
		this.vrDescripcion = vrDescripcion;
		this.blEstado = blEstado;
		this.vrAdtusuario = vrAdtusuario;
		this.dtAdtfecha = dtAdtfecha;
	}

	public TbPrdTipoproduccion(long nbIdn, String vrDescripcion, char blEstado,
			String vrAdtusuario, Date dtAdtfecha,
			Set tbPrdTipoproducionesxcampos, Set tbPrdProduccions) {
		this.nbIdn = nbIdn;
		this.vrDescripcion = vrDescripcion;
		this.blEstado = blEstado;
		this.vrAdtusuario = vrAdtusuario;
		this.dtAdtfecha = dtAdtfecha;
		this.tbPrdTipoproducionesxcampos = tbPrdTipoproducionesxcampos;
		this.tbPrdProduccions = tbPrdProduccions;
	}

	public long getNbIdn() {
		return this.nbIdn;
	}

	public void setNbIdn(long nbIdn) {
		this.nbIdn = nbIdn;
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

	public Set getTbPrdTipoproducionesxcampos() {
		return this.tbPrdTipoproducionesxcampos;
	}

	public void setTbPrdTipoproducionesxcampos(Set tbPrdTipoproducionesxcampos) {
		this.tbPrdTipoproducionesxcampos = tbPrdTipoproducionesxcampos;
	}

	public Set getTbPrdProduccions() {
		return this.tbPrdProduccions;
	}

	public void setTbPrdProduccions(Set tbPrdProduccions) {
		this.tbPrdProduccions = tbPrdProduccions;
	}

}
