package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.dao.EditoraDAO;
import br.com.fiap.entities.Editora;

public class EditoraDAOImpl extends GenericDAOImpl<Editora, Integer> implements EditoraDAO{

	public EditoraDAOImpl(EntityManager em) {
		super(em);
	}

}
