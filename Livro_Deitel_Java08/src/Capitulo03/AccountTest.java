package Capitulo03;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Account minhaConta = new Account("Caio Costa");
		String oNome;
		
		System.out.printf("Seu nome inicial é %n%s%n", minhaConta.getNome());
		
		System.out.println("Qual o nome da conta? ");
		oNome = entrada.nextLine();
		//oNome = entrada.next(); // Lé os caracteres digitado até o primeiro espaço em branco, se digitar "Hugo Costa", pegará apenas Hugo
		minhaConta.setNome(oNome);
		
		System.out.printf("Agora seu nome inicial é %n%s%n", minhaConta.getNome());
	
		

	}

}
