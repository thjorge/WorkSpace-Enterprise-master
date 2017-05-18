package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="TB_PROJETO_AM")
@SequenceGenerator(name="sqProjeto",sequenceName="SQ_PROJETO",allocationSize=1)
public class ProjetoAM {

	@Id
	@Column(name="CD_PROJETO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="sqProjeto")
	private int codigo;
	
	@Column(name="DS_TEMA",nullable=false,length=100)
	private String tema;
	
	@Column(name="VL_NOTA")
	private float nota;
	
	@Temporal(TemporalType.DATE)
	@Column(name="DT_INICIO",nullable=false)
	private Calendar dtInicio;
	
	@Temporal(TemporalType.DATE)
	@Column(name="DT_ENTREGA",nullable=false)
	private Calendar dtEntrega;

	@OneToOne(cascade={CascadeType.PERSIST,CascadeType.REMOVE})
	@JoinColumn(name="CD_GRUPO",nullable=false)
	private GrupoAM grupo;
	
	public ProjetoAM() {
		super();
	}

	public ProjetoAM(int codigo, String tema, float nota, Calendar dtInicio, Calendar dtEntrega, GrupoAM grupo) {
		super();
		this.codigo = codigo;
		this.tema = tema;
		this.nota = nota;
		this.dtInicio = dtInicio;
		this.dtEntrega = dtEntrega;
		this.grupo = grupo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}

	public Calendar getDtInicio() {
		return dtInicio;
	}

	public void setDtInicio(Calendar dtInicio) {
		this.dtInicio = dtInicio;
	}

	public Calendar getDtEntrega() {
		return dtEntrega;
	}

	public void setDtEntrega(Calendar dtEntrega) {
		this.dtEntrega = dtEntrega;
	}

	public GrupoAM getGrupo() {
		return grupo;
	}

	public void setGrupo(GrupoAM grupo) {
		this.grupo = grupo;
	}

}
