package br.com.fiap.dao;

import br.com.fiap.excecoes.DBException;
import br.com.fiap.excecoes.IdNotFoundException;

public interface GenericDAO<T,K> {

	void cadastrar(T entity);

	T buscarPorId(K id);

	void atualizar(T entity);

	void remover(K id) throws IdNotFoundException;
	
	void salvar() throws DBException;

}
