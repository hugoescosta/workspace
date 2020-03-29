package Capitulo03.Exercicio;

import javax.swing.JOptionPane;

public class EmployeeTest {

	public static void main(String[] args) {
		String nome;
		String sobreNome;
		//double salarioMensal;
		
		Employee funcionario1 = new Employee();
		Employee funcionario2 = new Employee();
		
		funcionario1.setNome();
		funcionario1.setSobreNome();
		funcionario1.setSalarioMensal();
		
		funcionario2.setNome();
		funcionario2.setSobreNome();
				
		funcionario2.setSalarioMensal();
		
		funcionario1.imprimirSalarioAnual();
		funcionario2.imprimirSalarioAnual();

		funcionario1.aumentoSalario(Integer.parseInt(JOptionPane.showInputDialog(null, "Dê um aumento para o funcionario "+funcionario1.getNome(), 0)));
		funcionario2.aumentoSalario(Integer.parseInt(JOptionPane.showInputDialog(null, "Dê um aumento para o funcionario "+funcionario2.getNome(), 0)));

		funcionario1.imprimirSalarioAnual();
		funcionario2.imprimirSalarioAnual();
		


	}

}
