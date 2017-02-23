package br.com.fiap.teste;

import java.lang.reflect.Method;

import br.com.fiap.annotation.Banco;
import br.com.fiap.annotation.Tabela;
import br.com.fiap.dao.AlunoDAO;
import br.com.fiap.factory.ConnectionFactory;

public class Teste {

	public static void main(String[] args) {
		
		Method[] metodos = ConnectionFactory.class.getDeclaredMethods();
	
		for (Method method : metodos) {
			//Imprime o nome do método
			System.out.println(method.getName());
			//Recuperar a anotação Banco
			Banco anotacao = method.getAnnotation(Banco.class);
			//Imprimir o valor da url da anotação
			System.out.println(anotacao.url());
		}
		
		//Recuperar a anotação da classe
		Banco anotacao = ConnectionFactory.class.getAnnotation(Banco.class);
		
		System.out.println(anotacao.url());
		
		String sql = "SELECT * FROM ";
		
		Tabela t = AlunoDAO.class.getAnnotation(Tabela.class);
		
		System.out.println(sql + t.table_name());
		
		//ORM
	}
	
}
