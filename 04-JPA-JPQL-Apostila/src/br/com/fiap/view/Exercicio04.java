package br.com.fiap.view;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.dao.EntityManagerFactorySingleton;
import br.com.fiap.dao.PacoteDAO;
import br.com.fiap.dao.ReservaDAO;
import br.com.fiap.dao.TransporteDAO;
import br.com.fiap.dao.impl.ClienteDAOImpl;
import br.com.fiap.dao.impl.PacoteDAOImpl;
import br.com.fiap.dao.impl.TransporteDAOImpl;
import br.com.fiap.entity.Cliente;
import br.com.fiap.entity.Pacote;
import br.com.fiap.entity.Transporte;

public class Exercicio04 {
	
	public static void main(String[] args) {
		EntityManager em = EntityManagerFactorySingleton
				.getInstance().createEntityManager();
		ClienteDAO dao = new ClienteDAOImpl(em);
		
		List<Cliente> lista = dao.buscarPorDiasReserva(10);
		for (Cliente cliente : lista) {
			System.out.println(cliente.getNome());
		}
				
		
		em.close();
		System.exit(0);
	}

}

