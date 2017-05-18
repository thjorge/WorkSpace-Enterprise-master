package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="TB_ALUNO")
@SequenceGenerator(name="sqAluno",sequenceName="SQ_ALUNO",allocationSize=1)
public class Aluno {

	@Id
	@Column(name="CD_RM")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="sqAluno")
	private int rm;
	
	@Column(name="NM_ALUNO", nullable=false, length=150)
	private String nome;
	
	@Temporal(TemporalType.DATE)
	@Column(name="DT_NASCIMENTO")
	private Calendar dtNascimento;
	
	@ManyToOne(cascade=CascadeType.PERSIST)
	private GrupoAM grupo;

	public Aluno() {
		super();
	}

	public Aluno(int rm, String nome, Calendar dtNascimento, GrupoAM grupo) {
		super();
		this.rm = rm;
		this.nome = nome;
		this.dtNascimento = dtNascimento;
		this.grupo = grupo;
	}

	public int getRm() {
		return rm;
	}

	public void setRm(int rm) {
		this.rm = rm;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Calendar dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public GrupoAM getGrupo() {
		return grupo;
	}

	public void setGrupo(GrupoAM grupo) {
		this.grupo = grupo;
	}
	
}
