package br.com.fiap.bo.impl;

import javax.ejb.Singleton;
import br.com.fiap.bo.PesquisaBO;

@Singleton
public class PesquisaBOImpl implements PesquisaBO {

	private int sim;
	private int nao;

	@Override
	public void votar(boolean sim) {		
		if(sim)
			this.sim++;
		else 
			this.nao++;

	}

	@Override
	public int totalSim() {		
		return sim;
	}

	@Override
	public int totalNao() {		
		return nao;
	}



}
