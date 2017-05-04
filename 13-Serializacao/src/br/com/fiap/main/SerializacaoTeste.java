package br.com.fiap.main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import br.com.fiap.bean.Pessoa;

public class SerializacaoTeste {

	public static void main(String[] args) throws Exception {
		
		Pessoa pessoa = new Pessoa("Rita", 30);
		
		FileOutputStream fileOut =  new FileOutputStream("filepessoa");
		
		ObjectOutputStream objectStream = new ObjectOutputStream(fileOut);
		
		objectStream.writeObject(pessoa);
		
		objectStream.close();
		fileOut.close();
		System.out.println("Objeto serializado!!");
		
	}
	
}
