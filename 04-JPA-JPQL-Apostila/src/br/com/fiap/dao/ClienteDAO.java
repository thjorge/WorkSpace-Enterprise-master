package br.com.fiap.dao;

import java.util.Collection;
import java.util.List;

import br.com.fiap.entity.Cliente;
import br.com.fiap.entity.Pacote;

public interface ClienteDAO extends GenericDAO<Cliente,Integer>{
	
	List<Cliente> buscarPorEstado(String estado);
	
	List<Cliente> buscarPorDiasReserva(int dias);
	
	List<Cliente> buscarCidade(String nome, String cidade);
	
	List<Cliente> buscaPorEstado(Collection<String>estados);
	
}
