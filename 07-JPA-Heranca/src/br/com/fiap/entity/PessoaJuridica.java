package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="TB_PESSOA_JURIDICA")
public class PessoaJuridica extends Pessoa{

	@Column(name="DS_CNPJ")
	private String cnpj;
	
	@Column(name="DS_NOME_FANTASIA")
	private String nomeFantasia;

	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(int codigo, String nome, String endereco, String cnpj, String nomeFantasia) {
		super(codigo, nome, endereco);
		this.cnpj = cnpj;
		this.nomeFantasia = nomeFantasia;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	
}
