package br.com.fiap.bo;

import javax.ejb.Local;

@Local
public interface PesquisaBO {

	void votar(boolean sim);
	
	int totalSim();
	
	int totalNao();
	
}



