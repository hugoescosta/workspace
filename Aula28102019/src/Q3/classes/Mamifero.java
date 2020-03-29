package Q3.classes;

import javax.swing.JOptionPane;

public class Mamifero extends Animal{
	private String alimento;

	
	//Contrutores
	public Mamifero() {
		super();
		this.alimento = JOptionPane.showInputDialog("Qual o alimento?");
	}

	public Mamifero(String nome, String cor, String ambiente, int comprimento,
			int patas, float velocidade) {
		super(nome, cor, ambiente, comprimento, patas, velocidade);
	}
	
	public Mamifero(String nome, String cor, String ambiente, int comprimento,
			int patas, float velocidade,String alimento) {
		super(nome, cor, ambiente, comprimento, patas, velocidade);
		this.alimento = alimento;
	}
	
	
	//Métodos Getters e Setters
	
	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
	
	public void dados(){
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("Animal: "+this.nome);
		System.out.println("Comprimento: "+this.comprimento);
		System.out.println("Patas: "+this.patas);
		System.out.println("Cor: "+this.cor);
		System.out.println("Ambiente: "+this.ambiente);
		System.out.println("Velocidade: "+this.velocidade);
		if (this.alimento != null){
			System.out.println("Alimento: "+alimento);	
		}
	}
	
	

}
