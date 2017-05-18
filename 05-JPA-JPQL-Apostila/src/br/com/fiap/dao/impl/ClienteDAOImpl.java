package br.com.fiap.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.entity.Cliente;

public class ClienteDAOImpl extends GenericDAOImpl<Cliente,Integer> implements ClienteDAO{

	public ClienteDAOImpl(EntityManager entityManager) {
		super(entityManager);
	}

	@Override
	public List<Cliente> buscarPorEstado(String estado) {
		TypedQuery<Cliente> query =
				em.createQuery("from Cliente c where c.endereco.cidade.uf = :estado",Cliente.class);
		query.setParameter("estado", estado);
		return query.getResultList();
	}

	@Override
	public List<Cliente> buscarPorReservaQuantDia(int quantidadeDias) {
		TypedQuery<Cliente> query = 
				em.createQuery("select r.cliente from Reserva r where r.numeroDias = :dias",Cliente.class);
		query.setParameter("dias", quantidadeDias);	
		
		//Limita o máximo de buscas como resultado
		query.setMaxResults(50);
		
		return query.getResultList();
	}

	@Override
	public List<Cliente> buscar(String nome, String cidade) {
		TypedQuery<Cliente> query = em.createQuery("from Cliente c where c.nome like :nome and c.endereco.cidade.nome like :cidade",Cliente.class);
		query.setParameter("nome", "%"+nome+"%");
		query.setParameter("cidade", "%"+cidade+"%");
		return query.getResultList();
	}

	@Override
	public List<Cliente> buscarPorEstados(List<String> estados) {
		TypedQuery<Cliente> query = em.createQuery("from Cliente c where c.endereco.cidade.uf in (:estados)",Cliente.class);
		query.setParameter("estados", estados);
		return query.getResultList();
	}

	@Override
	public int buscarQtdClientes() {
		TypedQuery<Long> query = em.createQuery("select count(c) from Cliente c",Long.class);
		return query.getSingleResult().intValue();
	}

	@Override
	public Cliente buscaPorCpf(String cpf) {
		return em.createNamedQuery("Cliente.porCpf",Cliente.class).setParameter("cpf", cpf).getSingleResult();
	}

	@Override
	public List<Cliente> buscaAniversarianteMes() {
		return em.createNamedQuery("Cliente.porMesAniversariante",Cliente.class).getResultList();
	}

	@Override
	public List<Cliente> buscaPorMesAniversario(int mes) {
		return em.createNamedQuery("Cliente.porMesAniversario",Cliente.class).setParameter("mes", mes).getResultList();
	}
	
	

}
