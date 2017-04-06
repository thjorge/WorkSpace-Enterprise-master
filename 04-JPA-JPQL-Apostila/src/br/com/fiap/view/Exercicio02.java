package br.com.fiap.view;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.dao.EntityManagerFactorySingleton;
import br.com.fiap.dao.PacoteDAO;
import br.com.fiap.dao.TransporteDAO;
import br.com.fiap.dao.impl.ClienteDAOImpl;
import br.com.fiap.dao.impl.PacoteDAOImpl;
import br.com.fiap.dao.impl.TransporteDAOImpl;
import br.com.fiap.entity.Cliente;
import br.com.fiap.entity.Pacote;
import br.com.fiap.entity.Transporte;

public class Exercicio02 {
	
	public static void main(String[] args) {
		EntityManager em = EntityManagerFactorySingleton
				.getInstance().createEntityManager();
		
		PacoteDAO pacoteDao = new PacoteDAOImpl(em);
		TransporteDAO transporteDao = new TransporteDAOImpl(em);
		
		Transporte transporte = transporteDao.pesquisar(1);
		List<Pacote> lista = pacoteDao.buscarPorTransporte(transporte);
		
		System.out.println(transporte.getEmpresa());
		System.out.println(" ");
		for (Pacote pacote : lista) {
			System.out.println(pacote.getDescricao());
			System.out.println(pacote.getTransporte().getEmpresa());
		}
		
		em.close();
		System.exit(0);
	}

}

