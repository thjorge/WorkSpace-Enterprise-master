package br.com.fiap.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Funcionario;

public class TesteRemove {

	public static void main(String[] args) {
		EntityManagerFactory fabrica = Persistence
				.createEntityManagerFactory("CLIENTE_ORACLE");
		EntityManager em = fabrica.createEntityManager();
		
		//Buscar o funcionario
		Funcionario func = em.find(Funcionario.class, 1);
		//Remove o funcion�rio do banco de dados
		em.remove(func);
		//Transa��o
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		em.close();
		
		System.out.println("Funcion�rio removido!");
		System.exit(0);
		
	}
	
}
