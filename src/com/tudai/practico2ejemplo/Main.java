package com.tudai.practico2ejemplo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

//import com.tudai.practico2ejemplo.entidadesSinAnotaciones.*;
import com.tudai.practico2ejemplo.entidades.*;

public class Main {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TP-Especial-2018");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Usuario evaluador = new Usuario();
		evaluador.setNombre("Shaggy");
		evaluador.setApellido("Muñoz");
		
		em.persist(evaluador);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
}
