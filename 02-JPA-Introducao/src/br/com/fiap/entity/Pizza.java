package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.PostPersist;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.swing.JOptionPane;

@Entity
@Table(name="TB_PIZZA")
@SequenceGenerator(name="sqPizza", sequenceName="SQ_PIZZA",allocationSize=1)
public class Pizza {

	@Id
	@Column(name="CD_PIZZA")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="sqPizza")
	private int codigo;

	@Column(name="VL_PIZZA")
	private double preco;

	@Column(nullable=false,name="DS_SABOR")
	private String sabor;

	@Column(name="DS_BORDA")
	private BordaRecheada recheio;

	@Column(name="DS_TAMANHO")
	private TamanhoPizza tamanho;

	@Column(name="DT_ENTREGA")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar data;

	@Transient //Não será uma coluna na tabela
	private String comentario;

	@Lob
	private byte[] foto;

	public Pizza(){

	}

	public Pizza(int codigo, double preco, String sabor, BordaRecheada recheio, TamanhoPizza tamanho, Calendar data,
			String comentario, byte[] foto) {
		super();
		this.codigo = codigo;
		this.preco = preco;
		this.sabor = sabor;
		this.recheio = recheio;
		this.tamanho = tamanho;
		this.data = data;
		this.comentario = comentario;
		this.foto = foto;
	}

	@PostPersist
	public void log(){
		JOptionPane.showMessageDialog(null, "Cadastrando uma pizza");
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public BordaRecheada getRecheio() {
		return recheio;
	}

	public void setRecheio(BordaRecheada recheio) {
		this.recheio = recheio;
	}

	public TamanhoPizza getTamanho() {
		return tamanho;
	}

	public void setTamanho(TamanhoPizza tamanho) {
		this.tamanho = tamanho;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

}
