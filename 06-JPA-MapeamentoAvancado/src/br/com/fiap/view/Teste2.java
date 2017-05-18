package br.com.fiap.view;

import javax.persistence.EntityManager;

import br.com.fiap.dao.DependenteDAO;
import br.com.fiap.dao.impl.DependenteDAOImpl;
import br.com.fiap.entity.Dependente;
import br.com.fiap.entity.Funcionario;
import br.com.fiap.exception.DBException;
import br.com.fiap.factory.EntityManagerFactorySingleton;

public class Teste2 {

	public static void main(String[] args) {

		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		
		DependenteDAO dao = new DependenteDAOImpl(em);
		
		Funcionario func = new Funcionario(0,"Maneraço",1212,"122-9");
		
		Dependente dep = new Dependente(0,func,"LeL");
		
		try {
			dao.cadastrar(dep);
			dao.salvar();
		} catch (DBException e) {
			e.printStackTrace();
		}
		
		em.close();
		System.exit(0);
		
	}

}
