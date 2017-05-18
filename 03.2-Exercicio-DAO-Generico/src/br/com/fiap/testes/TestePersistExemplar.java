package br.com.fiap.testes;

import java.util.Calendar;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ExemplarDAO;
import br.com.fiap.dao.impl.ExemplarDAOImpl;
import br.com.fiap.entities.Exemplar;
import br.com.fiap.entities.Situacao;
import br.com.fiap.factory.EntityManagerSingletonFactory;

public class TestePersistExemplar {

	public static void main(String[] args) {
		EntityManager em = EntityManagerSingletonFactory.getConnection().createEntityManager();

		ExemplarDAO dao = new ExemplarDAOImpl(em);
		
		dao.cadastrar(new Exemplar(
				0,
				Calendar.getInstance(),
				Situacao.EMPRESTADO
				));
				
		dao.salvar();
		
		em.close();
		System.exit(0);
	}

}
