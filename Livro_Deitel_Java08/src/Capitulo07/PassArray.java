package Capitulo07;

public class PassArray {

	public static void main(String[] args) {
		
		int[] array = { 1, 2, 3, 4, 5 };
		System.out.printf("Efeitos da passagem de refer�ncia pelo ARRAY: %nO valor original do array �: %n");
		for (int value : array) {
			System.out.printf("%4d", value);
		}
		
		modifyArray(array);
		System.out.println();
		for (int value : array) {

			System.out.printf("%4d", value);
		}
		
		modifyElement(array[3]);
		System.out.println("\nObserve abaixo que o valor n�o foi alterado no ARRAY,\nsomente dentro do m�todo modifyElement");
		for (int value : array) {

			System.out.printf("%4d", value);
		}
		
	}
	
	//multiplica cada elemento de um array por 2
	public static void modifyArray( int[] array2) {
		for ( int counter = 0 ; counter < array2.length ; counter++) {
			array2[counter] = array2[counter]*2;
		}
	}
	
	public static void modifyElement(int element) {
		System.out.println();
		element = element*2;
		System.out.printf("O valor do elemento no m�todo modifyElement � %d",element);
	}

}
