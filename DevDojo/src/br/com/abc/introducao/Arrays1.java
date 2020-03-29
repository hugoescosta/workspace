package br.com.abc.introducao;
import java.lang.Math;




public class Arrays1 {
	public static void main(String[] args){
		
		int aleatorio;
		int[] idades = new int[(int) (Math.random()*1000000)];
		
		for (int i = 0; i < (idades.length) ; i ++){
			idades[i] = (int) (Math.random()*10000);
			System.out.println(idades[i]);
		}
	}

}
