package Capitulo04;

public class Increment {

	public static void main(String[] args) {
		int c = 5;
		
		System.out.printf("C antes de pos-incremento  %d%n ",c);
		System.out.printf("C pos-incremento           %d%n ",c++);
		System.out.printf("C depois de pos-incremento %d%n ",c);
		
		System.out.println("");
		c=5;
		System.out.printf("C antes de pre-incremento  %d%n ",c);
		System.out.printf("C pre-incremento           %d%n ",++c);
		System.out.printf("C depois de pre-incremento %d%n ",c);		

	}

}
