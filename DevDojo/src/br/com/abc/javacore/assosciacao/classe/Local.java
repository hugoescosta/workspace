package br.com.abc.javacore.assosciacao.classe;

public class Local {
	private String rua;
	private String bairro;	
	
	
	//Construtores
	public Local(String rua, String bairro) {
		this.rua = rua;
		this.bairro = bairro;
	}
	public Local() {
	}
	
	public void print(){
		System.out.println("=-=-=-=-=-=-=-=-=-=..: Relatório de Local:..=-=-=-=-=-=-=-=-=-=");
		System.out.println("Rua: "+this.rua);
		System.out.println("Rua: "+this.bairro);
	}
	
	//Métodos getters e setters
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
}
