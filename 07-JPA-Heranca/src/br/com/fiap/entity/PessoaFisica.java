package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="TB_PESSOA_FISICA")
public class PessoaFisica extends Pessoa{

	@Column(name="DS_CPF")
	private String cpf;
	
	@Column(name="DS_SEXO")
	private Sexo sexo;

	public PessoaFisica() {
		super();
	}

	public PessoaFisica(int codigo, String nome, String endereco, String cpf, Sexo sexo) {
		super(codigo, nome, endereco);
		this.cpf = cpf;
		this.sexo = sexo;
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
