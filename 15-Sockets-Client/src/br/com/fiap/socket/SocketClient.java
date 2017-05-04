package br.com.fiap.socket;

import java.io.ObjectOutputStream;
import java.net.Socket;
import br.com.fiap.bean.Pessoa;

public class SocketClient {

	public static void main(String[] args) throws Exception {
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Attos");
		pessoa.setIdade(24);
		
		Socket socket = new Socket("127.0.0.1", 1234);
		
		ObjectOutputStream objectStream = new ObjectOutputStream(socket.getOutputStream());
		
		objectStream.writeObject(pessoa);
		System.out.println("Pessoa serializada!!");
		
		
		socket.close();
		objectStream.close();
		
		
		
	}
	
}
