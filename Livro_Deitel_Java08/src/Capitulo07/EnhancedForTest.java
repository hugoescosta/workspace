package Capitulo07;

public class EnhancedForTest {

	public static void main(String[] args) {
		int[] array = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 }; // cria��o do array de inteiros e seu elementos
		int sum = 0; // vari�vel SUM receber� a soma de todos os valores do array
		
		for ( int item : array) {
			sum = sum + item; // somando os valores do array, tam pode ser assim:
			// sum += item;
		}
		
		System.out.println("A soma de todos os n�meros do ARRAY � :" + sum); // mostrando o resultado

	}

}
