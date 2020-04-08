package Capitulo07;

public class InitArray4 {
	public static void main(String[] args) {
		int[][] array1 = {{1,2,3},{4,5,6}};
		int[][] array2 = {{1,2},{3},{4,5,6}};
		
		System.out.println("Valores do ARRAY1 por linha s�o:");
		outputArray(array1);
		
		System.out.println("\nValores do ARRAY2 por linha s�o:");
		outputArray(array2);
		
	}
	
	//gera saida de linhas e colunas de um Array bidimensional
	
	public static void outputArray(int[][] array ) {
		
		for ( int row = 0 ; row < array.length ; row++) {
			for ( int column = 0 ; column < array[row].length ; column++) {
				System.out.printf("   %d", array[row][column]);
			}
			System.out.println();
		}
		
	}
}
