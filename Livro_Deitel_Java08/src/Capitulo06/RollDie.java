package Capitulo06;

import java.security.SecureRandom;

public class RollDie {

	public static void main(String[] args) {
		SecureRandom randomNumbers = new SecureRandom();
		
		int frequencia1 = 0; // contagem de 1s lançados
		int frequencia2 = 0; // contagem de 2s lançados
		int frequencia3 = 0; // contagem de 3s lançados
		int frequencia4 = 0; // contagem de 4s lançados
		int frequencia5 = 0; // contagem de 5s lançados
		int frequencia6 = 0; // contagem de 6s lançados
		
		//somar 6.000.000 lançamentos de dado
		
		for (int roll = 1 ; roll <= 6000000 ; roll++) {
			
			int face = 1 + randomNumbers.nextInt(6);
			
			switch (face) {
				case 1:
					++frequencia1;
					break;
				case 2:
					++frequencia2;
					break;
				case 3:
					++frequencia3;
					break;
				case 4:
					++frequencia4;
					break;
				case 5:
					++frequencia5;
					break;
				case 6:
					++frequencia6;
					break;
			}
			
		}
		
		System.out.println("Face\tFrequency"); //cabeçalhos de saída
		System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n",frequencia1,frequencia2,frequencia3,frequencia4,frequencia5,frequencia6);

	}

}
