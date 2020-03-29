package Capitulo06.Exercicio;

import java.security.SecureRandom;

public class InteirosAleatorios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Gerando números seguros de inteiros aleatórios
		 * 
		 */
		
		SecureRandom numeroAleatorio = new SecureRandom();
		int num2;
		
		
		//Questão 6.12
		int num1 = 1 + numeroAleatorio.nextInt(2);
		System.out.println("Gera um número aleatório entre 1 e 2 :"+num1);
		
		num1 = 1 + numeroAleatorio.nextInt(100);
		System.out.println("Gera um número aleatório entre 1 e 100 :"+num1);
		
		num1 = numeroAleatorio.nextInt(9);
		System.out.println("Gera um número aleatório entre 0 e 9 :"+num1);
		
		num1 = 1000+numeroAleatorio.nextInt(112);
		System.out.println("Gera um número aleatório entre 1000 e 1112 :"+num1);
		
		num1 = numeroAleatorio.nextInt(3) - 1;
		System.out.println("Gera um número aleatório entre -1 e 1 :"+num1);
		
		num1 = numeroAleatorio.nextInt(15) - 3;
		System.out.println("Gera um número aleatório entre -3 e 11 :"+num1);

		
		//Questão 6.13
		
		num1 = numPar();
		System.out.println("Gera um número aleatório do conjunto  {2,4,6,8,10} :"+num1);
		
		num1 = numImpar();
		System.out.println("Gera um número aleatório do conjunto  {3,5,7,9,11} :"+num1);
		
		num1 = numQuatroEmQuatro();
		System.out.println("Gera um número aleatório do conjunto  { 6, 10, 14, 18, 22} :"+num1);

		
	}
	
	public static int numPar() {
		SecureRandom numAleatorio = new SecureRandom();
		int num = 1 + numAleatorio.nextInt(10);
		while ( num % 2 != 0 ) {
			num = 1 + numAleatorio.nextInt(10);
		}
		return num;
	}
	
	public static int numImpar() {
		SecureRandom numAleatorio = new SecureRandom();
		int num = 3 + numAleatorio.nextInt(9);
		while ( num % 2 != 1 ) {
			num = 3 + numAleatorio.nextInt(9);
		}
		return num;
	}
	
	public static int numQuatroEmQuatro() {
		SecureRandom numAleatorio = new SecureRandom();
		int num =  (2 + numAleatorio.nextInt(22)+2);
			System.out.println(num > 22 ? "EPA!!!!!": "oia"+num);
		return num;
	}

}
