package br.com.fiap.entity;

import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
	
	@Column(name="NM_AUTOR",length=300, nullable=false)
	private String nome;
	
	@Column(name="DS_SEXO")
	private Sexo sexo;
	
	@Column(name="NM_SOBRENOME",length=300, nullable=false)
	private String sobrenome;
		
	@Temporal(TemporalType.DATE)
	@Column(name="DT_NASCIMENTO")
	private Calendar dtNascimento;

	@ManyToMany(cascade=CascadeType.PERSIST)
	@JoinTable(name="AUTOR_LIVRO",
	joinColumns=@JoinColumn(name="AUTOR_id"),
	inverseJoinColumns=@JoinColumn(name="LIVRO_isbn"))
	private List<Livro> livros;

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

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}
	
}
