package br.com.fiap.testes;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entities.Autor;
import br.com.fiap.entities.Sexo;
import br.com.fiap.helper.JPaneHelper;

public class TestePersistAutor {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("KENZO_RM76801");
		EntityManager em = emf.createEntityManager();
		JPaneHelper jph = new JPaneHelper();

		Autor autor = new Autor(
				0,
				jph.InputString("Nome"),
				Sexo.MASCULINO,
				jph.InputString("Sobrenome"),
				new GregorianCalendar(1998,Calendar.JUNE,9)
				);
		
		try{
			em.persist(autor);
			em.getTransaction().begin();
			em.getTransaction().commit();
		}catch (Exception e) {
			e.printStackTrace();
		}		
	}

}
