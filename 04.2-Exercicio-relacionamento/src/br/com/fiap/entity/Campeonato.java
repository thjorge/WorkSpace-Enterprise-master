package br.com.fiap.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_CAMPEONATO")
@SequenceGenerator(name="sqCamp",sequenceName="SQ_CAMPEONATO",allocationSize=1)
public class Campeonato {

	@Id
	@Column(name="CD_CAMPEONATO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="sqCamp")
	private int codigo;
	
	@Column(name="NM_CAMPEONATO")
	private String nome;
	
	@ManyToMany(mappedBy="campeonatos")
	private List<Time> times;

	public Campeonato() {
		super();
	}

	public Campeonato(int codigo, String nome, List<Time> times) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.times = times;
	}

	//Construtor só calsse
	public Campeonato(String nome) {
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

	public List<Time> getTimes() {
		return times;
	}

	public void setTimes(List<Time> times) {
		this.times = times;
	}
	
}
