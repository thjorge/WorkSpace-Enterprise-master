package br.com.fiap.teste;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.dao.GrupoAMDAO;
import br.com.fiap.dao.impl.GrupoAMDAOImpl;
import br.com.fiap.entity.Aluno;
import br.com.fiap.entity.GrupoAM;
import br.com.fiap.excecoes.DBException;
import br.com.fiap.factory.EntityManagerFactorySingleton;

public class ManyToOneTeste {

	public static void main(String[] args) {

		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		
		GrupoAMDAO grupoDao = new GrupoAMDAOImpl(em);
		
		//Instanciar o grupo e alunos
		GrupoAM grupo = new GrupoAM(0,"Grupo d'as Magia");	
	
		Aluno aluno = new Aluno(0,"Attos",new GregorianCalendar(1990,Calendar.APRIL,12),grupo);
		Aluno aluno2 = new Aluno(0,"Gabriel",new GregorianCalendar(1972,Calendar.OCTOBER,4),grupo);
		Aluno aluno3 = new Aluno(0,"Melissa",new GregorianCalendar(1951,Calendar.MAY,23),grupo);
		Aluno aluno4 = new Aluno(0,"Sabonete",new GregorianCalendar(1995,Calendar.AUGUST,13),grupo);
		
		//Criar uma lista de alunos e adiciona-los
		List<Aluno> lstAlunos = new ArrayList<Aluno>();
		lstAlunos.add(aluno);
		lstAlunos.add(aluno2);
		lstAlunos.add(aluno3);
		lstAlunos.add(aluno4);
		
		//Coloca a lista de alunos no grupo
		grupo.setAlunos(lstAlunos);
		
		grupoDao.cadastrar(grupo);
		
		try {
			grupoDao.salvar();
		} catch (DBException e) {
			e.printStackTrace();
		}
		
		em.close();
		System.exit(0);
	}

}
