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
@Table(name="TB_PEDIDO")
@SequenceGenerator(name="sqPedido",sequenceName="SQ_PEDIDO",allocationSize=1)
public class Pedido {

	@Id
	@Column(name="CD_PEDIDO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="sqPedido")
	private int codigo;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_PEDIDO", nullable=false)
	private Calendar dataPedido;
	
	@Temporal(TemporalType.DATE)
	@Column(name="DT_ENTREGA")
	private Calendar dataEntrega;
	
	@Column(name="NM_CLIENTE")
	private String nomeCliente;
	
	public Pedido() {
		super();
	}

	public Pedido(int codigo, Calendar dataPedido, Calendar dataEntrega, String nomeCliente) {
		super();
		this.codigo = codigo;
		this.dataPedido = dataPedido;
		this.dataEntrega = dataEntrega;
		this.nomeCliente = nomeCliente;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Calendar getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(Calendar dataPedido) {
		this.dataPedido = dataPedido;
	}

	public Calendar getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(Calendar dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
}
