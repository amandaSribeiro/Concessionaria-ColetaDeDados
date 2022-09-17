package br.edu.fatec.concessionaria.main;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Carro func = new Carro();
		func.setMarca(JOptionPane.showInputDialog("Informe a marca do carro: "));
		func.setModelo(JOptionPane.showInputDialog("Informe o modelo do carro: "));
		func.setAno(Integer.valueOf(JOptionPane.showInputDialog("Informe o ano do carro: ")));
		func.imprimirDados();
		
		
	}

}
