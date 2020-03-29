package estacio.pgii.data04032020;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

public class Exercicio02 {

	public static void main(String[] args) {
		//ArrayList<String> frutas = new ArrayList();
		//LinkedList<String> frutas = new LinkedList<String>();
		Set<String> frutas = new LinkedHashSet<String>();

		Scanner entrada = new Scanner(System.in);
		String item;
		for ( int i = 0 ; i < 5; i++) {
			System.out.println("Digita o nome de uma fruta: ");
			frutas.add(entrada.nextLine());
		}
		
		System.out.println(frutas);
	}

}
