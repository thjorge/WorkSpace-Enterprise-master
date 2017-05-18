package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ProjetoAMDAO;
import br.com.fiap.entity.ProjetoAM;

public class ProjetoAMDAOImpl extends GenericDAOImpl<ProjetoAM, Integer> implements ProjetoAMDAO{

	public ProjetoAMDAOImpl(EntityManager em) {
		super(em);
	}

}
