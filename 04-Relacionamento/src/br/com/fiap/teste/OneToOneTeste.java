package br.com.fiap.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;

import br.com.fiap.dao.impl.GrupoAMDAOImpl;
import br.com.fiap.dao.impl.ProjetoAMDAOImpl;
import br.com.fiap.entity.GrupoAM;
import br.com.fiap.entity.ProjetoAM;
import br.com.fiap.excecoes.DBException;
import br.com.fiap.factory.EntityManagerFactorySingleton;

public class OneToOneTeste {

	public static void main(String[] args) {
		//Cadastrar as duas entidades (GrupoAM e ProjetoAM)
		
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		
		//Cadastrar grupo
		GrupoAMDAOImpl grupoDao = new GrupoAMDAOImpl(em);
		GrupoAM grupo = new GrupoAM(0,"Grupo1");
		//Com o cascade é possível deixar o framework cadastrar as dependencias de um objeto
		//grupoDao.cadastrar(grupo);
		
		//Cadastrar projeto
		ProjetoAMDAOImpl projetoDao = new ProjetoAMDAOImpl(em);
		ProjetoAM projeto = new ProjetoAM();
		projeto.setTema("Advocacia2");
		projeto.setDtInicio(Calendar.getInstance());
		projeto.setDtEntrega(new GregorianCalendar(2017,Calendar.NOVEMBER,18));
		projeto.setGrupo(grupo);
		projetoDao.cadastrar(projeto);
		
		//Get transaction e commit
		try {
			grupoDao.salvar();
		} catch (DBException e) {
			e.printStackTrace();
		}
		
		//NÃO ESQUECER
		em.close();
		System.exit(0);
		
	}

}
