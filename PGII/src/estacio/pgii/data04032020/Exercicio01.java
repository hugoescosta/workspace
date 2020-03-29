package estacio.pgii.data04032020;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Exercicio01 {

	public static void main(String[] args) {
		List<String> nomes = new LinkedList<String>();
		nomes.add("Hugo Costa");
		nomes.add("Elizete");
		nomes.add("Caio");
		nomes.add("Davi");
		nomes.add("Oscar");
		
		System.out.println(nomes+"\n");
		for ( String nome : nomes) {
			System.out.println(nome);
		}
		
		

	}

}
