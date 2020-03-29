package br.com.abc.javacore.modificadorfinal.classes;

public class Carro {
	public static final double VELOCIDADE_FINAL = 250;
	private final Comprador comprador = new Comprador();
	private String Carro;
	private String Marca;
	
	@Override
	public String toString() {
		return "Carro [Carro=" + Carro + ", Marca=" + Marca + "]";
	}
	
	public final void imprime(){
		System.out.println("Imprimindo um carro");
	}
	
	//Métodos GETTERS and SETTERS
	
	public Comprador getComprador() {
		return comprador;
	}	

	public String getCarro() {
		return Carro;
		
	}
	public void setCarro(String carro) {
		Carro = carro;
	}
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		Marca = marca;
	}
}
