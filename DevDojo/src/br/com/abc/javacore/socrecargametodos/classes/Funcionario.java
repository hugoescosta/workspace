package br.com.abc.javacore.socrecargametodos.classes;

public class Funcionario {
	private String nome;
	private String cpf;
	private double salario;
	private String rg;
	
	public Funcionario(String nome, String cpf, double salario, String rg){
		System.out.println("Dentro do construtor");
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
		this.rg = rg;
	}
	
	public Funcionario() {
		
	}
	
	public void init(String nome, String cpf, double salario){
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;	
	}
	
	public void init(String nome, String cpf, double salario,String rg){
		init(nome,cpf,salario);	
		this.rg = rg;
	}
	
//	public void init(){	
//	}
	
	
	public void imprime(){
		System.out.println("Nome: "+this.nome);
		System.out.println("CPF: "+this.cpf);
		System.out.println("Salário R$: "+this.salario);
		System.out.println("Salário R$: "+this.rg);
	}

	
	// Getters e Setters
	
	//Setters
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public void setCpf(String cpf){
		this.cpf = cpf;
	}
	
	public void setSalario(double salario){
		this.salario = salario;
	}
	
	public void setRg(String rg){
		this.rg = rg;
	}
	
	//Getters
	public String getNome(){
		return this.nome;
	}
	
	public String getCpf(){
		return this.cpf;
	}
	
	public double getSalario(){
		return this.salario;
	}
	
	public String getRg(){
		return this.rg;
	}
	
}
