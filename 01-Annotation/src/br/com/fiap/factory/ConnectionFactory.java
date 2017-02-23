package br.com.fiap.factory;

import java.sql.Connection;

import br.com.fiap.annotation.Banco;

@Banco(url="oracle.fiap.com.br")
public class ConnectionFactory {

	@Banco(url="mysql.fiap.com.br")
	public Connection getConnection(){
		return null;
	}
	
}
