package br.com.fiap.factory;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerSingletonFactory {

	private static EntityManagerFactory emf;
	
	private EntityManagerSingletonFactory(){
		
	}
	
	public static EntityManagerFactory getConnection(){
		if(emf == null)
			emf = Persistence.createEntityManagerFactory("KENZO_RM76801");
		return emf;
	}
	
}
