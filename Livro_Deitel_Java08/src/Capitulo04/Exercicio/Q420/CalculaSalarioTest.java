package Capitulo04.Exercicio.Q420;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class CalculaSalarioTest {

	public static void main(String[] args) {
		int qtdFunc = 0;
		int contador = 0;
		int salHora;
		int qtdHorashrTrabalhada;
		String nome;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quantos funcionarios ira calclular salário:");
		qtdFunc = entrada.nextInt();
		
		
		//int salHora, int qtdHorashrTrabalhada
		while (contador <= qtdFunc) {
			
			nome = JOptionPane.showInputDialog("Nome do funcionarios");
			salHora = Integer.parseInt(JOptionPane.showInputDialog("Valor da hora"));
			qtdHorashrTrabalhada = Integer.parseInt(JOptionPane.showInputDialog("QTD de horas"));

			CalclulaSalario calculo = new CalclulaSalario(salHora,qtdHorashrTrabalhada);
			calculo.calculaSalBruto();
			System.out.println("Funcionario: "+nome);
			System.out.println("Salario Bruto: "+calculo.getSalBruto());
			contador +=contador;
			
		}
		

	}

}
