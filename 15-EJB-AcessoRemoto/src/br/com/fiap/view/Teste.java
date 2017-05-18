package br.com.fiap.view;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import br.com.fiap.bo.FiapBO;


public class Teste {

	public static void main(String[] args) throws Exception {
		
		Properties prop = new Properties();		
		prop.put(Context.URL_PKG_PREFIXES,"org.jboss.ejb.client.naming");
		
		Context context = new InitialContext(prop);
		
		FiapBO bo = (FiapBO) context.lookup("ejb:/14-EJB-Parte2/FiapBOImpl!br.com.fiap.bo.FiapBO");
		
		double ps = bo.calcularPS(10, 10, 8);
		System.out.println("PS: " + ps);
		
	}
}
