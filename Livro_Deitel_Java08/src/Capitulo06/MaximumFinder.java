package Capitulo06;

import java.util.Scanner;

public class MaximumFinder {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//solicita a entrada de 3 números com ponto flutuante
		System.out.print("Entre com 3 valores de ponto flutuante sepadados por espaço: ");
		double number1 = entrada.nextDouble();
		double number2 = entrada.nextDouble();
		double number3 = entrada.nextDouble();
		
		//determina o valor máximo
		double result = maximum(number1, number2, number3);
		
		//exibe o valor máximo
		System.out.println("O maior valor é: "+ result);
				
	}
	
	//retorno o maior valor de três números passados como parâmetro
	public static double maximum( double x, double y, double z) {
		
		double maximumValue = x; // supõe que x é o maior valor inicial
		
		//determina se y é o maior valor
		if (y > maximumValue) {
			maximumValue = y;
		}
		
		if (z > maximumValue) {
			maximumValue = z;
		}
		
		return maximumValue;
	}

}
