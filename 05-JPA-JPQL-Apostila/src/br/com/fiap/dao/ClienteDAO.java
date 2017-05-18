package br.com.fiap.dao;

import java.util.List;

import br.com.fiap.entity.Cliente;

public interface ClienteDAO extends GenericDAO<Cliente,Integer>{

	List<Cliente> buscarPorEstado(String estado);
	
	List<Cliente> buscarPorReservaQuantDia(int quantidadeDias);
	
	List<Cliente> buscar(String nome, String cidade);
	
	List<Cliente> buscarPorEstados(List<String> estados);
	
	int buscarQtdClientes();
	
	Cliente buscaPorCpf(String cpf);
	
	List<Cliente> buscaAniversarianteMes();
	
	List<Cliente> buscaPorMesAniversario(int mes);
}
