package Capitulo05.Exercicio;

public class ImpressaoTriangulos {

	public static void main(String[] args) {
		
		System.out.println("Padrão A");
		for (int i = 1; i <= 10 ; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.printf("*");
			}
			System.out.println("");
		}
		System.out.println("");
		System.out.println("Padrão B");
		for (int i = 10; i >= 1 ; i--) {
			for (int j = i; j >=1 ; j--) {
				System.out.printf("*");
			}
			System.out.println("");
		}
		System.out.println("");
		System.out.println("Padrão C");
		for (int i = 10; i >= 1 ; i--) {
			for (int j = i; j >=1 ; j--) {
					System.out.printf("*");
			}
			System.out.println("");
			for (int x = 10; x >=i ; x--) {
				System.out.printf(" ");
			}
		}
		System.out.println("");
		System.out.println("Padrão D");		
		for (int i = 1; i <= 10 ; i++) {
			for (int x = 10; x >i ; x--) {
				System.out.printf(" ");
			}
			for (int j = i; j >=1 ; j--) {
					System.out.printf("*");
			}
			System.out.println("");

		}
	}

}
