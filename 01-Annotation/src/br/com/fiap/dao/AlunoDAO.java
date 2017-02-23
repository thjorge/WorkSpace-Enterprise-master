package br.com.fiap.dao;

import br.com.fiap.annotation.Tabela;

@Tabela(table_name="ALUNO")
public class AlunoDAO extends PessoaDAO{

	@Override
	public void remover(int id){
		//Remove um aluno
	}
}
