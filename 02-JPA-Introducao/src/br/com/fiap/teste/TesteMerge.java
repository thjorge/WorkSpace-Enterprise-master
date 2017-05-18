package br.com.fiap.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Pizza;

public class TesteMerge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		EntityManager em = fabrica.createEntityManager();
		
		//Busca a pizza no BD com o código 1
		Pizza pizza = em.find(Pizza.class, 1);
		
		pizza.setPreco(50);
		
		em.merge(pizza);
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		System.out.println("Pizza atualizada!");		
		System.exit(0);
		
	}

}
