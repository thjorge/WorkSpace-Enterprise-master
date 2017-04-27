package br.com.fiap.view;

import java.util.Calendar;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ItemPedidoDAO;
import br.com.fiap.dao.impl.ItemPedidoDAOImpl;
import br.com.fiap.entity.ItemPedido;
import br.com.fiap.entity.Pedido;
import br.com.fiap.entity.Produto;
import br.com.fiap.exception.DBException;
import br.com.fiap.factory.EntityManagerFactorySingleton;

public class ConsoleView {

	public static void main(String[] args) {


		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();	
		ItemPedidoDAO dao = new ItemPedidoDAOImpl(em);


		Produto produto = new Produto("Pastel","Japa");
		Pedido pedido = new Pedido(Calendar.getInstance(), Calendar.getInstance(), "Thaigo");

		ItemPedido item = new ItemPedido(pedido, produto, 10, 6);


		try {
			dao.cadastrar(item);
			dao.salvar();
		} catch (DBException e) {
			e.printStackTrace();
		}

		em.close();
		System.exit(0);




	}
}
