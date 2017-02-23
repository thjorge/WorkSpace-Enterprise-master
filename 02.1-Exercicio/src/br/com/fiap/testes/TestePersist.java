package br.com.fiap.testes;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

import br.com.fiap.entities.Autor;
import br.com.fiap.entities.Editora;
import br.com.fiap.entities.Livro;
import br.com.fiap.entities.Sexo;

public class TestePersist {

	public static String texto(String msg){
		return JOptionPane.showInputDialog(msg);
	}
	
	public static int inteiro(String msg){
		return Integer.parseInt(JOptionPane.showInputDialog(msg));
	}
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("KENZO_RM76801");
		EntityManager em = emf.createEntityManager();
		
		Autor autor = new Autor(
				0,
				texto("Nome"),
				Sexo.MASCULINO,
				texto("Sobrenome"),
				new GregorianCalendar(1998,Calendar.JUNE,9)
				);
		
		em.persist(autor);
		
		Editora editora = new Editora(
				0,
				texto("CNPJ Editora"),
				texto("Nome Editora"),
				texto("Endereço Editora")
				);
		
		em.persist(editora);
		
		Livro livro = new Livro();

		livro.setIsbn(inteiro("ISBN Livro"));
		livro.setTitulo(texto("Título Livro"));
		livro.setPreco(12);
		livro.setDtLancamento(new GregorianCalendar(2012,Calendar.AUGUST,16));
		
		em.persist(livro);
		
		em.getTransaction().begin();
		em.getTransaction().commit();
		
	}
	
}
