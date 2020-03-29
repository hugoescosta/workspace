package br.com.abc.javacore.classesabstratas.teste;

import br.com.abc.javacore.classesabstratas.classes.Funcionario;
import br.com.abc.javacore.classesabstratas.classes.Gerente;
import br.com.abc.javacore.classesabstratas.classes.Vendedor;

public class FuncionarioTeste {
	public static void main(String[] args) {
		//Funcionario funcionario = new Funcionario("Hugo Costa","123456",2000);  Não posso instanciar um objeto funcionario,
		//pois a classe é abstrata
		Vendedor vendedor = new Vendedor("Hugo Costa","123456",1500,5000);
		Gerente gerente = new Gerente("Zete Costa","789456",2000);
		//funcionario.calculaSalario();
		//System.out.println(funcionario);
		vendedor.calculaSalario();
		gerente.setSalario();
		System.out.println(vendedor);
		vendedor.imprime();
		System.out.println("--------------------------");
		System.out.println(gerente);
		gerente.imprime();
	}
}
