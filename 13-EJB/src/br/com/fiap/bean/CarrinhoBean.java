package br.com.fiap.bean;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.fiap.bo.CarrinhoBO;

@ManagedBean
@SessionScoped
public class CarrinhoBean {

	private double total, dolar;

	@EJB
	private CarrinhoBO bo;
	
	public void adicionar(){
		total = bo.adicionarDolar(dolar);
	}
	
	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double getDolar() {
		return dolar;
	}

	public void setDolar(double dolar) {
		this.dolar = dolar;
	}
	
}
