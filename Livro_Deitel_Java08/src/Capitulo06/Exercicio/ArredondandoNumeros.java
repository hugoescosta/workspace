package Capitulo06.Exercicio;

import javax.swing.JOptionPane;

public class ArredondandoNumeros {

	public static void main(String[] args) {
		
		double num = 0;
		double resultado = 0;
		
		num = Double.parseDouble(JOptionPane.showInputDialog("Digite um double:"));
		resultado = Math.floor(num + 0.5); // foi somado 0.5 para garantir o arredondamento para o primeiro inteiro para cima.
		System.out.printf("Valor recebido %s , após arredontmento para cima ficou %.5f",num , resultado);
		
	}

}
