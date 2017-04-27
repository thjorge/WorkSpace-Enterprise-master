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
@SequenceGenerator(name="seqPessoa",sequenceName="QS_TB_PESSOA",allocationSize=1)
@Inheritance(strategy=InheritanceType.JOINED)
public class Pessoa {
	
	@Id
	@Column(name="CD_PESSOA")
	@GeneratedValue(generator="seqPessoa",strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name="NM_PESSOA",nullable=false)
	private String nome;
	
	@Column(name="DS_ENDERECO")
	private String endere�o;

	public Pessoa(String nome, String endere�o) {
		super();
		this.nome = nome;
		this.endere�o = endere�o;
	}

	public Pessoa() {
		super();		
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

	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}
	
	
	
	

}
