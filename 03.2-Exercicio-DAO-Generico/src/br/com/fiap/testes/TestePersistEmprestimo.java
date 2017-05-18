package br.com.fiap.testes;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;

import br.com.fiap.dao.EmprestimoDAO;
import br.com.fiap.dao.impl.EmprestimoDAOImpl;
import br.com.fiap.entities.Emprestimo;
import br.com.fiap.factory.EntityManagerSingletonFactory;

public class TestePersistEmprestimo {

	public static void main(String[] args) {
		EntityManager em = EntityManagerSingletonFactory.getConnection().createEntityManager();

		EmprestimoDAO dao = new EmprestimoDAOImpl(em);
		
		dao.cadastrar(new Emprestimo(
				0,
				Calendar.getInstance(),
				new GregorianCalendar(2017,Calendar.APRIL,5)
				));
				
		dao.salvar();
		
		em.close();
		System.exit(0);
	}

}
