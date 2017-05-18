package br.com.fiap.dao.impl;

import java.lang.reflect.ParameterizedType;

import javax.persistence.EntityManager;

import br.com.fiap.dao.GenericDAO;
import br.com.fiap.excecoes.DBException;
import br.com.fiap.excecoes.IdNotFoundException;

public class GenericDAOImpl<T,K> implements GenericDAO<T, K>{

	private EntityManager em;

	//.class da entidade(usado na busca)
	private Class<T> classe;

	//Construtor
	@SuppressWarnings("unchecked")
	public GenericDAOImpl(EntityManager em){
		this.em = em;
		classe = (Class<T>) ((ParameterizedType)getClass()
				.getGenericSuperclass())
				.getActualTypeArguments()[0];
	}

	@Override
	public void cadastrar(T entity){
		em.persist(entity);
	}

	@Override
	public T buscarPorId(K id){
		return em.find(classe, id);
	}

	@Override
	public void atualizar(T entity){
		em.merge(entity);
	}

	@Override
	public void remover(K id) throws IdNotFoundException {
		T entidade = buscarPorId(id);
		if(entidade == null){
			throw new IdNotFoundException("Entidade n�o encontrada");
		}
		em.remove(entidade);
	}

	public void salvar() throws DBException{
		try{
			em.getTransaction().begin();
			em.getTransaction().commit();
		}catch (Exception e) {
			if(em.getTransaction().isActive())
				em.getTransaction().rollback();
			throw new DBException("Erro no commit",e);
		}
	}


}
