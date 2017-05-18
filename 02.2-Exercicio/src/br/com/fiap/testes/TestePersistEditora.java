package br.com.fiap.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entities.Editora;
import br.com.fiap.helper.JPaneHelper;

public class TestePersistEditora {

	public static void main(String[] args) {

		JPaneHelper jph = new JPaneHelper();
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("KENZO_RM76801");
		EntityManager em = emf.createEntityManager();
		Editora editora = new Editora(
				0,
				jph.InputString("CNPJ Editora"),
				jph.InputString("Nome Editora"),
				jph.InputString("Endereço Editora")
				);
		try{
			em.persist(editora);
			em.getTransaction().begin();
			em.getTransaction().commit();
		}catch (Exception e) {
			e.printStackTrace();
		}		
		
	}

}
