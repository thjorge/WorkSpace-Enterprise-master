package br.com.fiap.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_GRUPO_AM")
@SequenceGenerator(name="sqGrupo",sequenceName="SQ_GRUPO_AM",allocationSize=1)
public class GrupoAM {

	@Id
	@Column(name="CD_GRUPO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="sqGrupo")
	private int codigo;
	
	@Column(name="NM_GRUPO",nullable=false,length=50)
	private String nome;

	@OneToOne(mappedBy="grupo",fetch=FetchType.LAZY)
	private ProjetoAM projeto;
	
	@OneToMany(mappedBy="grupo",cascade=CascadeType.PERSIST)
	private List<Aluno> alunos;
	
	public GrupoAM() {
		super();
	}

	public GrupoAM(int codigo, String nome) {
		super();
		this.codigo = codigo;
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

	public ProjetoAM getProjeto() {
		return projeto;
	}

	public void setProjeto(ProjetoAM projeto) {
		this.projeto = projeto;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

}
