package Q3.classes;

import javax.swing.JOptionPane;

public class Peixe extends Animal{
	private String caracteristica;
	
	public Peixe() {
		super();
		// TODO Auto-generated constructor stub
		this.caracteristica = JOptionPane.showInputDialog("Qual a caracteristica?");
	}

	public Peixe(String nome, String cor, String ambiente, int comprimento,
			int patas, float velocidade, String caracteristica) {
		super(nome, cor, ambiente, comprimento, patas, velocidade);
		this.caracteristica = caracteristica;
		// TODO Auto-generated constructor stub
	}


	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}

	@Override
	public void dados(){
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("Animal: "+this.nome);
		System.out.println("Comprimento: "+this.comprimento);
		System.out.println("Patas: "+this.patas);
		System.out.println("Cor: "+this.cor);
		System.out.println("Ambiente: "+this.ambiente);
		System.out.println("Velocidade: "+this.velocidade);
		System.out.println("Característica: "+ this.caracteristica);
	}
	
	
	

}
