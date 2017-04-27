package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
public class PessoaFisica extends Pessoa{
	
	@Column(name="NR_CPF")
	private String cpf;
	
	@Column(name="DS_SEXO")
	private Sexo sexo;	

	public PessoaFisica(String nome, String endereço, String string, Sexo sexo) {
		super(nome, endereço);
		this.cpf = string;
		this.sexo = sexo;
	}

	public PessoaFisica() {
		super();		
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	
	
	

}
