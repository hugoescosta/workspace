package Capitulo07;

import java.security.SecureRandom;

public class DeckOfCards {
	private Cartas[] deck; // Array de objetos Cartas
	private int currentCard; // Indice da próxima carta a ser distribuída (0-51)
	private static final int NUMBER_OF_CARDS = 51; // Número constante de cartas

	//gerador de número aleatório 
	private static final SecureRandom numerosAleatorio = new SecureRandom();

	//Construtor preenche baralho de cartas

	public DeckOfCards() {
		String[] faces = {"Ás","Dois","Três","Quatro","Cinco","Seis","Sete","Oito","Nove","Dez","Valete","Dama","Rei"};
		String[] suits = {"Copas","Ouros","Paus","Espadas" };
		deck = new Cartas[NUMBER_OF_CARDS];
		currentCard = 0; // a primeira carta distribuída será a carta deck[0]

		//preenche o baralho com objetos cartas
		for ( int count = 0 ; count < deck.length ; count++) {
			deck[count] = new Cartas(faces[count % 13], suits[count / 13]);
		}
	}

	//embarralha as cartas com algoritmo de um passagem
	public void shuffle() {

		// a próxima chamada para o método dealCard deve começar no deck[0]  novamente
		currentCard = 0;

		// para cada Carta, seleciona outra Carta Aleatória (0-51) e a compara
		for (int first = 0 ; first < deck.length ; first++) {
			//seleciona um número aleatório entre O e 51
			int second = numerosAleatorio.nextInt(NUMBER_OF_CARDS);

			//compara Carta atual com Carta aleatoriamente selecionada
			Cartas temp = deck[first];
			deck[first] = deck [second];
			deck[second] = temp;
		}
	}

	// Distribui uma Carta
	public Cartas dealCard() {
		// Determina se ainda a Cartas a serem distribuídas
		if (currentCard < deck.length) {
			return deck[currentCard++]; //retorna Carta atual no array
		} else {
			return null; //retorna nulo para indicar que todas as carta foram distribuídas
		}
	}

}
