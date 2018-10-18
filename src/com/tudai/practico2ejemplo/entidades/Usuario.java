package com.tudai.practico2ejemplo.entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Usuario implements Serializable {

	private static final long serialVersionUID = -2136060257901848874L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id_user;
	@Column(nullable = false)
	private String nombre;
	@Column(nullable = false)
	private String apellido;
	@ManyToMany
	@JoinTable(name="usuario_trabajo",
				joinColumns= {@JoinColumn(name="id_user")},
				inverseJoinColumns= {@JoinColumn(name="id_trabajo")})
	
	private List<Trabajo> trabajos;
	
	
	public Usuario(){}

	public Usuario(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
}
