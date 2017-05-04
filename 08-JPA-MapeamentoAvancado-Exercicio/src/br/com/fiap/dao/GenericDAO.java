package br.com.fiap.dao;

import br.com.fiap.exception.CommitException;
import br.com.fiap.exception.EntityNotFoundException;

public interface GenericDAO<T,K> {

	void insert(T entidade);
	void update(T entidade);
	void delete(K id) throws EntityNotFoundException;
	T findById(K id);
	void save() throws CommitException;
	
}