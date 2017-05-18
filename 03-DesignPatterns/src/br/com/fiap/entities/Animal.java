package br.com.fiap.entities;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="TB_ANIMAL")
@SequenceGenerator(name="sqAnimal", sequenceName="SQ_ANIMAL", allocationSize=1)
public class Animal {
	
	@Id
	@Column(name="CD_ANIMAL")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="sqAnimal")
	private int codigo;

	@Column(name="NM_ANIMAL", length=150,nullable=false)
	private String nome;
	
	@Column(name="DS_ESPECIE", length=150,nullable=false)
	private String especie;
	
	@Column(name="DS_PORTE")
	private Porte porte;
	
	@Temporal(TemporalType.DATE)
	@Column(name="DT_NASCIMENTO")
	private Calendar dtNascimento;
	
	@Lob
	@Column(name="BT_FOTO")
	private byte[] foto;

	public Animal(){
		
	}
	
	public Animal(int codigo, String nome, String especie, Porte porte, Calendar dtNascimento, byte[] foto) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.especie = especie;
		this.porte = porte;
		this.dtNascimento = dtNascimento;
		this.foto = foto;
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

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public Porte getPorte() {
		return porte;
	}

	public void setPorte(Porte porte) {
		this.porte = porte;
	}

	public Calendar getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Calendar dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}
	
}
