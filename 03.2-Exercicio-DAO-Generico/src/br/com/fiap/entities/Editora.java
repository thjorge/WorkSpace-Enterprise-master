package br.com.fiap.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_EDITORA")
@SequenceGenerator(name="sqEditora",sequenceName="SQ_EDITORA",allocationSize=1)
public class Editora {

	@Id
	@Column(name="CD_EDITORA")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="sqEditora")
	private int id;
	
	@Column(name="DS_CNPJ",length=100)
	private String cnpj;
	
	@Column(name="NM_EDITORA",length=300)
	private String nome;
	
	@Column(name="DS_ENDERECO",length=400,nullable=true)
	private String endereco;

	public Editora(){
		
	}
	
	public Editora(int id, String cnpj, String nome, String endereco) {
		super();
		this.id = id;
		this.cnpj = cnpj;
		this.nome = nome;
		this.endereco = endereco;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
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
