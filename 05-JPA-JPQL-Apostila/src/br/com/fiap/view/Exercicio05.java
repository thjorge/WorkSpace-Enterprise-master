package br.com.fiap.view;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.dao.EntityManagerFactorySingleton;
import br.com.fiap.dao.PacoteDAO;
import br.com.fiap.dao.impl.PacoteDAOImpl;
import br.com.fiap.entity.Pacote;

public class Exercicio05 {

	public static void main(String[] args) {

		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		PacoteDAO dao = new PacoteDAOImpl(em);
		
		List<Pacote> lista = dao.buscarPorDatas(
				new GregorianCalendar(2017,Calendar.JANUARY,1),
				new GregorianCalendar(2017,Calendar.DECEMBER,31));
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		for (Pacote pacote : lista) {
			System.out.println(
					"Pacote: "+pacote.getDescricao()+
					"\nData: "+sdf.format(pacote.getDataSaida().getTime()));
		}
		
		em.close();
		System.exit(0);
		
	}

}
