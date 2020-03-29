package br.com.abc.javacore.ExpressoesRegulares.testes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegularesTestes {
	public static void main(String[] args) {
		// \d - Busca todos os números
		// \D - Busca tudo que não é número
		// \s - Busca espaços em branco que são \t \n \f \r
		// \S - Busca tudo que não é em branco
		// \w - Busca caracteres de palavras a-z A-Z, numeros e _
		// \W - Busca tudo que não for caracteres de palavras
		// [] - [a-zA-Z0-9]
		// ? Siginifica zero ou uma ocorrências
		// * Significa zero ou mais ocorrências
		// + uma ou mais ocorrências
		// {n,m}de n até m ocorrências
		// ( ) agrupar
		// | ou
		// $ utilizado fim de linha, encontrar algo que esteja no final da linha
		// o(v|c)o procure algo que começa com o seguido de v ou c e termine com o, exemplo: ovo, oco
		// maca(rr|c)ão = macarão ou macacão
		// . (ponto) é um caractere coringa, podendo ser substituído por qualquer coisa
		// ^ - caractere de negação, exemplo [^abc],  
		
		
		//String regex = "aba";
		//String regex = "\\d";
		//String regex = "\\D";
		//String regex = "\\s";
		//String regex = "\\w";
		//String regex = "\\W";

 
		int numeroHex = 0XaFF;
		
		//String regex = "[a-zA-Z0-9]";
		//String texto = "#@h\rab\t1278Hugo eD_u";
		//String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
		//String texto = "12 0x 0X 0xFFABC 0x10G 0x1";
		//String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+"; // ou assim: String regex = "([\\w\\.-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
		//String texto = "fulano@hotmail.com, 102Abc@gmail.com, #@!abrao@mail.com, teste@gmail.br, teste@mail,hugo.costa@sepog.fortaleza.ce.gov.br";

		//String regex = "(\\d{2}/\\d{2}/\\d{2,4})";
		//String texto = "12/13/2002 12/01/95 15/02/2017";

		String regex = "proj([^,])*";
		String texto = "proj1.bkp, proj1.java, proj1final.java, proj2.bkp, proj3.java";

		
		//System.out.println("Teste email válido I : "+"#@!abrao@mail.com".matches(regex));
		System.out.println("Data válida? "+texto.matches(regex));
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(texto);
		System.out.println("texto:  "+texto);
		System.out.println("indice: 0123456789");
		System.out.println("expresão: "+matcher.pattern());
		System.out.println("posições encontradas:");
		while(matcher.find()) {
			System.out.println(matcher.start()+ " "+matcher.group());
		}
		System.out.println("\n"+numeroHex);
	}

}
