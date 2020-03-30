package Capitulo07;

public class InitArray3 {

	public static void main(String[] args) {
		
		final int ARRAY_LENGTH = 10; //declarando constante
		int[] array = new int[ARRAY_LENGTH]; //cria o array com 10 posições
		
		//calcula o valor de cada elemento do array
		for (int counter = 0 ; counter < array.length ; counter++) {
			array[counter] = 2 + 2 * counter;
		}
		
		System.out.printf("%s%8s%n","Index","Value"); //título da coluna
		
		//gera a saída de cada elemento do array
		for (int counter = 0 ; counter < array.length ; counter++) {
			System.out.printf("%5d%8d%n",counter,array[counter]); //Mostra o valor de cada elemento
		}
		

	}

}
