package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="TB_TIME")
@SequenceGenerator(name="seqTime", sequenceName="SQ_TB_TIME",allocationSize=1)
public class Time {

	@Id
	@Column(name="CD_TIME",nullable=false,length=150)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seqTime")
	private int codigo;
	
	@Column(name="NM_TIME",nullable=false,length=150)
	private String nome;
	
	@Temporal(TemporalType.DATE)
	@Column(name="DT_FUNDACAO")
	private Calendar dataFundacao;
	
	@OneToOne(mappedBy="time")
	private Tecnico tecnico; 
		

	public Tecnico getTecnico() {
		return tecnico;
	}

	public void setTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}

	public Time() {
		super();		
	}

	public Time(String nome, Calendar dataFundacao, Tecnico tecnico) {
		super();
		this.nome = nome;
		this.dataFundacao = dataFundacao;
		this.tecnico = tecnico;
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

	public Calendar getDataFundacao() {
		return dataFundacao;
	}

	public void setDataFundacao(Calendar dataFundacao) {
		this.dataFundacao = dataFundacao;
	}
	
	
	
}
