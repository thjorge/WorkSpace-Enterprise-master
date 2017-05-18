package br.com.fiap.dao;

public interface GenericDAO<T,K> {

	void cadastrar(T entidade);
	void atualizar(T entidade);
	void excluir(K chave);
	T buscarPorId(K chave);
	void salvar();
	
}
