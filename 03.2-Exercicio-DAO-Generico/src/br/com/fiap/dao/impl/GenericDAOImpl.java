package br.com.fiap.dao.impl;

import java.lang.reflect.ParameterizedType;

import javax.persistence.EntityManager;

import br.com.fiap.dao.GenericDAO;

public class GenericDAOImpl<T,K> implements GenericDAO<T, K> {

	//.class da entidade(usado na busca)
	private Class<T> classe;
	private EntityManager em;

	//Construtor (Sim, copiei mesmo)
	@SuppressWarnings("unchecked")
	public GenericDAOImpl(EntityManager em){
		this.em = em;
		classe = (Class<T>) ((ParameterizedType)getClass()
				.getGenericSuperclass())
				.getActualTypeArguments()[0];
	}

	@Override
	public void cadastrar(T entidade) {
		em.persist(entidade);
	}

	@Override
	public void atualizar(T entidade) {
		em.merge(entidade);
	}

	@Override
	public void excluir(K chave) {
		em.remove(buscarPorId(chave));
	}

	@Override
	public T buscarPorId(K chave) {
		return em.find(classe, chave);
	}

	@Override
	public void salvar() {
		try{
			em.getTransaction().begin();
			em.getTransaction().commit();
		}catch (Exception e) {
			if(em.getTransaction().isActive()){
				em.getTransaction().rollback();
			}
		}		
	}



}
