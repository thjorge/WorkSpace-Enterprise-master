package br.com.fiap.view;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;

import br.com.fiap.dao.EntityManagerFactorySingleton;
import br.com.fiap.dao.PacoteDAO;
import br.com.fiap.dao.impl.PacoteDAOImpl;

public class Exercicio10 {

	public static void main(String[] args) {

		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		PacoteDAO dao = new PacoteDAOImpl(em);
		
		System.out.println(
				dao.buscaQtdPacotePorData(
						new GregorianCalendar(2017,Calendar.JANUARY,1),
						new GregorianCalendar(2017,Calendar.DECEMBER,31)
						)
				);
				
		em.close();
		System.exit(0);
		
	}

}
