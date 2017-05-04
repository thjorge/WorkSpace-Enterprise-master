package br.com.fiap.singleton;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactorySingleton {

	//Construtor privado
	private EntityManagerFactorySingleton() {}
	
	//Atributo privado est�tico
	private static EntityManagerFactory fabrica;
	
	//M�todo publico est�tico
	public static EntityManagerFactory getInstance(){
		if (fabrica == null){
			fabrica = Persistence
				.createEntityManagerFactory("CLIENTE_ORACLE");
		}
		return fabrica;
	}
	
}
