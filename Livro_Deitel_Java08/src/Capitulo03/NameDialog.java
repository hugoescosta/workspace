package Capitulo03;

import javax.swing.JOptionPane;

public class NameDialog {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Qual o seu nome?");
		
		String mensagem = String.format("Seja bem vindo %s ao estudo JAVA!!!");
		
		JOptionPane.showMessageDialog(null, mensagem);
		
		

	}

}
