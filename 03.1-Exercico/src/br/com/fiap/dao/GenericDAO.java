package br.com.fiap.dao;

import br.com.fiap.dao.exception.BDException;

public interface GenericDAO <T,K>{

	void cadastrar(T entity) throws BDException;
	void alterar(T entity);
	void remover(T entity);
	T pesquisar(K codigo);
	
}
