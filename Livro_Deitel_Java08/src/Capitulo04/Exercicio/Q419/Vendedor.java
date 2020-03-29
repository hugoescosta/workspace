package Capitulo04.Exercicio.Q419;

public class Vendedor {
	private String nome;
	private double salario;
	private double comissao;
	private double totalVendas;
	
	
	//contrutor
	
	public Vendedor() {
	}
	
	public Vendedor(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
	
	
	//getters e setters
	public String getNome() {
		return nome;
	}
	public double getSalario() {
		return salario;
	}
	public double getComissao() {
		return comissao;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	
	//metodo
	public void vender(int item, double valor, int qtd) {
		this.totalVendas = totalVendas + (valor * qtd);
	}
	
	public void calculaSalario() {
		this.salario = this.salario + (this.totalVendas*9/100);
	}
	
}
