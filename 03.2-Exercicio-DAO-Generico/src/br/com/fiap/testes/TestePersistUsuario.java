package br.com.fiap.testes;

import javax.persistence.EntityManager;

import br.com.fiap.dao.UsuarioDAO;
import br.com.fiap.dao.impl.UsuarioDAOImpl;
import br.com.fiap.entities.Usuario;
import br.com.fiap.factory.EntityManagerSingletonFactory;
import br.com.fiap.helper.JPaneHelper;

public class TestePersistUsuario {

	public static void main(String[] args) {
		EntityManager em = EntityManagerSingletonFactory.getConnection().createEntityManager();
		JPaneHelper jph = new JPaneHelper();

		UsuarioDAO dao = new UsuarioDAOImpl(em);
		
		dao.cadastrar(new Usuario(
				0,
				jph.inputString("Nome"),
				jph.inputString("Primeiro nome"),
				jph.inputString("Sobrenome"),
				jph.inputString("CPF")
				));
				
		dao.salvar();
		
		em.close();
		System.exit(0);
	}

}
