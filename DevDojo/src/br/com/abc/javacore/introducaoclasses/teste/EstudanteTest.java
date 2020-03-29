package br.com.abc.javacore.introducaoclasses.teste;
import javax.swing.JOptionPane;

import br.com.abc.javacore.introducaoclasses.classes.Estudante;

public class EstudanteTest {

	public static void main(String[] args) {
		Estudante joao = new Estudante();
		joao.nome = "Joao";
		joao.matricula = "1212";
		joao.idade = 15;
		
		JOptionPane.showMessageDialog(null, 
				       joao.nome
				+ "\n"+joao.matricula
				+ "\n"+joao.idade);
		
		

	}

}
