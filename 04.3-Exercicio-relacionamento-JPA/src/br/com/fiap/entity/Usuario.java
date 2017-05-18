package br.com.fiap.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_USUARIO")
@SequenceGenerator(name="sqUsuario",sequenceName="SQ_USUARIO",allocationSize=1)
public class Usuario {

	@Id
	@Column(name="CD_USUARIO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="sqUsuario")
	private int id;
	
	@Column(name="NM_USUARIO", nullable=false)
	private String nome;
	
	@Column(name="DS_PRIMEIRO_NOME",length=300, nullable=false)
	private String primeiroNome;
	
	@Column(name="NM_SOBRENOME",length=300)
	private String sobrenome;
		
	@Column(name="DS_CPF",length=20,nullable=false)
	private String cpf;

	@OneToMany(mappedBy="usuario",cascade=CascadeType.PERSIST)
	private List<Emprestimo> emprestimos;

	public void addEmprestimo(Emprestimo emprestimo){
		emprestimo.setUsuario(this);
		this.emprestimos.add(emprestimo);
	}
	
	public List<Emprestimo> getEmprestimos() {
		return emprestimos;
	}

	public void setEmprestimos(List<Emprestimo> emprestimos) {
		this.emprestimos = emprestimos;
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

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
