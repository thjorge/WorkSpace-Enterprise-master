package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ExemplarDAO;
import br.com.fiap.entities.Exemplar;

public class ExemplarDAOImpl extends GenericDAOImpl<Exemplar, Integer> implements ExemplarDAO{

	public ExemplarDAOImpl(EntityManager em) {
		super(em);
	}

}
