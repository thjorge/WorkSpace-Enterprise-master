package br.com.fiap.view;


import javax.persistence.EntityManager;

import br.com.fiap.dao.DependeteDAO;
import br.com.fiap.dao.impl.DependenteDAOImpl;
import br.com.fiap.entity.Dependente;
import br.com.fiap.entity.Funcionario;
import br.com.fiap.exception.DBException;
import br.com.fiap.factory.EntityManagerFactorySingleton;

public class ExercicioView {

	public static void main(String[] args) {
	
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		DependeteDAO dao = new DependenteDAOImpl(em);
		
		Funcionario funcionario = new Funcionario("Marcelo", 10000, "12345-0");
		Dependente dependente = new Dependente(funcionario, "Beatriz");
		
		
		try {
			dao.cadastrar(dependente);
			dao.salvar();
		} catch (DBException e) {
				e.printStackTrace();
		}
		
		em.close();
		System.exit(0);
		

	}

}
