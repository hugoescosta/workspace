package Capitulo05.Exercicio;

public class Interest514 {

	public static void main(String[] args) {
		//Cálculo de juros composto 5% ao ano


		double amount; // Saldo na conta no final de cada ano
		double principal = 1000.0; // valor inicial depositado
		double rate = 0.05 ; // taxa de juros que será aplicada anuelamente

		//Cabeçalho

		System.out.printf("%s%20s %n","Ano","Valof na Conta");

		//Calcula a quantidade de depósito para cada um dos dez anos
		for ( int juros = 5 ; juros <= 10 ; juros++) {
			rate = (double) juros/100; // valor do juros, inicialmente será de 5%, depois será acrescido até 10%
			System.out.println("\nCalculando para juros de: "+juros+" %");
			for ( int year = 1 ; year <= 10 ; ++year) {

				//calculano nova quantidade durante o ano especificado
				amount = principal * Math.pow(1.0 + rate , year);

				//Exibe o ano e a quantidade
				System.out.printf("%4d%20.2f%n",year,amount);
			}
		}
		

	}





}
