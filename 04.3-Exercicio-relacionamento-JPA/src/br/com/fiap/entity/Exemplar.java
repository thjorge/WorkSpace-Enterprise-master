package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="TB_EXEMPLAR")
@SequenceGenerator(name="sqExemplar",sequenceName="SQ_EXEMPLAR",allocationSize=1)
public class Exemplar {

	@Id
	@Column(name="CD_EXEMPLAR")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="sqExemplar")
	private int id;
	
	@Temporal(TemporalType.DATE)
	@Column(name="DT_AQUISICAO")
	private Calendar dtAquisicao;
	
	@Column(name="DS_SITUACAO",nullable=false)
	private Situacao situacao;

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Calendar getDtAquisicao() {
		return dtAquisicao;
	}

	public void setDtAquisicao(Calendar dtAquisicao) {
		this.dtAquisicao = dtAquisicao;
	}

	public Situacao getSituacao() {
		return situacao;
	}

	public void setSituacao(Situacao situacao) {
		this.situacao = situacao;
	}

}
