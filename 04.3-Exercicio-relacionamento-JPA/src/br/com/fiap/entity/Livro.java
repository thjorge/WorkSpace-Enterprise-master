package br.com.fiap.entity;

import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="TB_LIVRO")
public class Livro {

	@Id
	@Column(name="CD_ISBN")
	private int isbn;
	
	@Column(name="DS_TITULO",length=200,nullable=false)
	private String titulo;
	
	@Column(name="VL_PRECO")
	private float preco;
	
	@Temporal(TemporalType.DATE)
	@Column(name="DT_LANCAMENTO")
	private Calendar dtLancamento;
	
	@Lob
	@Column(name="BT_LIVRO")
	private byte[] capa;

	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="EDITORA_id")
	private Editora editora;

	@ManyToMany(mappedBy="livros")
	private List<Autor> autores;
	
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
