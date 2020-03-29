package br.com.abc.javacore.interfaces.classes;

public class Produto implements Tributavel, Transportavel {
	private String nome;
	private double peso;
	private double preco;
	private double precoFinal;
	private double valorFrete;

	
	//Getters e Setters
	public double getPrecoFinal() {
		return precoFinal;
	}
	public double getValorFrete() {
		return valorFrete;
	}
	/////////////////////////////////

	public void calculaFrete() {
		this.valorFrete = this.preco/peso * 0.1;
		
	}

	public void calculaImposto() {
		precoFinal = this.preco + (this.preco * IMPOSTO);
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", peso=" + peso + ", preco=" + preco
				+ ", Preço Final com IMPOSTO=" + precoFinal + ", valorFrete=" + valorFrete
				+ "]";
	}

	
	//Contrutores
	public Produto(String nome, double peso, double preco) {
		this.nome = nome;
		this.peso = peso;
		this.preco = preco;
	}

	
	
	
	
	
	

	


	

	
	
	
}
