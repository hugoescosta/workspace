package br.com.abc.javacore.introducaoclasses.teste;
import br.com.abc.javacore.introducaoclasses.classes.Professor;
import javax.swing.JOptionPane;

public class ProfessorTeste {
	public static void main(String[] args){
		Professor prof = new Professor();
		prof.nome = JOptionPane.showInputDialog("Qual o nome");
		prof.matricula = JOptionPane.showInputDialog("Qual a sua matrícula:");
		prof.cpf = JOptionPane.showInputDialog("Qual o seu CPF");
		prof.rg = JOptionPane.showInputDialog("Qual o seu RG");
		
		Professor prof2 = new Professor();
		prof2.nome = JOptionPane.showInputDialog("Qual o nome");
		prof2.matricula = JOptionPane.showInputDialog("Qual a sua matrícula:");
		prof2.cpf = JOptionPane.showInputDialog("Qual o seu CPF");
		prof2.rg = JOptionPane.showInputDialog("Qual o seu RG");		
		
		prof = prof2;
		
		JOptionPane.showMessageDialog(null, 
				"\n" + prof.nome
				+ "\n" + prof.matricula
				+ "\n" + prof.cpf
				+ "\n" + prof.rg);

		JOptionPane.showMessageDialog(null, 
				"\n" + prof2.nome
				+ "\n" + prof2.matricula
				+ "\n" + prof2.cpf
				+ "\n" + prof2.rg);
		

	}
}
