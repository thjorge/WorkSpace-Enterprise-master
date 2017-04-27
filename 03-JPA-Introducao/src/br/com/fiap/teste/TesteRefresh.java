package br.com.fiap.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Funcionario;

public class TesteRefresh {

	public static void main(String[] args) {
		EntityManagerFactory fabrica = Persistence
				.createEntityManagerFactory("CLIENTE_ORACLE");
		EntityManager em = fabrica.createEntityManager();
		
		//Buscar um funcion�rio
		Funcionario func = em.find(Funcionario.class, 1);
		System.out.println("Ap�s o find: " + func.getNome());
		
		func.setNome("Kelly");
		System.out.println("Alterou o nome " + func.getNome());
		
		em.refresh(func);
		System.out.println("Ap�s o refresh: " + func.getNome());
		
	}
}
