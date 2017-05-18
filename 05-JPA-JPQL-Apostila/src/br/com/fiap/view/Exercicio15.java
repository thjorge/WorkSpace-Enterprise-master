package br.com.fiap.view;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.dao.EnderecoDAO;
import br.com.fiap.dao.EntityManagerFactorySingleton;
import br.com.fiap.dao.impl.EnderecoDAOImpl;
import br.com.fiap.entity.Endereco;

public class Exercicio15 {

	public static void main(String[] args) {
		
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		
		EnderecoDAO dao = new EnderecoDAOImpl(em);
		
		List<Endereco> lista = dao.buscaPorCep("12892309");
		
		for (Endereco endereco : lista) {
			System.out.println(endereco.getLogradouro() +" "+ endereco.getCep());
		}
		
		em.close();
		System.exit(0);
		
	}

}
