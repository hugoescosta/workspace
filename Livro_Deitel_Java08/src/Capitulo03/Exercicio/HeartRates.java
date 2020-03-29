package Capitulo03.Exercicio;

import javax.swing.JOptionPane;

public class HeartRates {
	private String nome;
	private String sobreNome;
	private int dia;
	private int mes;
	private int ano;
	private int idade;
	private int fcm;
	private int fca;
	
	
	//Construtores
	//public HeartRates() {
	//}
	public HeartRates(String nome, String sobreNome, int dia, int mes, int ano) {
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}	
	

	//Getters e Setters
	public String getNome() {
		return nome;
	}
	public String getSobreNome() {
		return sobreNome;
	}
	public int getDia() {
		return dia;
	}
	public int getMes() {
		return mes;
	}
	public int getAno() {
		return ano;
	}
	public int getIdade() {
		return idade;
	}
	public int getFcm() {
		return fcm;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	//metodos
	public int calculaIdade(int anoAtual) {
		idade = anoAtual - this.ano;
		return idade;
	}

	public int calculaFreqCardMaxima() {
		fcm = 220 - this.idade;
		return fcm;
	}

	
}
