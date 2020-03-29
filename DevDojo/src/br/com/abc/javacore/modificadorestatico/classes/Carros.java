package br.com.abc.javacore.modificadorestatico.classes;

public class Carros {
	//Velocidade limite deve ser de 240km/h
	private String nome;
	private double velocidadeMaxima;
	private static double velocidadeLimite = 240;
	//Um atributo STATIC sempre vai ser compartilhado com todos os atributos daquela classe, pois ele não faz parte do objeto e sim da CLASSE.
	
	//Não se pode acessar atributos de classe dentro de métodos estáticos 
	
	public Carros(String nome, double velocidadeMaxima){
		this.nome = nome;
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	public Carros(){
	}
	
	public static void setVelocidadeLimite(double velocidadeLimite){
		Carros.velocidadeLimite = velocidadeLimite;
	}
	
	public static double getVelocidadeLimite(){
		return velocidadeLimite;
	}
	
	//
	
	public void imprime(){
		System.out.println("----------------------------------------");
		System.out.println("Nome "+this.nome);
		System.out.println("Velocidade máxima: "+this.velocidadeMaxima);
		System.out.println("Velocidade limite: "+ velocidadeLimite);
	}
	
	
	//Getters e Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}
	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
	//public double getVelocidadeLimite() {
		//return velocidadeLimite;
	//}
	//public void setVelocidadeLimite(double velocidadeLimite) {
		//this.velocidadeLimite = velocidadeLimite;
	//}
	

}
