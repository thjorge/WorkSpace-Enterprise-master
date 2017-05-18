package br.com.fiap.testes;

import javax.persistence.EntityManager;

import org.junit.Assert;
import org.junit.Test;

import br.com.fiap.dao.ServicoDAO;
import br.com.fiap.dao.impl.ServicoDAOImpl;
import br.com.fiap.entities.Servico;
import br.com.fiap.excecoes.DBException;
import br.com.fiap.factory.EntityManagerFactorySingleton;

public class GenericDAOTest {

	@Test
	public void cadastroTest() {
		//Chamar o Entity Manager
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		//Instancar o objetos
		ServicoDAO dao = new ServicoDAOImpl(em);
		Servico servico = new Servico(0,"Banho",40);

		try{
			//Chamar o serviço /cadastrar
			dao.cadastrar(servico);
			dao.salvar();

			//Testar o resultado
			Assert.assertNotEquals(servico.getCodigo(), 0);
		}catch (DBException e) {
			e.printStackTrace();
			Assert.fail();
		}finally{
			em.close();
		}
	}

	@Test
	public void buscarTest(){
		//Chamar o Entity Manager
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		//Instanciar o serviço
		ServicoDAO dao = new ServicoDAOImpl(em);
		Servico servico = new Servico(0, "Loucura", 55);

		//Cadastrar o serviço
		try{
			dao.cadastrar(servico);
			dao.salvar();
		}catch (DBException e) {
			e.printStackTrace();
			Assert.fail();
		}
		//Chamar o método buscar dao
		Servico resultado = dao.buscarPorId(servico.getCodigo());
		//Valido se encontrou o serviço no banco
		Assert.assertNotNull(resultado);
		em.close();
	}

	@Test
	public void removerTest(){
		//Chamar o Entity Manager
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		//Instancar o objetos
		ServicoDAO dao = new ServicoDAOImpl(em);
		Servico servico = new Servico(0, "Eita", 55);

		try{
			//Cadastrar o serviço
			dao.cadastrar(servico);
			dao.salvar();

			//Remover um serviço
			dao.remover(servico.getCodigo());
			dao.salvar();

			//Testar o resultado
			Servico busca = dao.buscarPorId(servico.getCodigo());
			Assert.assertNull(busca);			

		}catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}finally {
			em.close();
		}
	}

	@Test
	public void atualizarTest(){
		//Chamar o Entity Manager
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		//Instancar o objetos
		ServicoDAO dao = new ServicoDAOImpl(em);
		Servico servico = new Servico(0, "Aqui tem pudim", 55);

		try{
			//Cadastrar o serviço
			dao.cadastrar(servico);
			dao.salvar();
			
			//Atualizar o serviço
			servico.setNome("Atualizado");
			servico.setPreco(30);
			dao.atualizar(servico);
			dao.salvar();
			
			//Testar o resultado
			Servico busca = dao.buscarPorId(servico.getCodigo());
			Assert.assertEquals(servico.getNome(), busca.getNome());
			Assert.assertEquals(servico.getPreco(),busca.getPreco(),0.0);
			
		}catch (DBException e) {
			e.printStackTrace();
			Assert.fail();
		}finally {
			em.close();
		}

	}

}
