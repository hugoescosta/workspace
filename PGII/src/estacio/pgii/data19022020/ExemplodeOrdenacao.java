package estacio.pgii.data19022020;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ExemplodeOrdenacao {
	public static void main(String[] args) {
		List lista = new LinkedList<Integer>();
		lista.add(new Integer(10));
		lista.add(20);
		lista.add(new Integer(5));
		lista.add(new Integer(3));
		lista.add(10);
		lista.add(new Integer(-5));
		lista.add(new Integer(6));
		lista.add(8);
		lista.add(new Integer(-2));
		lista.add(4);
		
		System.out.println("lista na ordem de entrada");
		System.out.println(lista);
		
		System.out.println("lista na ordem crescente");
		Collections.sort(lista);
		System.out.println(lista);
		
		
	}

}
