package br.com.fiap.helper;

import javax.swing.JOptionPane;

public class JPaneHelper {

	public JPaneHelper(){
		
	}
	
	public String InputString(String msg){
		return JOptionPane.showInputDialog(msg);
	}
	
	public int InputInt(String msg){
		return Integer.parseInt(JOptionPane.showInputDialog(msg));
	}
	
	public double InputDouble (String msg){
		return Double.parseDouble(JOptionPane.showInputDialog(msg));
	}
	
}
