package br.com.fiap.dao.impl;

import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.fiap.dao.PacoteDAO;
import br.com.fiap.entity.Pacote;
import br.com.fiap.entity.Transporte;

public class PacoteDAOImpl extends GenericDAOImpl<Pacote,Integer> implements PacoteDAO{

	public PacoteDAOImpl(EntityManager entityManager) {
		super(entityManager);
	}

	@Override
	public List<Pacote> buscarPorQuantidadeDiasMinimo(int dias) {
		TypedQuery<Pacote> query = //Nome da classe e do atributo
				em.createQuery("from Pacote p where p.qtdDias > :churros",Pacote.class);
		query.setParameter("churros", dias);
		return query.getResultList();
	}

	@Override
	public List<Pacote> buscaPorTransporte(Transporte transporte) {
		TypedQuery<Pacote> query = 
				em.createQuery("from Pacote p where p.transporte = :trans",Pacote.class);
		query.setParameter("trans", transporte);
		return query.getResultList();
	}

	@Override
	public List<Pacote> buscarPorDatas(Calendar inicio, Calendar fim) {
		TypedQuery<Pacote> query = em.createQuery("from Pacote p where p.dataSaida between :inicio and :fim",Pacote.class);
		query.setParameter("inicio", inicio);
		query.setParameter("fim", fim);
		return query.getResultList();
	}

	@Override
	public double mediaPrecoPacote() {
		TypedQuery<Double> query = em.createQuery("select avg(p.preco) from Pacote p",Double.class);
		return query.getSingleResult().doubleValue();
	}

	@Override
	public int buscaQtdPacotePorData(Calendar inicio, Calendar fim) {
		TypedQuery<Long> query = em.createQuery("select count(p) from Pacote p where p.dataSaida between :inicio and :fim",Long.class);
		query.setParameter("inicio", inicio);
		query.setParameter("fim", fim);
		return query.getSingleResult().intValue();
	}

	@Override
	public Pacote buscaPacoteComMaiorPreco() {
		TypedQuery<Pacote> query = em.createQuery("from Pacote p where p.preco = (select max(p.preco) from Pacote p)",Pacote.class);
		return query.getSingleResult();
	}

}
