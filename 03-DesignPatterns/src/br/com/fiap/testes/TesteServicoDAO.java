package br.com.fiap.testes;

import br.com.fiap.dao.impl.ServicoDAOImpl;
import br.com.fiap.entities.Servico;
import br.com.fiap.factory.EntityManagerFactorySingleton;

public class TesteServicoDAO {

	public static void main(String[] args) {
		
		ServicoDAOImpl dao = new ServicoDAOImpl(
				EntityManagerFactorySingleton
				.getInstance()
				.createEntityManager());
		
		Servico servico = new Servico(0,"Banho",15.99);
		
		dao.cadastrar(servico);
		System.out.println("Serviço cadastrado");
		
	}

}
