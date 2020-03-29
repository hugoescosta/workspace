package Q3.classes;

import javax.swing.JOptionPane;

public class Animal {
	protected String nome, cor, ambiente, caracteristica,alimento;
	protected int comprimento, patas;
	protected float velocidade;
	
	public Animal(){
		nome = JOptionPane.showInputDialog("Qual a espécie do animal? (Exemplo: Tubarão, Urso, Camelo... )");
		cor = JOptionPane.showInputDialog("Qual a cor?");
		ambiente = JOptionPane.showInputDialog("Qual o habita natural?");
		comprimento = intParseInt(JOptionPane.showInputDialog("Qual o comprimento?"));
		patas = intParseInt(JOptionPane.showInputDialog("Quantas patas possui?"));
		velocidade = FloatParseFloat(JOptionPane.showInputDialog("Qua a velicidade em m/s?"));
	}
	
	public Animal(String nome, String cor, String ambiente, int comprimento, int patas, float velocidade) {
		super();
		this.nome = nome;
		this.cor = cor;
		this.ambiente = ambiente;
		this.comprimento = comprimento;
		this.patas = patas;
		this.velocidade = velocidade;
	}

	
	//Métodos Getters e Setters
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getAmbiente() {
		return ambiente;
	}

	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}

	public int getComprimento() {
		return comprimento;
	}

	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}

	public float getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}
	
	
	private float FloatParseFloat(String showInputDialog) {
		// TODO Auto-generated method stub
		return 0;
	}

	private int intParseInt(String showInputDialog) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "Animal [nome=" + nome + ", cor=" + cor + ", ambiente="
				+ ambiente + ", comprimento=" + comprimento + ", patas="
				+ patas + ", velocidade=" + velocidade + "]";
	}

	public void dados(){
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("Animal: "+this.nome);
		System.out.println("Comprimento: "+this.comprimento);
		System.out.println("Patas: "+this.patas);
		System.out.println("Cor: "+this.cor);
		System.out.println("Ambiente: "+this.ambiente);
		System.out.println("Velocidade: "+this.velocidade);
	}
	

	
	
	
	
}
