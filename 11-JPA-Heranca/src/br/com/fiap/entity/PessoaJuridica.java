package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
public class PessoaJuridica extends Pessoa{

	@Column(name="NR_CNPJ")
	private String cnpj;
	
	@Column(name="NM_FANTASIA")
	private String nomeFantasia;

	public PessoaJuridica(String nome, String endereço, String string, String nomeFantasia) {
		super(nome, endereço);
		this.cnpj = string;
		this.nomeFantasia = nomeFantasia;
	}

	public PessoaJuridica() {
		super();
		
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
