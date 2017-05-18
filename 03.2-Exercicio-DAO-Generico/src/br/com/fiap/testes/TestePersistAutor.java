package br.com.fiap.testes;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;

import br.com.fiap.dao.AutorDAO;
import br.com.fiap.dao.impl.AutorDAOImpl;
import br.com.fiap.entities.Autor;
import br.com.fiap.entities.Sexo;
import br.com.fiap.factory.EntityManagerSingletonFactory;
import br.com.fiap.helper.JPaneHelper;

public class TestePersistAutor {

	public static void main(String[] args) {
		EntityManager em = EntityManagerSingletonFactory.getConnection().createEntityManager();
		JPaneHelper jph = new JPaneHelper();

		AutorDAO dao = new AutorDAOImpl(em);
		
		dao.cadastrar(
				new Autor(
						0,
						jph.inputString("Nome"),
						Sexo.MASCULINO,
						jph.inputString("Sobrenome"),
						new GregorianCalendar(1965,Calendar.DECEMBER,28)
						)
				);
				
		dao.salvar();
		
		em.close();
		System.exit(0);
		
	}

}
