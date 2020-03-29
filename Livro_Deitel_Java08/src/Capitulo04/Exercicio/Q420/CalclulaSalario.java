package Capitulo04.Exercicio.Q420;

public class CalclulaSalario {
	private int salHora;
	private int qtdHorashrTrabalhada;
	private int salBruto;
	
	
	//Construtores
	
	public CalclulaSalario(int salHora, int qtdHorashrTrabalhada) {
		this.salHora = salHora;
		this.qtdHorashrTrabalhada = qtdHorashrTrabalhada;
	}

	
	//Getters e Setters

	public double getSalHora() {
		return salHora;
	}


	public int getQtdHorashrTrabalhada() {
		return qtdHorashrTrabalhada;
	}


	public double getSalBruto() {
		return salBruto;
	}


	public void setSalHora(int salHora) {
		this.salHora = salHora;
	}


	public void setQtdHorashrTrabalhada(int qtdHorashrTrabalhada) {
		this.qtdHorashrTrabalhada = qtdHorashrTrabalhada;
	}


	public void setSalBruto(int salBruto) {
		this.salBruto = salBruto;
	}
	
	public int calculaSalBruto() {
		if ( this.qtdHorashrTrabalhada > 40 ) {
			this.salBruto = (this.salHora * 40)+((this.salHora*50/100+this.salHora) * (qtdHorashrTrabalhada - 40));
		} else {
			this.salBruto = (this.salHora * 40);
		}
		return this.salBruto;
	}
	

}
