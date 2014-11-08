package com.proint1.udea.produccion.entidades;

//import java.sql.Blob;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.proint1.udea.administracion.entidades.terceros.TbAdmPaises;
import com.proint1.udea.administracion.entidades.terceros.TbAdmPersona;

/**
 * TbPrdAutor generated by hbm2java
 */
public class TbPrdAutor implements java.io.Serializable {

	private static final long serialVersionUID = -6606217549730178334L;
	
	private long id;
	private TbAdmPaises pais;
	private TbAdmPersona persona;
	//private Blob foto;
	//private BLOB foto;
	private byte[] imagen;
	private String usuarioModifico;
	private Date fechaModifico;
	private Set tbPrdAutoresxproduccions = new HashSet(0);

	public TbPrdAutor() {
	}

	public TbPrdAutor(TbAdmPaises pais, TbAdmPersona persona, byte[] imagen, String usuarioModifico, Date fechaModifico) {
		this.pais = pais;
		this.persona = persona;
		this.imagen = imagen;
		this.usuarioModifico = usuarioModifico; 
		this.fechaModifico = fechaModifico;
	}
	
	public TbPrdAutor(long nbAutIdn, TbAdmPaises tbAdmPaises,
			TbAdmPersona tbAdmPersona, String vrAdtusuario, Date dtAdtfecha) {
		this.id = nbAutIdn;
		this.pais = tbAdmPaises;
		this.persona = tbAdmPersona;
		this.usuarioModifico = vrAdtusuario;
		this.fechaModifico = dtAdtfecha;
	}

	/*public TbPrdAutor(long nbAutIdn, TbAdmPaises tbAdmPaises,
			TbAdmPersona tbAdmPersona, BLOB phFoto, String vrAdtusuario,
			Date dtAdtfecha, Set tbPrdAutoresxproduccions) {
		this.id = nbAutIdn;
		this.pais = tbAdmPaises;
		this.persona = tbAdmPersona;
		this.usuarioModifico = vrAdtusuario;
		this.fechaModifico = dtAdtfecha;
		this.tbPrdAutoresxproduccions = tbPrdAutoresxproduccions;
	}*/

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public TbAdmPaises getPais() {
		return pais;
	}

	public void setPais(TbAdmPaises pais) {
		this.pais = pais;
	}

	public TbAdmPersona getPersona() {
		return persona;
	}

	public void setPersona(TbAdmPersona persona) {
		this.persona = persona;
	}

//	public BLOB getFoto() {
//		return foto;
//	}
//
//	public void setFoto(BLOB foto) {
//		this.foto = foto;
//	}

	public String getUsuarioModifico() {
		return usuarioModifico;
	}

	public byte[] getImagen() {
		return imagen;
	}

	public void setImagen(byte[] imagen) {
		this.imagen = imagen;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void setUsuarioModifico(String usuarioModifico) {
		this.usuarioModifico = usuarioModifico;
	}

	public Date getFechaModifico() {
		return fechaModifico;
	}

	public void setFechaModifico(Date fechaModifico) {
		this.fechaModifico = fechaModifico;
	}

	public Set getTbPrdAutoresxproduccions() {
		return tbPrdAutoresxproduccions;
	}

	public void setTbPrdAutoresxproduccions(Set tbPrdAutoresxproduccions) {
		this.tbPrdAutoresxproduccions = tbPrdAutoresxproduccions;
	}

}
