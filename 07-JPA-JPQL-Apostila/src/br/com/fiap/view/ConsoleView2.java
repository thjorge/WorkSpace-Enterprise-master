package br.com.fiap.view;

import java.text.SimpleDateFormat;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.dao.EntityManagerFactorySingleton;
import br.com.fiap.dao.impl.ClienteDAOImpl;
import br.com.fiap.entity.Cliente;

public class ConsoleView2 {

	public static void main(String[] args) {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		ClienteDAO dao = new ClienteDAOImpl(em);
		
		List<Cliente> lista = dao.buscarPorMesAniversario(2);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		for (Cliente cliente : lista) {
			System.out.println(cliente.getNome() + " " +
				sdf.format(cliente.getDataNascimento().getTime()));
		}
		
		em.close();
		System.exit(0);
	}
	
}
