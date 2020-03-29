package br.com.abc.javacore.heranca.classes;

public class Funcionario extends Pessoa{
	private double salario;
	{
		System.out.println("Funcionario - Dentro do bloco de inicialização 1");
	}
	{
		System.out.println("Funcionario - Dentro do bloco de inicialização 2");
	}
	static {
		System.out.println("Funcionario - Dentro do bloco de inicialização STATIC 1");
	}
	
	public Funcionario(String nome){
		super(nome);
		System.out.println("Dentro do construtor de funcionarios");
	}
	
	public void imprime(){
		super.imprime();
		System.out.println("Salario: "+this.salario);
		imprimeReciboPagamento();
	}
	
	public void imprimeReciboPagamento(){
		System.out.println("Eu "+super.nome+" recebi o pagamento do salário no valor de: "+this.salario);
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	

}
