package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.dao.EmprestimoDAO;
import br.com.fiap.entities.Emprestimo;

public class EmprestimoDAOImpl extends GenericDAOImpl<Emprestimo, Integer> implements EmprestimoDAO{

	public EmprestimoDAOImpl(EntityManager em) {
		super(em);
	}

}
