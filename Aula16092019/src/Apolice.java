import javax.swing.*;
public class Apolice {
	
	private String nomeSegurado;
	private int idadeSegurado;
	private double valorPremio;
	
	public Apolice(){
	}
	
	public Apolice(String nomeSegurado, int idadeSegurado, double valorPremio){
		this.nomeSegurado = nomeSegurado;
		this.idadeSegurado = idadeSegurado;
		this.valorPremio = valorPremio;
	}
	
	public void calcularPremioApolice(int idadeSegurado){
		this.idadeSegurado = idadeSegurado;
		if (this.idadeSegurado >= 18 && this.idadeSegurado  <= 25 ){
			this.valorPremio += (valorPremio*20)/100;
		}else if (this.idadeSegurado > 25 && this.idadeSegurado  <= 36 ){
			this.valorPremio += (valorPremio*15)/100;
		}else if (this.idadeSegurado > 36){
			this.valorPremio += (valorPremio*10)/100;
		}else{
			JOptionPane.showMessageDialog(null,  "Ops, segurado é menor de IDADE!!!");
		}
	}
	
	public String getNomeSegurado(){
		return nomeSegurado;
	}
	
	public void setNomeSegurado(String nomeSegurado){
		this.nomeSegurado = nomeSegurado;
	}
	
	public int getIdadeSegurado(){
		return idadeSegurado;
	}
	
	public void setIdadeSegurado(int idadeSegurado){
		this.idadeSegurado = idadeSegurado;
	}
	
	public double getValorPremio(){
		return valorPremio;
	}
	
	public void setIdadeSegurado(double valorPremio){
		this.valorPremio = valorPremio;
	}
}
