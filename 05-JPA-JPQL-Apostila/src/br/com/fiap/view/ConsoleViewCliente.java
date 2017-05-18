package br.com.fiap.view;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.dao.EntityManagerFactorySingleton;
import br.com.fiap.dao.impl.ClienteDAOImpl;
import br.com.fiap.entity.Cliente;

public class ConsoleViewCliente {

	public static void main(String[] args) {

		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		ClienteDAO dao = new ClienteDAOImpl(em);
		
		List<Cliente> lista = dao.listar();
		System.out.println("LISTA DE CLIENTES ---------");
		for (Cliente cliente : lista) {
			System.out.println("Cliente: " + cliente.getNome());
		}
		
		em.close();
		System.exit(0);
	}

}
