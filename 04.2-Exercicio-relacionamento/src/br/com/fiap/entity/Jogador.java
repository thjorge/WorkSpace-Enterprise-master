package br.com.fiap.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_JOGADOR")
@SequenceGenerator(name="sqJogador",sequenceName="SQ_JOGADOR",allocationSize=1)
public class Jogador {

	@Id
	@Column(name="CD_JOGADOR")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="sqJogador")
	private int codigo;
	
	@Column(name="NM_JOGADOR")
	private String nome;
	
	@ManyToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name="CD_TIME")
	private Time time;

	public Jogador() {
		super();
	}

	public Jogador(int codigo, String nome, Time time) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.time = time;
	}

	//Construtor s� classe
	public Jogador(String nome) {
		super();
		this.nome = nome;
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

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}
	
}
