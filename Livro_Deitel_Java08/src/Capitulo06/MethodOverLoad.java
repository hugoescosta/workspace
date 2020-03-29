package Capitulo06;

public class MethodOverLoad {

	public static void main(String[] args) {
		// teste de métodos square sobrecarregados
		
		System.out.printf("O quadrada de 7 é %d%n", square(7));
		System.out.printf("O quadrada de 7.5 é %f%n", square(7.5));


	}
	
	// método square com valor inteiro
	
	public static int square( int intValue ) {
		System.out.printf("%nChamada do método com um valor inteiro: %d%n", intValue);
		return intValue + intValue;
	}
	
	public static double square( double doubleValue ) {
		System.out.printf("%nChamada do método com um valor double: %f%n", doubleValue);
		return doubleValue + doubleValue;
	}
	
}
