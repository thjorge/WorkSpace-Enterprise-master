package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.dao.AnimalDAO;
import br.com.fiap.entities.Animal;

public class AnimalDAOImpl extends GenericDAOImpl<Animal, Integer> implements AnimalDAO{

	public AnimalDAOImpl(EntityManager em) {
		super(em);
	}

}
