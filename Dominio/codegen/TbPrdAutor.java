// default package
// Generated 17/10/2014 09:41:12 AM by Hibernate Tools 4.0.0

import java.sql.Blob;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * TbPrdAutor generated by hbm2java
 */
public class TbPrdAutor implements java.io.Serializable {

	private long nbAutIdn;
	private TbAdmPaises tbAdmPaises;
	private TbAdmPersona tbAdmPersona;
	private Blob phFoto;
	private String vrAdtusuario;
	private Date dtAdtfecha;
	private Set tbPrdAutoresxproduccions = new HashSet(0);

	public TbPrdAutor() {
	}

	public TbPrdAutor(long nbAutIdn, TbAdmPaises tbAdmPaises,
			TbAdmPersona tbAdmPersona, String vrAdtusuario, Date dtAdtfecha) {
		this.nbAutIdn = nbAutIdn;
		this.tbAdmPaises = tbAdmPaises;
		this.tbAdmPersona = tbAdmPersona;
		this.vrAdtusuario = vrAdtusuario;
		this.dtAdtfecha = dtAdtfecha;
	}

	public TbPrdAutor(long nbAutIdn, TbAdmPaises tbAdmPaises,
			TbAdmPersona tbAdmPersona, Blob phFoto, String vrAdtusuario,
			Date dtAdtfecha, Set tbPrdAutoresxproduccions) {
		this.nbAutIdn = nbAutIdn;
		this.tbAdmPaises = tbAdmPaises;
		this.tbAdmPersona = tbAdmPersona;
		this.phFoto = phFoto;
		this.vrAdtusuario = vrAdtusuario;
		this.dtAdtfecha = dtAdtfecha;
		this.tbPrdAutoresxproduccions = tbPrdAutoresxproduccions;
	}

	public long getNbAutIdn() {
		return this.nbAutIdn;
	}

	public void setNbAutIdn(long nbAutIdn) {
		this.nbAutIdn = nbAutIdn;
	}

	public TbAdmPaises getTbAdmPaises() {
		return this.tbAdmPaises;
	}

	public void setTbAdmPaises(TbAdmPaises tbAdmPaises) {
		this.tbAdmPaises = tbAdmPaises;
	}

	public TbAdmPersona getTbAdmPersona() {
		return this.tbAdmPersona;
	}

	public void setTbAdmPersona(TbAdmPersona tbAdmPersona) {
		this.tbAdmPersona = tbAdmPersona;
	}

	public Blob getPhFoto() {
		return this.phFoto;
	}

	public void setPhFoto(Blob phFoto) {
		this.phFoto = phFoto;
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

}