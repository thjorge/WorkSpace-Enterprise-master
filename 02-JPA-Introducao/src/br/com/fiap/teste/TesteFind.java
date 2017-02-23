package br.com.fiap.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

import br.com.fiap.entity.Pizza;

public class TesteFind {

	public static void main(String[] args) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("THJORGE");
		
		EntityManager em = fabrica.createEntityManager();
		
		Pizza pizza = em.find(Pizza.class, 2);
		
		JOptionPane.showMessageDialog(null, pizza.getSabor());
		
		//Persistant recebe um objeto, porém podemos setar atributos individualmente
		pizza.setSabor("Chocolate");
		
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		JOptionPane.showMessageDialog(null, pizza.getSabor());
		
		System.exit(0);
		
	}
	
}
