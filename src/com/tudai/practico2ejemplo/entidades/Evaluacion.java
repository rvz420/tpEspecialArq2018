package com.tudai.practico2ejemplo.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Evaluacion implements Serializable{
	
	private static final long serialVersionUID = -5786227364728994205L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	//relaciones
	@Column(nullable = false)
	private long id_usuario;
	@Column(nullable = false)
	private long id_trabajo;
	
	public Evaluacion() {
	}

	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
