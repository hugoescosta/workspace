package br.com.abc.javacore.heranca.classes;
import br.com.abc.javacore.heranca.classes.*;

public class Pessoa extends Object{
	protected String nome;
	protected String cpf;
	protected Endereco endereco;
	
	public Pessoa(String nome) {
		System.out.println("Dentro do construtor de pessoa");
		this.nome = nome;
	}
	
	static {
		System.out.println("PESSOA - Dentro do bloco de inicialização ESTÁTICO!!!");
	}
	{
		System.out.println("PESSOA - Dentro do bloco de inicialização 1");
	}
	{
		System.out.println("PESSOA - Dentro do bloco de inicialização 2");
	}

	//Construtores

		

	//Métodos
	
	public void imprime(){
		System.out.println("Nome: "+this.nome);
		System.out.println("CPF: "+this.cpf);
		System.out.println("Endereço: "+this.endereco.getRua());
		System.out.println("Bairro: "+this.endereco.getBairro());
	}

	//Métodos Getters e Setters
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	
	
	
	
}
