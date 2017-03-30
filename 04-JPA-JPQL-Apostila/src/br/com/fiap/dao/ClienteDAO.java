package br.com.fiap.dao;

import java.util.List;

import br.com.fiap.entity.Cliente;
import br.com.fiap.entity.Pacote;

public interface ClienteDAO extends GenericDAO<Cliente,Integer>{

	List<Cliente> buscarTodosClientes();
	List<Cliente>buscarEstados();
}
