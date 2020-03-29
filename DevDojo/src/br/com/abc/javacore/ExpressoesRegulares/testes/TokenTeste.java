package br.com.abc.javacore.ExpressoesRegulares.testes;

public class TokenTeste {

	public static void main(String[] args) {
		String str = "Hugo1 Caio2 Davi3 Elizete4 Oscar5 Victor6 Rodrigo7 Diego8";
		String[] tokens = str.split("\\d"); // usamos regex para definir o delimitador, nesse caso os números
		for (String arr: tokens) {
			System.out.println(arr.trim());
		}
		
		
	}
}
