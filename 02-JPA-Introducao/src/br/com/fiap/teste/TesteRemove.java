package br.com.fiap.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Pizza;

public class TesteRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("THJORGE");
		EntityManager em = fabrica.createEntityManager();
		//Remover pizza
		Pizza pizza = em.find(Pizza.class, 1);		
		em.remove(pizza);
		
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		System.out.println("Pizza deletada");
		System.exit(0);
	}

}
