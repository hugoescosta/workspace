package Capitulo03.Exercicio;

public class Invoice {
	private String numero;
	private String descricao;
	private int qtd;
	private double precoItem;
	private double totalNota; 
	private double totalItem;
	//Construtores
	

	
	public Invoice(String numero, String descricao, int qtd, double precoItem) {
		this.numero = numero;
		this.descricao = descricao;
		this.qtd = qtd;
		this.precoItem = precoItem;
	}
	
	
	//Metodos
	
	
	public double getTotalNota() {
		return totalNota;
	}


	public double getTotalItem() {
		return totalItem;
	}

	public void getInvoiceAmount(int qtd, double precoItem) {
		totalItem = qtd * precoItem;
		totalNota = totalNota + totalItem;
	}
	
	//Getters e Setters
	public String getNumero() {
		return numero;
	}

	public String getDescricao() {
		return descricao;
	}
	public int getQtd() {
		return qtd;
	}
	public double getPrecoItem() {
		return precoItem;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public void setQtd(int qtd) {
		if ( qtd > 0 )
		{
			this.qtd = qtd;
		}
	}
	public void setPrecoItem(double precoItem) {
		if ( precoItem > 0 ) {
			this.precoItem = precoItem;
		}
	}
	

}
