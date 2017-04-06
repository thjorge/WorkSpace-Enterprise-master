package br.com.fiap.view;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import javax.persistence.EntityManager;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.dao.EntityManagerFactorySingleton;
import br.com.fiap.dao.PacoteDAO;
import br.com.fiap.dao.impl.ClienteDAOImpl;
import br.com.fiap.dao.impl.PacoteDAOImpl;
import br.com.fiap.entity.Cliente;
import br.com.fiap.entity.Pacote;


public class Exercicio06 {
	
	public static void main(String[] args) {
		EntityManager em = EntityManagerFactorySingleton
				.getInstance().createEntityManager();
		ClienteDAO dao = new ClienteDAOImpl(em);
		
		List<Cliente> buscar = dao.buscarCidade("Maria", "Salvador");
		for (Cliente cliente : buscar) {
			System.out.println(cliente.getNome());
			System.out.println(cliente.getEndereco().getCidade().getNome());
		}
		
		em.close();
		System.exit(0);
	}

}


