package br.com.fiap.testes;

import javax.swing.JOptionPane;

import br.com.fiap.dao.impl.AnimalDAOImpl;
import br.com.fiap.entities.Animal;
import br.com.fiap.excecoes.IdNotFoundException;
import br.com.fiap.factory.EntityManagerFactorySingleton;

public class TesteAnimalDAO {

	public static void main(String[] args) throws IdNotFoundException{
		
		AnimalDAOImpl daoImpl = new AnimalDAOImpl(EntityManagerFactorySingleton
				.getInstance()
				.createEntityManager());
		Animal animal = new Animal();
		
		animal.setNome("Attos");
		animal.setEspecie("Gringou");
		
		daoImpl.cadastrar(animal);
		System.out.println("Animal cadastrado");
		
		Animal ani1 = daoImpl.buscarPorId(1);
		JOptionPane.showMessageDialog(null,
				ani1.getCodigo() + "\n"+
				ani1.getNome() + "\n"+
				ani1.getEspecie()
		);
		
		ani1.setNome("Desida");
		ani1.setEspecie("Malucs");
		
		daoImpl.atualizar(ani1);
		System.out.println("Animal atualizado");
		JOptionPane.showMessageDialog(null,
				ani1.getCodigo() + "\n"+
				ani1.getNome() + "\n"+
				ani1.getEspecie()
		);
		
		daoImpl.remover(1);		

		System.exit(0);
	}
	
}
