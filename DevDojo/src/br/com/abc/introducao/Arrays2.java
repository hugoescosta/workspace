package br.com.abc.introducao;

public class Arrays2 {
	public static void main(String[] args){
		//byte, short, in, float, double = 0
		// char = '\u0000' ' '
		//boolean false;
		// reference null
		String[] nomes = new String[3];
		nomes[0] = "Naruto";
		nomes[1] = "Goku";
		nomes[2] = "Luffy";

		for (int i=0 ; i < nomes.length ; i++ ){
			System.out.println("Nome : "+nomes[i]);
		}
	

	}

}
