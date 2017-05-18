package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_FUNCIONARIO")
@SecondaryTable(name="TB_DADO_FUNCIONARIO")
@SequenceGenerator(name="sqFuncionario",sequenceName="SQ_FUNCIONARIO", allocationSize=1)
public class Funcionario {

	@Id
	@Column(name="CD_FUNCIONARIO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="sqFuncionario")
	private int codigo;
	
	@Column(name="NM_FUNCIONARIO",nullable=false)
	private String nome;
	
	@Column(name="VL_SALARIO",table="TB_DADO_FUNCIONARIO")
	private double salario;
	
	@Column(name="NR_CONTA", table="TB_DADO_FUNCIONARIO")
	private String numeroConta;

	public Funcionario() {
		super();
	}
	
	public Funcionario(int codigo, String nome, double salario, String numeroConta) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.salario = salario;
		this.numeroConta = numeroConta;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
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
}
