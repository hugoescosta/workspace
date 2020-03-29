package Capitulo04;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ClassAverage410 {
	public static void main(String[] args){
		
		Scanner entrada = new Scanner(System.in);
		
		int total = 0;
		int contador = 0;
		
		System.out.println("Insira a primeira nota (< 0 e >10 - SAIR): ");
		int nota = entrada.nextInt();
		
		while ( nota >= 0 && nota <= 10) {
			
			total = total + nota;
			contador = contador + 1;
			
			System.out.printf("Insira a próxima nota #%d (< 0 e >10 - SAIR): ",contador+1);
			nota = entrada.nextInt();
			
		}
		
		if ( contador != 0) {
			double media = total / contador;
			System.out.printf("QTD de notas inseridas: %d%n",contador);
			System.out.printf("Soma de todas as notas: %d%n",total);
			System.out.printf("Média da classe: %.2f",media);
		} else {
			System.out.println("Nenhuma nota foi digitada!!!");
		}
		
	}
}
