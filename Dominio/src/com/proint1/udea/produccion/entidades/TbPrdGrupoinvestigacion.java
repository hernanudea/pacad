package com.proint1.udea.produccion.entidades;

// default package
// Generated 3/10/2014 01:25:48 AM by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.proint1.udea.administracion.entidades.terceros.TbAdmPersona;

/**
 * TbPrdGrupoinvestigacion generated by hbm2java
 */
public class TbPrdGrupoinvestigacion implements java.io.Serializable {

	private long nbIdn;
	private TbAdmPersona tbAdmPersonaByNbAuxiliar;
	private TbAdmPersona tbAdmPersonaByNbDirector;
	private String vrNombre;
	private String vrAbreviatura;
	private Date dtFechacreacion;
	private char blEstado;
	private Date dtFecharetiro;
	private String vrAdtusuario;
	private Date dtAdtfecha;
	private Set tbPrdAutoresxproduccions = new HashSet(0);
	private Set tbPrdMiembrosxgrupos = new HashSet(0);

	public TbPrdGrupoinvestigacion() {
	}

	public TbPrdGrupoinvestigacion(long nbIdn,
			TbAdmPersona tbAdmPersonaByNbAuxiliar,
			TbAdmPersona tbAdmPersonaByNbDirector, String vrNombre,
			Date dtFechacreacion, char blEstado, String vrAdtusuario,
			Date dtAdtfecha) {
		this.nbIdn = nbIdn;
		this.tbAdmPersonaByNbAuxiliar = tbAdmPersonaByNbAuxiliar;
		this.tbAdmPersonaByNbDirector = tbAdmPersonaByNbDirector;
		this.vrNombre = vrNombre;
		this.dtFechacreacion = dtFechacreacion;
		this.blEstado = blEstado;
		this.vrAdtusuario = vrAdtusuario;
		this.dtAdtfecha = dtAdtfecha;
	}

	public TbPrdGrupoinvestigacion(long nbIdn,
			TbAdmPersona tbAdmPersonaByNbAuxiliar,
			TbAdmPersona tbAdmPersonaByNbDirector, String vrNombre,
			String vrAbreviatura, Date dtFechacreacion, char blEstado,
			Date dtFecharetiro, String vrAdtusuario, Date dtAdtfecha,
			Set tbPrdAutoresxproduccions, Set tbPrdMiembrosxgrupos) {
		this.nbIdn = nbIdn;
		this.tbAdmPersonaByNbAuxiliar = tbAdmPersonaByNbAuxiliar;
		this.tbAdmPersonaByNbDirector = tbAdmPersonaByNbDirector;
		this.vrNombre = vrNombre;
		this.vrAbreviatura = vrAbreviatura;
		this.dtFechacreacion = dtFechacreacion;
		this.blEstado = blEstado;
		this.dtFecharetiro = dtFecharetiro;
		this.vrAdtusuario = vrAdtusuario;
		this.dtAdtfecha = dtAdtfecha;
		this.tbPrdAutoresxproduccions = tbPrdAutoresxproduccions;
		this.tbPrdMiembrosxgrupos = tbPrdMiembrosxgrupos;
	}

	public long getNbIdn() {
		return this.nbIdn;
	}

	public void setNbIdn(long nbIdn) {
		this.nbIdn = nbIdn;
	}

	public TbAdmPersona getTbAdmPersonaByNbAuxiliar() {
		return this.tbAdmPersonaByNbAuxiliar;
	}

	public void setTbAdmPersonaByNbAuxiliar(
			TbAdmPersona tbAdmPersonaByNbAuxiliar) {
		this.tbAdmPersonaByNbAuxiliar = tbAdmPersonaByNbAuxiliar;
	}

	public TbAdmPersona getTbAdmPersonaByNbDirector() {
		return this.tbAdmPersonaByNbDirector;
	}

	public void setTbAdmPersonaByNbDirector(
			TbAdmPersona tbAdmPersonaByNbDirector) {
		this.tbAdmPersonaByNbDirector = tbAdmPersonaByNbDirector;
	}

	public String getVrNombre() {
		return this.vrNombre;
	}

	public void setVrNombre(String vrNombre) {
		this.vrNombre = vrNombre;
	}

	public String getVrAbreviatura() {
		return this.vrAbreviatura;
	}

	public void setVrAbreviatura(String vrAbreviatura) {
		this.vrAbreviatura = vrAbreviatura;
	}

	public Date getDtFechacreacion() {
		return this.dtFechacreacion;
	}

	public void setDtFechacreacion(Date dtFechacreacion) {
		this.dtFechacreacion = dtFechacreacion;
	}

	public char getBlEstado() {
		return this.blEstado;
	}

	public void setBlEstado(char blEstado) {
		this.blEstado = blEstado;
	}

	public Date getDtFecharetiro() {
		return this.dtFecharetiro;
	}

	public void setDtFecharetiro(Date dtFecharetiro) {
		this.dtFecharetiro = dtFecharetiro;
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

	public Set getTbPrdAutoresxproduccions() {
		return this.tbPrdAutoresxproduccions;
	}

	public void setTbPrdAutoresxproduccions(Set tbPrdAutoresxproduccions) {
		this.tbPrdAutoresxproduccions = tbPrdAutoresxproduccions;
	}

	public Set getTbPrdMiembrosxgrupos() {
		return this.tbPrdMiembrosxgrupos;
	}

	public void setTbPrdMiembrosxgrupos(Set tbPrdMiembrosxgrupos) {
		this.tbPrdMiembrosxgrupos = tbPrdMiembrosxgrupos;
	}

}