package br.com.abc.javacore.classesabstratas.classes;

public abstract class Funcionario extends Pessoa {
		protected String clt;
	protected double salario;
	
	
	//Construtores
	
	public Funcionario(){
	}
	
	public Funcionario(String nome, String clt, double salario) {
		this.nome = nome;
		this.clt = clt;
		this.salario = salario;
	}
	
	//Métodos ABSTRATOS

	public abstract void calculaSalario();
	
	
	//Métodos
	
	public void imprime(){
		System.out.println("Dentro do imprime de funcionario");
	}
	
	
	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", clt=" + clt + ", salario="
				+ salario + "]";
	}

	//Métodos GETTERS e SETTERS
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getClt() {
		return clt;
	}
	public void setClt(String clt) {
		this.clt = clt;
	}
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}


	
}
