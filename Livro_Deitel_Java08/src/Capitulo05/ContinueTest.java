package Capitulo05;

public class ContinueTest {

	public static void main(String[] args) {
		int count;
		
		for (count = 1 ; count <= 10 ; count++) {
			if ( count == 5) {
				continue;
			}
			System.out.printf("Count é %d %n",count);
		}
		System.out.printf("Usado o continue para pular a impressão do numero 5");
	}

}
