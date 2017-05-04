package br.com.fiap.socket;

import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

import br.com.fiap.bean.Pessoa;

public class SocketServer {

	//Ler o objeto enviado pela rede (socket)
	public static void main(String[] args) throws Exception {

			ServerSocket server = new ServerSocket(1234);

			System.out.println("Aguardando....");

			//Aguardando a conexão
			Socket socket = server.accept();

			ObjectInputStream objectInput = new ObjectInputStream(socket.getInputStream());
			try{
				Pessoa pessoa = (Pessoa) objectInput.readObject();

				System.out.println(pessoa.getNome());
				System.out.println(pessoa.getIdade());

			}catch (Exception e) {
				System.out.println("Erro!");
			}

			objectInput.close();

		
	}

}
