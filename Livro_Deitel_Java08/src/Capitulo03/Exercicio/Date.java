package Capitulo03.Exercicio;

import javax.swing.JOptionPane;

public class Date {
	private int dia;
	private int mes;
	private int ano;
	
	
	//Construtor	
	//public Date( int dia, int mes, int ano ) {
	//	this.dia = dia;
	//	this.mes = mes;
	//	this.ano = ano;
	//}
	public Date() {
	}
	
	//metodo
	
	public void displayDate1() {
		JOptionPane.showMessageDialog(null,"Data: "+this.dia+"/"+this.mes+"/"+this.ano,"Data",JOptionPane.PLAIN_MESSAGE);
	}
	
	public void displayDate2() {
		JOptionPane.showMessageDialog(null,"Data: "+this.getDia()+"/"+this.getMes()+"/"+this.ano,"Data",JOptionPane.PLAIN_MESSAGE);
	}
	
	//setters e getters
	public int getDia() {
		return dia;
	}
	public int getMes() {
		return mes;
	}
	public int getAno() {
		return ano;
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
	
	
}
