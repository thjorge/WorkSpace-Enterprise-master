package br.com.fiap.teste;

import javax.persistence.EntityManager;
import javax.swing.JOptionPane;

import br.com.fiap.dao.impl.GrupoAMDAOImpl;
import br.com.fiap.entity.GrupoAM;
import br.com.fiap.entity.ProjetoAM;
import br.com.fiap.factory.EntityManagerFactorySingleton;

public class OneToOneBidirecionalTeste {

	public static void main(String[] args) {
		//Buscar um grupo e exibir as propriedades do projeto
		
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		
		GrupoAMDAOImpl dao = new GrupoAMDAOImpl(em);
		
		//Pesquisa pelo grupo de código
		GrupoAM grupo = dao.buscarPorId(1);
		
		ProjetoAM projeto = grupo.getProjeto();
		
		JOptionPane.showMessageDialog(null, "Tema do projeto: " + projeto.getTema());
		
		em.close();
		System.exit(0);
	}
		
}
