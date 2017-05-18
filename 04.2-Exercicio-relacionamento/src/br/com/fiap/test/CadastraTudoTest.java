package br.com.fiap.test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.dao.impl.TimeDAOImpl;
import br.com.fiap.entity.Campeonato;
import br.com.fiap.entity.Jogador;
import br.com.fiap.entity.Tecnico;
import br.com.fiap.entity.Time;
import br.com.fiap.singleton.EntityManagerSingletonFactory;

public class CadastraTudoTest {

	public static void main(String[] args) {
	
		//Obter o EntityManager
		EntityManager em = EntityManagerSingletonFactory.getInstance().createEntityManager();
		//instanciar um TimeDAOImpl
		TimeDAOImpl dao = new TimeDAOImpl(em);
		//Instanciar a galera
		Tecnico tecnico = new Tecnico("ThiYama");
		Time time = new Time(0,"2TDSA",Calendar.getInstance(),2,tecnico);
		//Lista para cadastrar no time
		time.addJogador(new Jogador("Attera"));
		time.addJogador(new Jogador("Baldera"));
		time.addJogador(new Jogador("Rafera"));
		
		List<Campeonato> camps = new ArrayList<Campeonato>();
		camps.add(new Campeonato("Smart World"));
		camps.add(new Campeonato("Startup One"));
		
		time.setCampeonatos(camps);
		
		//Cadastrar o time e commit
		try {
			dao.cadastrar(time);
			dao.salvar();
		} catch (Exception e) {
			e.printStackTrace();
			em.close();
		}				
		//Sucesso!
		
	}
	
}
