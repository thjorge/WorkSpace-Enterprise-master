package br.com.fiap.factory;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactorySingleton {

	// 1� Atributo privado est�tico que ser� �nico
	private static EntityManagerFactory emf;
	
	// 2� Construtor privado
	private EntityManagerFactorySingleton(){
		
	}
	
	// 3� M�todo que retorna a �nica inst�ncia de EntityManagerFactory
	public static EntityManagerFactory getInstance(){
		if(emf == null)
			//Inicia a f�brica de EM
			emf = Persistence.createEntityManagerFactory("KENZO_RM76801");
		return emf;
	}
	
}
