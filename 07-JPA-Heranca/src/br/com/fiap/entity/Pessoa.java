package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_PESSOA")
@Inheritance(strategy=InheritanceType.JOINED)
@SequenceGenerator(name="sqPessoa",sequenceName="SQ_PESSOA",allocationSize=1)
public class Pessoa {

	@Id
	@Column(name="CD_PESSOA")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="sqPessoa")
	private int codigo;
	
	@Column(name="NM_PESSOA")
	private String nome;
	
	@Column(name="DS_ENDERECO")
	private String endereco;

	public Pessoa() {
		super();
	}

	public Pessoa(int codigo, String nome, String endereco) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.endereco = endereco;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
}
