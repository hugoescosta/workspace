package estacio.pgii.data19022020;

import java.util.Map;
import java.util.TreeMap;

public class ExemploTreeMap {

	public static void main(String[] args) {
		Map<Integer,String> nomes = new TreeMap<Integer,String>();
			nomes.put(5,"Benedito");
			nomes.put(2,"Carlos");
			nomes.put(1,"Hamilton");
			nomes.put(3,"");
			nomes.put(6,"Bianca");
			nomes.put(4,"Joaquim");
			nomes.put(7,"Caio");
			
			for(String nome: nomes.values()) {
				System.out.println(nome);
			}
		}

}