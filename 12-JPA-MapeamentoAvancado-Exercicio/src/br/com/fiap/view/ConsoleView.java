package br.com.fiap.view;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ContaDAO;
import br.com.fiap.dao.impl.ContaDAOImpl;
import br.com.fiap.entity.Agencia;
import br.com.fiap.entity.ContaCorrente;
import br.com.fiap.entity.ContaPoupanca;
import br.com.fiap.exception.CommitErrorException;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class ConsoleView {

	public static void main(String[] args) {
		
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		ContaDAO dao = new ContaDAOImpl(em);
		
		
		Agencia agencia = new Agencia();
		agencia.setEndereco("Av Lins");
		
		ContaCorrente cc = new ContaCorrente(agencia, 1400, 20, 150000);
		ContaPoupanca cp = new ContaPoupanca(agencia, 100, 1);
		
		try {
			dao.create(cc);
			dao.create(cp);			
			dao.commit();
		} catch (CommitErrorException e) {
			e.printStackTrace();
		}
		
		
		
		em.close();
		System.exit(0);
		
		
		
	}

}
