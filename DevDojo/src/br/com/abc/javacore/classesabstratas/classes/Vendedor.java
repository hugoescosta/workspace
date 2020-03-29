package br.com.abc.javacore.classesabstratas.classes;

public class Vendedor extends Funcionario {
	private double totalVendas;




	public Vendedor() {
	}


	public Vendedor(String nome, String clt, double salario, double totalVendas) {
		super(nome, clt, salario);
		this.totalVendas = totalVendas;
	}


	@Override
	public void calculaSalario(){
		this.salario = salario + (totalVendas * 0.5);
	}

	@Override
	public void imprime() {
		System.out.println("Dentro do método imprime do vendedor");
	}
	
	
	//Getters e Setters
	public double getTotalVendas() {
		return totalVendas;
	}

	public void setTotalVendas(double totalVendas) {
		this.totalVendas = totalVendas;
	}
	
}
