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
@Table(name="TB_EMPRESTIMO")
@SequenceGenerator(name="sqEmprestimo",sequenceName="SQ_EMPRESTIMO",allocationSize=1)
public class Emprestimo {

	@Id
	@Column(name="CD_EMPRESTIMO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="sqEmprestimo")
	private int id;
	
	@Temporal(TemporalType.DATE)
	@Column(name="DT_EMPRESTIMO")
	private Calendar dtEmprestimo;
	
	@Temporal(TemporalType.DATE)
	@Column(name="DT_RETORNO")
	private Calendar dtRetorno;

	public Emprestimo(){
		
	}

	public Emprestimo(int id, Calendar dtEmprestimo, Calendar dtRetorno) {
		super();
		this.id = id;
		this.dtEmprestimo = dtEmprestimo;
		this.dtRetorno = dtRetorno;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Calendar getDtEmprestimo() {
		return dtEmprestimo;
	}

	public void setDtEmprestimo(Calendar dtEmprestimo) {
		this.dtEmprestimo = dtEmprestimo;
	}

	public Calendar getDtRetorno() {
		return dtRetorno;
	}

	public void setDtRetorno(Calendar dtRetorno) {
		this.dtRetorno = dtRetorno;
	}
	
}
