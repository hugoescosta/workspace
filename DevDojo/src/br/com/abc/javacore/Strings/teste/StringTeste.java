package br.com.abc.javacore.Strings.teste;

import javax.swing.JOptionPane;

public class StringTeste {
	public static void main(String[] args){
		String nome = "Hugo";
		nome = nome.concat(" Costa");
		String nome2 = "Hugo";
		String nome3 = new String("Silveira"); // 1. Variavel de referência, 2. um objeto do tipo String, 3. Uma string no POOL de Strings 
		//JOptionPane.showMessageDialog(null,nome);
		
		String teste = "Goku";
		String teste2 = "Hugo Costa";
		String teste3 = "                             Hugo Costa                                  ";
		System.out.println(teste.charAt(2));
		System.out.println(teste.equals(teste2)); // Será mostrado o valor FALSE
		System.out.println(teste.equalsIgnoreCase(teste2)); // Será mostrado o valor TRUE pois será ignorado maiúscula e minúsculas
		System.out.println(teste.length());
		System.out.println(teste.replace("u","a"));
		System.out.println(teste2.replace("o","a"));
		System.out.println(teste2.toUpperCase());
		System.out.println(teste2.substring(0,7));
		System.out.println(teste3.trim());
	}
}
