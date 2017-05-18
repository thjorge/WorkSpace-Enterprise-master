package br.com.fiap.helper;

import javax.swing.JOptionPane;

public class JPaneHelper {

	public JPaneHelper(){
		
	}
	
	public String inputString(String msg){
		return JOptionPane.showInputDialog(msg);
	}
	
	public int inputInt(String msg){
		return Integer.parseInt(inputString(msg));
	}
	
	public double inputDouble (String msg){
		return Double.parseDouble(inputString(msg));
	}
	
	public float inputFloat(String msg){
		return Float.parseFloat(inputString(msg));
	}
	
}
