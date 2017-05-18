package br.com.fiap.server;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import br.com.fiap.bo.impl.CambioBOImpl;

public class RmiServer {

	public static void main(String[] args) throws Exception {

		Registry registry = LocateRegistry.createRegistry(123);
		
		registry.bind("batata", new CambioBOImpl());
		
	}

}
