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
@SequenceGenerator(name="sqProduto", sequenceName="SQ_PRODUTO", allocationSize=1)
public class Produto {

	@Id
	@Column(name="CD_PRODUTO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="sqProduto")
	private int codigo;
	
	@Column(name="NM_PRODUTO",nullable=false)
	private String nome;
	
	@Column(name="DS_PRODUTO")
	private String fabricante;
	
	public Produto() {
		super();
	}

	public Produto(int codigo, String nome, String fabricante) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.fabricante = fabricante;
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
