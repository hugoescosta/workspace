package Q1.teste;

import javax.swing.JOptionPane;

import Q1.classes.Funcionario;
import Q1.classes.Gerente;
import Q1.classes.Vendedor;

public class FuncionarioTeste {
	public static void main(String[] args) {
		String nome,clt;
		double salario = 0;
		
		Vendedor vendedor = new Vendedor();
		vendedor.pedirDados();
		vendedor.calculaSalario();
		//Funcionario funcionario = new Funcionario("Hugo Costa","123456",2000);
		
		
		Gerente gerente = new Gerente();
		gerente.pedirDados();
		gerente.setSalario();
		//funcionario.calculaSalario();
		//System.out.println(funcionario);
		
		//System.out.println(vendedor);
		JOptionPane.showMessageDialog(null, vendedor, "VENDEDOR!!!", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, vendedor, "GERENTE!!!", JOptionPane.INFORMATION_MESSAGE);
		
		//System.out.println(gerente);
	}
}
