package br.com.fiap.singleton;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerSingletonFactory {

	private static EntityManagerFactory fabrica;
	
	private EntityManagerSingletonFactory(){
		
	}
	
	public static EntityManagerFactory getInstance(){
		if(fabrica == null)
			fabrica = Persistence.createEntityManagerFactory("KENZO_RM76801");
		return fabrica;
	}
	
}
