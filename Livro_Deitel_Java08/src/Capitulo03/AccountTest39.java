package Capitulo03;

import java.util.Scanner;

public class AccountTest39 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Account account1 = new Account("Davi Costa",50.00);
		Account account2 = new Account("Caio Costa",-7.53);
		
		account1.displayAccount();
		//System.out.printf("%s saldo inicial: $%.2f %n",account1.getNome(),account1.getBalance());
		account2.displayAccount();
		//System.out.printf("%s saldo inicial: $%.2f %n%n",account2.getNome(),account2.getBalance());
		System.out.println("Entre com o valor para depósito na account1:");
		double depositoValor = entrada.nextDouble();
		
		System.out.printf("%nSomando o valor %.2f para a account1 %n%n",depositoValor);
		account1.deposito(depositoValor);
		
		account1.displayAccount();
		//System.out.printf("%s saldo: %.2f%n",account1.getNome(),account1.getBalance());
		account2.displayAccount();
		//System.out.printf("%s saldo: %.2f%n%n",account2.getNome(),account2.getBalance());
		System.out.println("Entre com o valor para depósito na account2:");
		depositoValor = entrada.nextDouble();
		
		System.out.printf("%nSomando o valor %.2f para a account2 %n%n",depositoValor);
		account2.deposito(depositoValor);
		
		
		account1.displayAccount();
		//System.out.printf("%s saldo: %.2f%n",account1.getNome(),account1.getBalance());
		account2.displayAccount();
		//System.out.printf("%s saldo: %.2f",account2.getNome(),account2.getBalance());

	}

}
