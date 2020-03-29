package estacio.pgii.data04032020;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class OrdenaMap {

	public static void main(String[] args) {
		SortedMap<Integer,String> map = new TreeMap<Integer,String>();
		// cria uma coleção map com suas chaves desordenadas
		map.put(new Integer(2),"Benedito");
		map.put(new Integer(3),"Carlos");
		map.put(new Integer(4),"Hamilton");
		map.put(new Integer(1),"Sonia");
		// retorna uma visualização set dos mapeamentos contidos neste mapa
		Set s = map.entrySet();
		Iterator i = s.iterator(); // usando o iterador no SortedMap
		// saída ordenada por chave do map
		// saída ordenada por chave do map
		while(i.hasNext()) {
		 Map.Entry m = (Map.Entry)i.next();
		 int key = (Integer)m.getKey();
		 String value = (String)m.getValue();
		System.out.println("Chave: "+key+" Valor: "+value);
		}
	}
}
