package br.com.fiap.testes;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;

import br.com.fiap.dao.LivroDAO;
import br.com.fiap.dao.impl.LivroDAOImpl;
import br.com.fiap.entities.Livro;
import br.com.fiap.factory.EntityManagerSingletonFactory;
import br.com.fiap.helper.JPaneHelper;

public class TestePersistLivro {

	public static void main(String[] args) {
		EntityManager em = EntityManagerSingletonFactory.getConnection().createEntityManager();
		JPaneHelper jph = new JPaneHelper();

		LivroDAO dao = new LivroDAOImpl(em);
		
		dao.cadastrar(new Livro(
				jph.inputInt("ISBN"),
				jph.inputString("Título"),
				jph.inputFloat("Preco"),
				new GregorianCalendar(1956,Calendar.AUGUST,4),
				null
				));
				
		dao.salvar();
		
		em.close();
		System.exit(0);
	}

}
