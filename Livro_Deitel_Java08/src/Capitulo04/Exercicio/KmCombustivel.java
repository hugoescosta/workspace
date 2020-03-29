package Capitulo04.Exercicio;

public class KmCombustivel {
	private int kmDirigido;
	private int ltrGasolinaConsumido;
	private double consumo;
	
	
	
	
		


	public KmCombustivel() {
	}	
	
	public KmCombustivel(int kmDirigido, int ltrGasolinaConsumido) {
		this.kmDirigido = kmDirigido;
		this.ltrGasolinaConsumido = ltrGasolinaConsumido;
	}
	//Getters e Setters
	public int getKmDirigido() {
		return kmDirigido;
	}
	public int getLtrGasolinaConsumido() {
		return this.ltrGasolinaConsumido;
	}
	public void setKmDirigido(int kmDirigido) {
		this.kmDirigido = kmDirigido;
	}
	public void setLtrGasolinaConsumido(int ltrGasolinaConsumido) {
		this.ltrGasolinaConsumido = ltrGasolinaConsumido;
	}
	
	public double getConsumo() {
		return consumo;
	}
	
	//Métodos
	
	public void calclularConsumo() {
		double consumo = this.kmDirigido / this.ltrGasolinaConsumido;
	}
	
	public void imprimeConsumoPorLitro () {
		System.out.printf("Você dirigiu %d km e consumiu %d de gasolina, gastando %.2f de gasolina por km %n",this.kmDirigido,this.ltrGasolinaConsumido,this.consumo);
	}
	

}
