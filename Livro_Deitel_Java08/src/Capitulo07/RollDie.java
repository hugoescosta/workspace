package Capitulo07;

import java.security.SecureRandom;

public class RollDie {

	public static void main(String[] args) {
		SecureRandom numeroAleatorio = new SecureRandom(); // Instância o objeto numeroAleatorio
		int[] frequencia = new int[7]; // cria o array frequencia de 7 posições, o indice ZERO, será desprezado no FOR**
		
		for ( int roll = 1 ; roll <= 6000000 ; roll++ ) { // conta de 1 até 6000000
			//Em outras palavras, joga o dado. 
			//Gera um numero aleatório de 0 a 5, pois o início é sempre no ZERO
			int numeroDado = 1 + numeroAleatorio.nextInt(6); // por isso soma + 1, assim ficamos com números de 1 a 6
			frequencia[numeroDado] = frequencia[numeroDado]+1; // soma +1 na posição do número gerado na linha acima
			//++frequencia[1 + numeroAleatorio.nextInt(6)]; // faz tudo que é feito nas duas linhas acima, deixo aqui como exemplo
		}
		
		System.out.printf("%s%11s%n", "Lado", "Frequência"); // imprime o cabeçalho
		// gera saída do valor de cada elemento do array
		for (int lado = 1; lado < frequencia.length; lado++) {  //**
			System.out.printf("%4d%11d%n", lado, frequencia[lado]);
		}
	}
}
