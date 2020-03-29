package estacio.pgii.data02032020;

import java.util.LinkedList;
import java.util.Queue;

public class ExemploFila {

	public static void main(String[] args) {
		Queue <String> fila = new LinkedList<>();
		fila.add("Benedito");
		fila.add("Carlos");
		fila.add("Hamilton");
		fila.add("Sonia");
		System.out.println("Elementos da lista"+fila);
		System.out.println("Exibindo o primeiro da lista = " + fila.peek());
		System.out.println("Removendo o primeiro elemento");
		String nome = fila.remove();
		System.out.println("Exibindo o primeiro da lista = " + fila.peek());
	}

}
