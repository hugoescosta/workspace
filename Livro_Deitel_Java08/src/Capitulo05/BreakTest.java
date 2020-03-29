package Capitulo05;

public class BreakTest {

	public static void main(String[] args) {
		int count;
		
		for (count = 1 ; count <= 10 ; count++) {
			if ( count == 5) {
				break;
			}
			System.out.printf("Count é %d %n",count);
		}
		System.out.printf("Loop quebrado quanto Count igual a %d",count);
	}

}
