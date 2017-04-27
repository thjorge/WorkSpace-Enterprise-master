package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_PRODUTO")
@SequenceGenerator(name="seqProd", sequenceName="SQ_TB_ALUNO",allocationSize=1)
public class Produto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seqProd")
	@Column(name="CD_PRODUTO")
	private int codigo;
	
	@Column(name="NM_PRODUTO",nullable=false)
	private String nome;
	
	@Column(name="DS_FABRICANTE")
	private String fabricante;

	public Produto(String nome, String fabricante) {
		super();		
		this.nome = nome;
		this.fabricante = fabricante;
	}

	public Produto() {
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

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	

	
	

}
