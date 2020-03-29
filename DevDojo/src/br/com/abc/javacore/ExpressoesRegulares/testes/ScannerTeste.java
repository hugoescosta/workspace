package br.com.abc.javacore.ExpressoesRegulares.testes;

import java.util.Scanner;

public class ScannerTeste {

	private static Object object;

	public static void main(String[] args) {
		Scanner scanner = new Scanner("1 true 100 oi");
		while(scanner.hasNext()) {
			System.out.println(scanner.next());
		}
		System.out.println("#########################");
		Scanner scanner2 = new Scanner("1 true 100 oi");
		while(scanner2.hasNext()) {
			if(scanner2.hasNextInt()) {
				int i = scanner2.nextInt();
				System.out.println("Tipo Interiro: "+ i);
			}else if(scanner2.hasNextBoolean()) {
				boolean b = scanner2.nextBoolean();
				System.out.println("Tipo booleano: "+b);
			}else{
				System.out.println(scanner2.next());
			}
		}
	}

}