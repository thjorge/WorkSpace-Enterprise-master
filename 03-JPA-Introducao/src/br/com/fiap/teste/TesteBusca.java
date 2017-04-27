package br.com.fiap.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Funcionario;

public class TesteBusca {

	public static void main(String[] args) {
		//EntityManager
		EntityManagerFactory fabrica = Persistence
				.createEntityManagerFactory("CLIENTE_ORACLE");
		EntityManager em = fabrica.createEntityManager();
		
		//Buscar o funcion�rio                c�digo do funcionario
		Funcionario func = em.find(Funcionario.class, 1);
		
		em.close();
		
		System.out.println("Funcion�rio: " + func.getNome());
		System.exit(0); //Parar a aplica��o
	}
}
