package Capitulo07;

public class InitArray {

	public static void main(String[] args) {
		// declara a variável array de inteiros com 10 posições
		
		int[] array = new int[10];
		
		System.out.printf("%s%8s%n","Index","Value"); // Títulos da coluna
		
		// gera a saída do array
		
		for (int counter = 0 ; counter < array.length ; counter++) {
			System.out.printf("%d%8d%n",counter,array[counter]);
		}

	}

}
