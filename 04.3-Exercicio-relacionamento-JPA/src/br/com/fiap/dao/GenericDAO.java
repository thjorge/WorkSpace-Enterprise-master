package br.com.fiap.dao;

import java.util.List;

import br.com.fiap.exception.DBException;
import br.com.fiap.exception.IdNotFoundException;

public interface GenericDAO<T,K> {

	void cadastrar(T entity);
	void alterar(T entity);
	void remover(K key)throws IdNotFoundException;
	T buscar(K key);
	void salvar()throws DBException;
	List<T> listar();
		
}
