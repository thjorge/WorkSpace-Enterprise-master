package br.com.fiap.testes;

import javax.persistence.EntityManager;

import br.com.fiap.dao.EditoraDAO;
import br.com.fiap.dao.impl.EditoraDAOImpl;
import br.com.fiap.entities.Editora;
import br.com.fiap.factory.EntityManagerSingletonFactory;
import br.com.fiap.helper.JPaneHelper;

public class TestePersistEditora {

	public static void main(String[] args) {
		EntityManager em = EntityManagerSingletonFactory.getConnection().createEntityManager();
		JPaneHelper jph = new JPaneHelper();

		EditoraDAO dao = new EditoraDAOImpl(em);
		
		dao.cadastrar(
				new Editora(
						0,
						jph.inputString("CNPJ"),
						jph.inputString("Nome"),
						jph.inputString("Endereço")
						)
				);
				
		dao.salvar();
		
		em.close();
		System.exit(0);
	}

}
