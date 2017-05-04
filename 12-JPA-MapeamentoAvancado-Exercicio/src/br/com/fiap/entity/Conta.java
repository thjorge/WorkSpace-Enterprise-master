package br.com.fiap.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@IdClass(ContaPK.class)
@Inheritance(strategy=InheritanceType.JOINED)
@Table(name="TB_CONTA")
public class Conta {

	@Id
	@SequenceGenerator(name="seqConta",sequenceName="SQ_TB_CONTA",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seqConta")
	@Column(name="NR_CONTA")
	private int numero;
	
	@Id
	@JoinColumn(name="NR_AGENCIA")
	@ManyToOne(cascade=CascadeType.PERSIST)
	private Agencia agencia;
	
	@Column(name="VL_SALDO",nullable=false)
	private double saldo;

	public Conta(Agencia agencia, double saldo) {
		super();
		this.agencia = agencia;
		this.saldo = saldo;
	}

	public Conta() {
		super();
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
	
	
}
