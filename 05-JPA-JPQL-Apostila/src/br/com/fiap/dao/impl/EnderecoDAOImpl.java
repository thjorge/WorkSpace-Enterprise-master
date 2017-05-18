package br.com.fiap.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.dao.EnderecoDAO;
import br.com.fiap.entity.Endereco;

public class EnderecoDAOImpl extends GenericDAOImpl<Endereco,Integer> implements EnderecoDAO{

	public EnderecoDAOImpl(EntityManager entityManager) {
		super(entityManager);
	}

	@Override
	@SuppressWarnings("all")
	public List<Endereco> buscaPorCep(String cep) {
		return em.createNativeQuery("select * from endereco where cep = :cep",Endereco.class)
				.setParameter("cep", cep)
				.getResultList();
	}

}
