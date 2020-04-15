package Capitulo07;

import java.util.Arrays;

public class ArrayManipulations {

	public static void main(String[] args) {
		
		// classifica doubleArray em ordem crescente
		double[] doubleArray = { 8.4, 9.3, 0.2, 7.9, 3.4 };
		System.out.printf("%nConteúdo do array doubleArray da forma que foi criado: ");
		for (double value : doubleArray) {
			System.out.printf("%.1f ",value);
		}
		
		Arrays.sort(doubleArray);
		System.out.printf("%nConteúdo do array doubleArray ordenado(crescente) : ");
		
		for (double value : doubleArray) {
			System.out.printf("%.1f ",value);
		}
		
		//preenchendo o array de 10 elementos com setes
		int[] filledInArray = new int[10];
		Arrays.fill(filledInArray,7);
		displayArray(filledInArray,"Array filledInArray preenchido com setes: ");
		
		//copia array intArray em array intArrayCopy
		int[] intArray = { 1, 2, 3, 4, 5, 6 };
		int[] intArrayCopy = new int[intArray.length];
					//   Origrem, Inicio, Destino, Inicio, tamanho do array destino
		System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);
		displayArray(intArray, "Conteúdo do array intArray: ");
		displayArray(intArray, "Contéudo do array intArrayCopy que é cópia do array intArray: ");
		
		//Verifica se os array´s intArray e IntArrayCopy possuem os mesmos dados
		boolean b = Arrays.equals(intArray, intArrayCopy);
		//Ao comparar o conteúdo do array, sempre use Arrays.equals(array1, array2),
		//que compara o conteúdo dos dois arrays, em vez de array1.equals(array2),
		//que compara se array1 e array2 se referem ao mesmo objeto array
		
		System.out.printf("%n%nintArray e intArrayCopy são iguais: %s%n%n",( b ? "Verdadeiro" : "Falso"));
		
		//pesquisa o valor 5 em intArray, se não encontrar location será um número negativo
		int location = Arrays.binarySearch(intArray, 5);
		if ( location >= 0 ) {
			System.out.printf("Encontrado 5 em elemento %d em intArray%n%n",location);
		}else {
			System.out.printf("5 não foi encontrado no array intArray%n%n");
		}
		
		
		//pesquisa o valor 8763 em intArray, se não encontrar location será um número negativo
		location = Arrays.binarySearch(intArray, 8763);
		if ( location >= 0 ) {
			System.out.printf("Encontrado 8763 em elemento %d em intArray%n%n",location);
		}else {
			System.out.printf("8763 não foi encontrado no array intArray %d%n%n",location);
		}			
	}

	//gera a saída de valores em cada array
	
	public static void displayArray(int[] array, String description) {
		
		System.out.printf("%n%s ", description);
		for ( int value :  array) {
			System.out.printf("%d", value);
		}
	}
	
}
