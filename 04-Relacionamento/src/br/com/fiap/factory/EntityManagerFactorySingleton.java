package br.com.fiap.factory;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactorySingleton {

	// 1º Atributo privado estático que será único
	private static EntityManagerFactory emf;
	
	// 2º Construtor privado
	private EntityManagerFactorySingleton(){
		
	}
	
	// 3º Método que retorna a única instância de EntityManagerFactory
	public static EntityManagerFactory getInstance(){
		if(emf == null)
			//Inicia a fábrica de EM
			emf = Persistence.createEntityManagerFactory("KENZO_RM76801");
		return emf;
	}
	
}
