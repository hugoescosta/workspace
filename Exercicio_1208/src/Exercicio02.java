import java.util.Scanner;
public class Exercicio02 {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		boolean intervalo;
		int num;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número: ");
		num = entrada.nextInt();
		
		if ( (num > -10) && (num < 30)) {
			intervalo = true;
			System.out.println();
			System.out.println(num + "Pertence ao intervalo de -10 a 30 ? " +intervalo);
		} else {
			intervalo = false;
			System.out.println();
			System.out.println(num + "Não pertence ao intervalo de -10 a 30 " +intervalo);
			
		}
			

	}

}
