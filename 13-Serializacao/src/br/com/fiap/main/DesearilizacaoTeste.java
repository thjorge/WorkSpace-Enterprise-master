package br.com.fiap.main;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import br.com.fiap.bean.Pessoa;

public class DesearilizacaoTeste {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fileInput = new FileInputStream("filepessoa"); 
		
		ObjectInputStream objectStream = new ObjectInputStream(fileInput);
		
		Pessoa pessoa = (Pessoa) objectStream.readObject();
		
		objectStream.close();
		fileInput.close();
		
		System.out.println(pessoa.getNome());
		System.out.println(pessoa.getIdade());
		
		
	}
	
	
}
