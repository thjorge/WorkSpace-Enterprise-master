package br.com.fiap.entity;

import java.io.Serializable;

/**
 * Classe que armazena as chaves primárias da entidade 
 * Os atributos devem possuir o mesmo nome dos atributos da entidade
 * @author Kenzo Yuri
 *
 */
public class ItemPedidoPK implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int produto;
	
	private int pedido;
	
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
