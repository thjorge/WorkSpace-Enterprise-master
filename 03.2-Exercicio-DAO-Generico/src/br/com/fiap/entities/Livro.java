package br.com.fiap.entities;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="TB_LIVRO")
public class Livro {

	@Id
	@Column(name="CD_ISBN")
	private int isbn;
	
	@Column(name="DS_TITULO",length=200)
	private String titulo;
	
	@Column(name="VL_PRECO",nullable=true)
	private float preco;
	
	@Temporal(TemporalType.DATE)
	@Column(name="DT_LANCAMENTO",nullable=true)
	private Calendar dtLancamento;
	
	@Lob
	@Column(name="BT_LIVRO")
	private byte[] capa;

	public Livro(){
		
	}
	
	public Livro(int isbn, String titulo, float preco, Calendar dtLancamento, byte[] capa) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.preco = preco;
		this.dtLancamento = dtLancamento;
		this.capa = capa;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public Calendar getDtLancamento() {
		return dtLancamento;
	}

	public void setDtLancamento(Calendar dtLancamento) {
		this.dtLancamento = dtLancamento;
	}

	public byte[] getCapa() {
		return capa;
	}

	public void setCapa(byte[] capa) {
		this.capa = capa;
	}
	
}
