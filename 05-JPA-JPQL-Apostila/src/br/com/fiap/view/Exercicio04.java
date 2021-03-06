package br.com.fiap.view;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.dao.EntityManagerFactorySingleton;
import br.com.fiap.dao.impl.ClienteDAOImpl;
import br.com.fiap.entity.Cliente;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		ClienteDAO dao = new ClienteDAOImpl(em);
		
		
		List<Cliente> lista = dao.buscarPorReservaQuantDia(10);
		
		for (Cliente cliente : lista) {
			System.out.println(
					"Cliente: " + cliente.getNome());
		}
		
		em.close();
		System.exit(0);
		
	}

}
