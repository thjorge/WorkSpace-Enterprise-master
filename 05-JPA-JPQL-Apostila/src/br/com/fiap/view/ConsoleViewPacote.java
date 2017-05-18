package br.com.fiap.view;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.dao.EntityManagerFactorySingleton;
import br.com.fiap.dao.impl.PacoteDAOImpl;
import br.com.fiap.entity.Pacote;

public class ConsoleViewPacote {

	public static void main(String[] args) {

		//Listar pacotes
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		PacoteDAOImpl dao = new PacoteDAOImpl(em);
		List<Pacote> lista = dao.buscarPorQuantidadeDiasMinimo(8);

		for(Pacote p : lista){
			System.out.println(
					"Pacote " + p.getId() +
					"------------------"
					+ "\nDescrição: " + p.getDescricao() + 
					"\nPreço: " + p.getPreco() + 
					"\nQTD Dias: " + p.getQtdDias());
		}

		em.close();
		System.exit(0);

	}

}
