package Capitulo05.Exercicio;

public class fatorial {
	public static void main(String[] args) {
		long fator = 20;
		long f = 0;
		
		for ( int i = 20; i >0 ; i--) {
			fator =  fator * (i-1);
			f=fator;
			System.out.println(fator);
		}
	}
}
