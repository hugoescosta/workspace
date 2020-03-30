package Capitulo07;

public class Cartas {
	private final String face; // face da carta: Ace, Dama, Valete, Reis...
	private final String suit; // naipe da carta: Ouros, Espadas, Copas e Paus
	
	
	//Construtor de dois arugumentos, inicializa face e naipe da carta
	public Cartas(String cardFace, String cardSuit) {
		this.face = cardFace;
		this.suit = cardSuit;
	}
	
	//retorna representação String da carta
	public String toString() {
		return face + " de " + suit;
	}
} //Fim da classe Cartas
