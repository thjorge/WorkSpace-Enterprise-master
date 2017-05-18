package br.com.fiap.view;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.dao.EntityManagerFactorySingleton;
import br.com.fiap.dao.impl.ClienteDAOImpl;
import br.com.fiap.entity.Cliente;

public class Exercicio06 {

	public static void main(String[] args) {

		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		
		ClienteDAO dao = new ClienteDAOImpl(em);
		
		List<Cliente> lista = dao.buscar("a", "a");
		
		for (Cliente cliente : lista) {
			System.out.println("Nome do cliente: ".concat(cliente.getNome())
					+ "\nCidade: ".concat(cliente.getEndereco().getCidade().getNome()));
		}
		
		em.close();
		System.exit(0);
	}

}
