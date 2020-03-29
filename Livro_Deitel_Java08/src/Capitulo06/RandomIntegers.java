package Capitulo06;
import java.security.SecureRandom;

public class RandomIntegers {

	public static void main(String[] args) {
		SecureRandom numeroSeguro = new SecureRandom();

		for ( int counter = 1; counter <= 20 ; counter++) {
			int num = 1 + numeroSeguro.nextInt(6);
			System.out.printf("%d ",num);
			
			if ( counter % 5 == 0) {
				System.out.println("");
			}
		}
	}

}
