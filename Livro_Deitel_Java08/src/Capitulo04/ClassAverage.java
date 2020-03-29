package Capitulo04;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ClassAverage {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int total = 0;
		int contador = 1;
		int media = 0;
		
		while ( contador <= 10 ) {
			System.out.printf("Digite a nota do aluno %d",contador);
			int nota = entrada.nextInt();
			total = total + nota;
			contador = contador + 1;
		}
		
		media = total / 10;
		JOptionPane.showMessageDialog(null,"Soma das notas: "+total+"\nMédia da classe: "+media,"Resultado",JOptionPane.INFORMATION_MESSAGE);
	}

}
