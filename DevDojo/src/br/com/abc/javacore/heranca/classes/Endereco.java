package br.com.abc.javacore.heranca.classes;


public class Endereco {
	private String rua;
	private String bairro;
	
	
	//Construtores
	public Endereco(String rua, String bairro) {
		this.rua = rua;
		this.bairro = bairro;
	}
	public Endereco() {
	}
	
	

	//Métodos Getters e Setters

	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getRua() {
		return rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
}
