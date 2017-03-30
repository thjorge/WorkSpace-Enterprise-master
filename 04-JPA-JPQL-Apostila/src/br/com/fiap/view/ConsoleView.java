package br.com.fiap.view;

import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;

import br.com.fiap.dao.EntityManagerFactorySingleton;
import br.com.fiap.dao.impl.ClienteDAOImpl;
import br.com.fiap.dao.impl.PacoteDAOImpl;
import br.com.fiap.entity.Cliente;
import br.com.fiap.entity.Pacote;

public class ConsoleView {

	private static List<Pacote> lista;

	public static void main(String[] args) {

		//Executar a listagem de pacotes
		EntityManager em = EntityManagerFactorySingleton
				.getInstance().createEntityManager();
		
		PacoteDAOImpl dao = new PacoteDAOImpl(em);		
		List<Pacote> lista = dao.listar();
	
		
		for (Pacote pacote : lista) {
			JOptionPane.showMessageDialog(null, "Codigo: "+pacote.getId() 
												+ "\nDescrição: "
												+ pacote.getDescricao() 
												+ "\nPreço: R$"
												+ pacote.getPreco() 
												+ "\nQuantidade de dias: " 
												+ pacote.getQtdDias());			
		}
		
		JOptionPane.showMessageDialog(null, "BUSCA POR QUANTIDADE DE DIAS MINIMO");
		lista = dao.buscarPorQuantidadeDiasMinimo(8);
		for (Pacote pacote : lista) {
			JOptionPane.showMessageDialog(null, "Codigo: "+pacote.getId() 
												+ "\nDescrição: "
												+ pacote.getDescricao() 
												+ "\nPreço: R$"
												+ pacote.getPreco() 
												+ "\nQuantidade de dias: " 
												+ pacote.getQtdDias());
		}
		
	
		ClienteDAOImpl daoCli = new ClienteDAOImpl(em);
		List<Cliente> listaCli = daoCli.buscarTodosClientes();
		
		
		
		
		
		JOptionPane.showMessageDialog(null, "TODOS CLIENTES");
		
		listaCli = daoCli.buscarTodosClientes();
		for (Cliente cliente : listaCli) {
			JOptionPane.showMessageDialog(null, "Nome: " + cliente.getNome()
												+ "\nCPF: " 
												+ cliente.getCpf());												
		}
		
		
		
		
		em.close();
		System.exit(0);
	}

}
