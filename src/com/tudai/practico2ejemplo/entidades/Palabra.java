package com.tudai.practico2ejemplo.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Palabra implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	long id; //pk
	@Column(nullable = false)
	String palabra;
	@Column(nullable = false)
	boolean isSpecific;
	
	public Palabra(String p, boolean isSpecific) {
		palabra = p;
		this.isSpecific = isSpecific;
	}

	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPalabra() {
		return palabra;
	}

	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}

	public boolean isSpecific() {
		return isSpecific;
	}

	public void setSpecific(boolean isSpecific) {
		this.isSpecific = isSpecific;
	}
	
	

}
