package br.com.fiap.entity;

import java.io.Serializable;

/**
 * 
 * Classe que armazena as caves primarias da entidade
 * @author Thiago Jorge
 *
 */
public class ItemPedidoPK implements Serializable {

	private int produto;
	
	private int pedido;

	public ItemPedidoPK(int produto, int pedido) {
		super();
		this.produto = produto;
		this.pedido = pedido;
	}

	public ItemPedidoPK() {
		super();
	}

	public int getProduto() {
		return produto;
	}

	public void setProduto(int produto) {
		this.produto = produto;
	}

	public int getPedido() {
		return pedido;
	}

	public void setPedido(int pedido) {
		this.pedido = pedido;
	}
	
	
	
	
	
}