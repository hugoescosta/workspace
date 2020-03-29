package estacio.pgii.data17022020;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ExemploHashMap {

	public static void main(String[] args) {
		Map<Integer,String> nomes = new HashMap<Integer,String>();
		nomes.put(5,"Benedito");
		nomes.put(2,"Carlos");
		nomes.put(1,"Hamilton");
		nomes.put(3,"Sonia");
		nomes.put(6,"Bianca");
		nomes.put(4,"Joaquim");
		nomes.put(7,"Caio");
		
		for(String nome: nomes.values()) {
			System.out.println(nome);
		}
	}

}
