package br.com.fiap.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
	
	@Column(name="DS_CNPJ",length=100,nullable=false)
	private String cnpj;
	
	@Column(name="NM_EDITORA",length=300,nullable=false)
	private String nome;
	
	@Column(name="DS_ENDERECO",length=400)
	private String endereco;

	@OneToMany(mappedBy="editora",cascade=CascadeType.PERSIST)
	private List<Livro> livros;

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
