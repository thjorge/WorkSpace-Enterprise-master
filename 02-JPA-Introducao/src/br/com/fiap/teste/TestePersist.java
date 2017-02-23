package br.com.fiap.teste;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

import br.com.fiap.entity.BordaRecheada;
import br.com.fiap.entity.Pizza;
import br.com.fiap.entity.TamanhoPizza;

public class TestePersist {

	public static void main(String[] args) {
		//Criar o entity manager!
		
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("THJORGE");
		
		EntityManager em = fabrica.createEntityManager();
		
		//Cadastrar uma pizza
		Pizza pizza = new Pizza(0, 30,
				"CALABREZA",
				BordaRecheada.CHOCOLATE, 
				TamanhoPizza.GRANDE,
				Calendar.getInstance(),
				"SEM ANOTAÇÃO", null);
		
		em.getTransaction().begin();// Inicializa uma tranzação
		em.persist(pizza); //Novo no banco
		em.getTransaction().commit(); //Finaliza com commit
		
	JOptionPane.showMessageDialog(null, "Pizza no banco");
		
	}
	
}
