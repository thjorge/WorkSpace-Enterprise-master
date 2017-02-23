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
@Table(name="TB_ENTREGADOR")
@SequenceGenerator(name="sqEntregador", sequenceName="SQ_ENTREGADOR", allocationSize=1)
public class Entregador {

	@Id
	@Column(name="CD_ENTREGADOR")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="sqEntregador")
	private int codigo;
	
	@Column(name="NM_NOME", nullable=false,length=150)
	private String nome;
	
	@Column(name="DS_PLACA")
	private String placa;
	
	@Column(name="NR_HABILITACAO")
	private int habilitacao;
	
	@Column(name="NR_CPF", nullable=false)
	private int cpf;
	
	@Column(name="DT_CONTRATACAO")
	@Temporal(TemporalType.DATE)
	private Calendar contratacao;
	
	@Column(name="DS_PERIODO")
	private Periodo periodo;

	public Entregador(){
		
	}
	
	public Entregador(int codigo, String nome, String placa, int habilitacao, int cpf, Calendar contratacao,
			Periodo periodo) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.placa = placa;
		this.habilitacao = habilitacao;
		this.cpf = cpf;
		this.contratacao = contratacao;
		this.periodo = periodo;
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

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getHabilitacao() {
		return habilitacao;
	}

	public void setHabilitacao(int habilitacao) {
		this.habilitacao = habilitacao;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public Calendar getContratacao() {
		return contratacao;
	}

	public void setContratacao(Calendar contratacao) {
		this.contratacao = contratacao;
	}

	public Periodo getPeriodo() {
		return periodo;
	}

	public void setPeriodo(Periodo periodo) {
		this.periodo = periodo;
	}	
	
}
