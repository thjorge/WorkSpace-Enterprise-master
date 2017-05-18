package br.com.fiap.view;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ContaDAO;
import br.com.fiap.dao.impl.ContaDAOImpl;
import br.com.fiap.entity.Agencia;
import br.com.fiap.entity.ContaCorrente;
import br.com.fiap.entity.ContaPoupanca;
import br.com.fiap.factory.EntityManagerFactorySingleton;

public class TesteCadastroConta {
	
	public static void main(String[] args) {

		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		
		ContaDAO dao = new ContaDAOImpl(em);
		
		Agencia agencia = new Agencia(0,"Lins");
		
		ContaCorrente cc = new ContaCorrente(0,agencia,900,20,450);
		
		ContaPoupanca cp = new ContaPoupanca(0,agencia,780,0.1);
		
		try{
			dao.cadastrar(cp);
			dao.cadastrar(cc);
			dao.salvar();
			System.out.println("Deu bom!");
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			em.close();
			System.exit(0);
		}		
		
	}
}
