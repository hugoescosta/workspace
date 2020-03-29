package br.com.abc.introducao;

public class Arrays3 {
	public static void main(String[] args){
		int[] numeros = new int[5];
		int[] numeros2 ={1,2,3,4,5}; // tamanho do array 5 posições, mas o índice vai de 0 a 4
		int[] numeros3 = new int[]{1,2,3,4,5};
		
		
		for( int i = 0; i < numeros2.length; i++ ){
			System.out.println(numeros2[i]);			
		}
		
		for(int aux : numeros2){
			System.out.println(aux);
		}
		
		for(int num : numeros3){
			System.out.println(num);
		}
		
	}

}
