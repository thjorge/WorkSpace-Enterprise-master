package br.com.fiap.view;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.dao.EntityManagerFactorySingleton;
import br.com.fiap.dao.impl.ClienteDAOImpl;
import br.com.fiap.entity.Cliente;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		ClienteDAO dao = new ClienteDAOImpl(em);
		//EnderecoDAO enderecoDao = new EnderecoDAOImpl(em);
		
		//Endereco endereco = enderecoDao.pesquisar(1);
		
		//List<Cliente> lista = dao.buscarPorEstado(endereco.getCidade().getUf());
		List<Cliente> lista = dao.buscarPorEstado("SP");
		System.out.println("LISTA DE CLIENTES POR ESTADO (PARAM = SP) ---------");
		for (Cliente cliente : lista) {
			System.out.println(
					"Cliente : " + cliente.getNome()+
					"\nEstado: " + cliente.getEndereco().getCidade().getUf());
		}
		
		em.close();
		System.exit(0);
		
	}

}
