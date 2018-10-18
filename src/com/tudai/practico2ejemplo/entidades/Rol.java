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

@Entity
public class Rol implements Serializable {
	
	private static final long serialVersionUID = 3184024780211490593L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id_rol;
	@Column(nullable = false)
	private String tipo;
	
	@ManyToMany
	@JoinTable(name="rol_usuario",
				joinColumns= {@JoinColumn(name="id_rol")},
				inverseJoinColumns= {@JoinColumn(name="id_user")})
	private List<Usuario> usuarios;
	
	
	public Rol(String tipo) {
		this.tipo = tipo;
		id_rol++;
	}

	public long getId() {
		return id_rol;
	}

	public void setId(long id) {
		this.id_rol = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
