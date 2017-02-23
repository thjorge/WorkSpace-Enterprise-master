package br.com.fiap.entities;

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
@Table(name="TB_AUTOR")
@SequenceGenerator(name="sqAutor",sequenceName="SQ_AUTOR",allocationSize=1)
public class Autor {

	@Id
	@Column(name="CD_AUTOR")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="sqAutor")
	private int id;
	
	@Column(name="NM_AUTOR",length=300)
	private String nome;
	
	@Column(name="DS_SEXO")
	private Sexo sexo;
	
	@Column(name="NM_SOBRENOME",length=300)
	private String sobrenome;
		
	@Temporal(TemporalType.DATE)
	@Column(name="DT_NASCIMENTO",nullable=true)
	private Calendar dtNascimento;

	public Autor(){
		
	}
	
	public Autor(int id, String nome, Sexo sexo, String sobrenome, Calendar dtNascimento) {
		super();
		this.id = id;
		this.nome = nome;
		this.sexo = sexo;
		this.sobrenome = sobrenome;
		this.dtNascimento = dtNascimento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Calendar getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Calendar dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	
}
