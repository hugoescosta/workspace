package Capitulo03;

public class Account {
	private String nome;
	private double balance;
	
	
	//Construtores
	public Account() {
	}
	
	public Account(String nome) {
		this.nome = nome;
	}
	
	public Account(String nome, double balance) {
		this.nome = nome;
		
		if (balance > 0.0) {
			this.balance = balance;
		}
	}
	
	//Métodos Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) { // nome é a variável da instância
		this.nome = nome; //this.nome, onde esse nome é a variável do método
	}
	
	public double getBalance() {
		return balance;
	}
	
	//Métodos
	public void deposito(double depositoValor) {
		if (depositoValor > 0.0 ) {
			balance = balance + depositoValor;
		}
	}
	
	public void displayAccount() {
		System.out.printf("%s saldo inicial: $%.2f %n",getNome(),getBalance());
	}
	
	
	
}
