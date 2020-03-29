package Capitulo05.Exercicio;

import java.util.Scanner;

public class GraficoDeBarras {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int contador = 0;
		int[] eixoX = {0,0,0,0,0};
		
		while ( contador < 5) {
			System.out.printf("Digite %do. numero: ",contador);
			eixoX[contador] = Integer.parseInt(entrada.nextLine());
			contador = contador + 1;
		}
		for (int i = 0; i < eixoX.length ; i++) {
			for (int j = 0 ; j < eixoX[i]; j++) {
				System.out.printf("*");
			}
			System.out.printf(" %d",eixoX[i]);
			System.out.println("");
		}
		System.out.println("");
		

	}

}
