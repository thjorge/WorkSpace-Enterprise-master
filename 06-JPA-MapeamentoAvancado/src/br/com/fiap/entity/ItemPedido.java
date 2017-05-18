package br.com.fiap.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@IdClass(ItemPedidoPK.class)
@Table(name="TB_ITEM_PEDIDO")
public class ItemPedido {
	
	@Id
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="CD_PEDIDO")
	private Pedido pedido;
	
	@Id
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="CD_PRODUTO")
	private Produto produto;

	@Column(name="QT_ITEM", nullable=false)
	private int quantidade;
	
	@Column(name="VL_ITEM", nullable=false)
	private float valor;

	public ItemPedido(Pedido pedido, Produto produto, int quantidade, float valor) {
		super();
		this.pedido = pedido;
		this.produto = produto;
		this.quantidade = quantidade;
		this.valor = valor;
	}

	public ItemPedido(int quantidade, float valor) {
		super();
		this.quantidade = quantidade;
		this.valor = valor;
	}

	public ItemPedido() {
		super();
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	
}
