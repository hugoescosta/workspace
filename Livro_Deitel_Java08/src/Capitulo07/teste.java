package Capitulo07;

public class teste {

	public static void main(String[] args) {
		int[] notas = { 2 , 2 , 2 };
		
		int notaMenor = notas[1];
		
		for ( int x : notas ) {
			if ( x < notaMenor) {
				notaMenor = x;
			}
		}
		
		int[] notas2 = new int[4];
		for (int grade : notas)
			++notas2[grade];
		
		for (int grade : notas2)
			System.out.println(grade);
		

	}

}
