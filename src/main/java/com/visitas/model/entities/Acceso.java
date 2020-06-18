package com.visitas.model.entities;
import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the acceso database table.
 * 
 */
@Entity
@Table(name="acceso")
public class Acceso implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private int estado;

	private Timestamp fechareg;

	//bi-directional many-to-one association to Registro
	@ManyToOne(fetch = FetchType.LAZY)	
	private Registro registro;

	public Acceso() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEstado() {
		return this.estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public Timestamp getFechareg() {
		return this.fechareg;
	}

	public void setFechareg(Timestamp fechareg) {
		this.fechareg = fechareg;
	}

	public Registro getRegistro() {
		return this.registro;
	}

	public void setRegistro(Registro registroBean) {
		this.registro = registroBean;
	}

}