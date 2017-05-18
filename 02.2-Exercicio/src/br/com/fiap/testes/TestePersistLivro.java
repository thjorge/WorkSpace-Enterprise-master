package br.com.fiap.testes;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entities.Livro;
import br.com.fiap.helper.JPaneHelper;

public class TestePersistLivro {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("KENZO_RM76801");
		EntityManager em = emf.createEntityManager();
		JPaneHelper jph = new JPaneHelper();
		
		Livro livro = new Livro();

		//Tratar entrada de data é muito chato, por isso está simples
		livro.setIsbn(jph.InputInt("ISBN Livro"));
		livro.setTitulo(jph.InputString("Título Livro"));
		livro.setPreco(12);
		livro.setDtLancamento(new GregorianCalendar(2012,Calendar.AUGUST,16));
		
		try{
			em.persist(livro);
			em.getTransaction().begin();
			em.getTransaction().commit();
		}catch (Exception e) {
			e.printStackTrace();
		}		

	}

}
