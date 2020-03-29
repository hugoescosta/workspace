package estacio.pgii.data09032020;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExePrintStrackTrace {

	public static void main(String[] args) {
		System.out.println("Uso do método printStrackTrace");
		Scanner entrada = new Scanner(System.in);
		try {
			System.out.println("Caso entrada de dados, ilegal, causará uma exceção");
			System.out.println("Informe dua idade:");
			int idade = entrada.nextInt();
			System.out.println(idade);
		} catch(InputMismatchException e) {
			e.printStackTrace();
		}

	}

}
