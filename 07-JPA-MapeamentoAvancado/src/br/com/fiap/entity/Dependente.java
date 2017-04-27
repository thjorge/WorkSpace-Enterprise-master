package br.com.fiap.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@IdClass(DependentePK.class)
@Table(name="TB_DEPENDENTE")

public class Dependente {

	@Id
	@SequenceGenerator(name="seqDep",sequenceName="SQ_TB_DEPENDENTE",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seqDep")
	@Column(name="CD_DEPENDENTE")
	private int codigo;
	
	@Id
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="CD_FUNCIONARIO")
	private Funcionario funcionario;
	
	@Column(name="NM_DEPENDENTE",nullable=false)
	private String dependente;

	public Dependente(Funcionario funcionario, String dependente) {
		super();		
		this.funcionario = funcionario;
		this.dependente = dependente;
	}
		

	public Dependente() {
		super();
	}


	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public String getDependente() {
		return dependente;
	}

	public void setDependente(String dependente) {
		this.dependente = dependente;
	}
	
	
	
	
	
	
	
}
