package br.com.fiap.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Pizza;

public class TesteRefresh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		EntityManager em = fabrica.createEntityManager();
		
		//Buscar pizza no banco
		Pizza pizza = em.find(Pizza.class, 1);
		
		System.out.println(pizza.getSabor());
		pizza.setSabor("Abacate com feij�o");
		System.out.println(pizza.getSabor());
		
		//Atualizar a pizza com as informa��es do banco
		em.refresh(pizza);
		System.out.println(pizza.getSabor());
		System.exit(0);
		
	}

}
