package br.com.fiap.dao.impl;

import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.entity.Cliente;
import br.com.fiap.entity.Pacote;

public class ClienteDAOImpl extends GenericDAOImpl<Cliente,Integer> implements ClienteDAO{

	public ClienteDAOImpl(EntityManager entityManager) {
		super(entityManager);
		}	

	@Override
	public List<Cliente> buscarPorEstado(String estado) {
		TypedQuery<Cliente> query = 
				em.createQuery("from Cliente c where c.endereco.cidade.uf = :es",Cliente.class);
		query.setParameter("es", estado);
		return query.getResultList();
	}

	@Override
	public List<Cliente> buscarPorDiasReserva(int dias) {
		TypedQuery<Cliente> query = 
				em.createQuery("select r.cliente from Reserva r where r.numeroDias = :n",Cliente.class);
		query.setParameter("n", dias);
		
		query.setMaxResults(50); //Maximo de 50 linhas
		return query.getResultList();
	}

	@Override
	public List<Cliente> buscarCidade(String nome, String cidade) {
			TypedQuery<Cliente> query = 
					em.createQuery("from Cliente c where :nome = c.nome and :cidade = c.endereco.cidade.nome",Cliente.class);
			query.setParameter("nome", nome);
			query.setParameter("cidade", cidade);
		
		return query.getResultList();
	}

	@Override
	public List<Cliente> buscaPorEstado(Collection<String> estados) {
			TypedQuery<Cliente> query = 
					em.createQuery("from Cliente c where c.endereco.cidade.uf = :estado",Cliente.class);
			query.setParameter("estado", estados);
				
		return query.getResultList();
	}

}



