package br.com.fiap.view;

import javax.persistence.EntityManager;

import br.com.fiap.dao.PessoaDAO;
import br.com.fiap.dao.impl.PessoaDAOImpl;
import br.com.fiap.entity.PessoaFisica;
import br.com.fiap.entity.PessoaJuridica;
import br.com.fiap.entity.Sexo;
import br.com.fiap.exception.DBException;
import br.com.fiap.factory.EntityManagerFactorySingleton;

public class Teste {

	public static void main(String[] args) {
		
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		
		PessoaDAO dao = new PessoaDAOImpl(em);
		
		PessoaFisica pf = new PessoaFisica(0,"Allen", "Lins de Vasconcelos","2234",Sexo.MASCULINO);
		
		PessoaJuridica pj = new PessoaJuridica(0, "Helena", "Matsukaze", "322534", "BirdTaylor");
		
		try {
			dao.cadastrar(pf);
			dao.cadastrar(pj);
			dao.salvar();
		} catch (DBException e) {
			e.printStackTrace();
		}
		
		em.close();
		System.exit(0);
		
	}
	
}
