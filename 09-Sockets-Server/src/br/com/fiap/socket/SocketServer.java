package br.com.fiap.socket;

import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

import br.com.fiap.bean.Pessoa;

public class SocketServer {
	// Ler o objeto enviado pela rede (socket)
	public static void main(String[] args) throws Exception {

		ServerSocket server = new ServerSocket(1290);

		while (true) {
			System.out.println("Aguardando...");
			// Aguardando a conexão
			Socket socket = server.accept();

			ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());

			try {
				Pessoa pessoa = (Pessoa) inputStream.readObject();

				System.out.println("Nome: ".concat(pessoa.getNome()) + "\nIdade: " + pessoa.getIdade());
			} catch (Exception e) {
				e.printStackTrace();
				System.err.println("Erro");
			}

		}
		// inputStream.close();
		// server.close();
	}

}
