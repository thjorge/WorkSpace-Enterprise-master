package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.dao.GrupoAMDAO;
import br.com.fiap.entity.GrupoAM;

public class GrupoAMDAOImpl extends GenericDAOImpl<GrupoAM, Integer> implements GrupoAMDAO{

	public GrupoAMDAOImpl(EntityManager em) {
		super(em);
	}

}
