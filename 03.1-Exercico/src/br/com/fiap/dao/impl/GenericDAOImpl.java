package br.com.fiap.dao.impl;

import java.lang.reflect.ParameterizedType;

import javax.persistence.EntityManager;

import br.com.fiap.dao.GenericDAO;
import br.com.fiap.dao.exception.BDException;
import br.com.fiap.factory.EntityManagerFactorySingleton;

public class GenericDAOImpl<T,K> implements GenericDAO<T, K> {

	private EntityManager em = EntityManagerFactorySingleton
							.getInstance().createEntityManager();
	
	private Class<T> classe;
	
	
	@SuppressWarnings("unchecked")
	public GenericDAOImpl() {
		classe = (Class<T>)((ParameterizedType)getClass()
				.getGenericSuperclass()).getActualTypeArguments()[0];
	}	
	
	
	@Override
	public void cadastrar(T entity) throws BDException {
		try {
			em.getTransaction().begin();
			em.persist(entity);
			em.getTransaction().commit();	
		} catch (Exception e) {
			if(em.getTransaction().isActive())
				em.getTransaction().rollback();
			e.printStackTrace();
			throw new BDException("Erro ao cadastrar !");
		}
		
	}

	@Override
	public void alterar(T entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover(T entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T pesquisar(K codigo) {
		// TODO Auto-generated method stub
		return null;
	}

}
