package br.com.fiap.view;

import javax.persistence.EntityManager;

import br.com.fiap.dao.PessoaDAO;
import br.com.fiap.dao.impl.PessoaDAOImpl;
import br.com.fiap.entity.PessoaFisica;
import br.com.fiap.entity.PessoaJuridica;
import br.com.fiap.entity.Sexo;
import br.com.fiap.exception.CommitException;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class ConsoleView {

	public static void main(String[] args) {
		
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		PessoaDAO dao = new PessoaDAOImpl(em);
		
		PessoaFisica pf = new PessoaFisica("Wallace", "Rua Lindia", "1654086549684", Sexo.MASCULINO);
		PessoaJuridica pj = new PessoaJuridica("Tivit", "Em todo lugar", "151545615/15100-12", "Atos Trabalhador");
			
			try {
				dao.insert(pf);
				dao.insert(pj);
				dao.save();
			} catch (CommitException e) {				
				e.printStackTrace();
			}
		
		
		em.close();
		System.exit(0);
	
	
	}
	
}
