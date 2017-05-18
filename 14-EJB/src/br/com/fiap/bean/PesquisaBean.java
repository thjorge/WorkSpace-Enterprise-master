package br.com.fiap.bean;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import br.com.fiap.bo.PesquisaBO;

@ManagedBean
public class PesquisaBean {
	
	private int totalSim, totalNao;
	
	@EJB
	private PesquisaBO bo;
	
	
	public void votarSim(){
		bo.votar(true);
		totalNao = bo.totalNao();
		totalSim = bo.totalSim();
	}
	
	public void votarNao(){
		bo.votar(false);
		totalNao = bo.totalNao();
		totalSim = bo.totalSim();
	}

	public int getTotalSim() {
		return totalSim;
	}

	public void setTotalSim(int totalSim) {
		this.totalSim = totalSim;
	}

	public int getTotalNao() {
		return totalNao;
	}

	public void setTotalNao(int totalNao) {
		this.totalNao = totalNao;
	}

}
