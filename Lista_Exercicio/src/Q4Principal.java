import java.util.Scanner;

import javax.swing.*;


public class Q4Principal {
	public static void main(String[] args){
		String nome;
		String dataNasc; 
		double peso;
		double altura;
		double imc;
			
		Scanner entrada = new Scanner(System.in);
			
		//System.out.print("Nome do paciente: ");
		//nome = entrada.next();
		//System.out.print("Ano de nascimento: ");
		//ano = entrada.next();			
		//System.out.print("Informe seu peso:" );
		//peso = entrada.nextDouble();
		//System.out.print("Informe sua altura: ");
		//altura = entrada.nextDouble();
		
		nome = JOptionPane.showInputDialog("Qual o nome do paciente:");
		dataNasc = JOptionPane.showInputDialog("Data de Nasceimento:");
		peso = Integer.parseInt(JOptionPane.showInputDialog("Peso"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Altura"));
		
		
		Q4Prontuario p1 = new Q4Prontuario(nome, dataNasc, peso, altura );
		p1.calculaImcII();
	}

}
