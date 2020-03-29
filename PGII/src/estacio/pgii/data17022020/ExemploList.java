package estacio.pgii.data17022020;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ExemploList {

	public static void main(String[] args) {
		List<String> nomes = new LinkedList<String>();  //<String> restrição para receber apenas dados do tipo String
		nomes.add("Benedito");
		nomes.add("Carlos");
		nomes.add("Hamilton");
		nomes.add("Sonia");
		nomes.add("Bianca");
		nomes.add("Joaquim");
		nomes.add("Caio");
		
		System.out.println(nomes.get(0));
		
		System.out.println(nomes.contains("Sonia"));
		System.out.println("=========");
		for ( int i = 0 ; i < nomes.size() ; i++) {
			System.out.println(nomes.get(i));
		}
		
		System.out.println("=========");
		for(String nome : nomes) {
			System.out.println(nome);
		}
		
		System.out.println("=========");
		System.out.println("Ordenação do ARRAYLIST, usando Colletions.sort");
	
		Collections.sort(nomes);
		for(String nome: nomes) {
			System.out.println(nome);
		}
	}
}
