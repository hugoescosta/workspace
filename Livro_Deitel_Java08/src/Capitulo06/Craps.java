package Capitulo06;

import java.security.SecureRandom;

public class Craps { 
	
	//cria um gerador seguro de números aleatórios para uso no método rollDice
	private static final SecureRandom randomNumbers = new SecureRandom();
	
	// tipo enum com constantes que representam o estado do jogo
	private enum Status { CONTINUE, WON, LOST };
	
	//constantes que representam lançamentos comuns dos dados
	private static final int SNAKE_EYES = 2; // Se a soma dos dados for 2 perde
	private static final int TREY = 3; // Se a soma dos dados for 3 perde
	private static final int SEVEN = 7; // Se a soma dos dados for 7 ganha
	private static final int YO_LEVEN = 11; // Se a soma dos dados for 11 ganha
	private static final int BOX_CARS = 12; // // Se a soma dos dados for 12 perde
	
	// joga uma partida de craps
	public static void main(String[] args) {
		
		int myPoint = 0; // pontos se não ganhar ou perder na primeira rodada
		Status gameStatus; // pode conter CONTINUE, WON, LOST
		
		int sumOfDice = rollDice(); // primeira rolagem de dados
		
		switch ( sumOfDice ) {
			case SEVEN: //ganha com 7 no primeiro lançamento
			case YO_LEVEN: //ganha com 11 no primeiro lançamento
				gameStatus = Status.WON;
				break;
			case SNAKE_EYES: //perde com 2 pontos no primeiro lance
			case TREY: // perde com 3 lances no primeiro lance
			case BOX_CARS: // perde com 12 pontos no primeiro lance
				gameStatus =  Status.LOST;
				break;
			default: //não ganhou nem perdeu, portanto registra a pontuação
				gameStatus = Status.CONTINUE;
				myPoint = sumOfDice; //informa a pontuação
				System.out.printf("Sua pontuação é: %d%n", myPoint);
				break;
		}
		
		// enquanto o jogo não estiver completo
		
		while (gameStatus == Status.CONTINUE) { //lança os dados novamente
			sumOfDice = rollDice(); // lança os dados novamente
			
			if (sumOfDice == myPoint) { //Vitória por pontuação
				gameStatus = Status.WON;				
			} else {
				if (sumOfDice == SEVEN) { // Perde obtendo 7 antes de atingir a pontuação
					gameStatus = Status.LOST;
				}
			}
		}
		
		//exibe uma mensagem: GANHOU ou PERDEU!!
		if (gameStatus == Status.WON) {
			System.out.println("Jogador GANHOU!!!");
		} else {
			System.out.println("A Mesa GANHOU!!!");
		}
		
	}
	
	public static int rollDice() {
		
		//seleciona valores aleatório do dado
		
		int die1 = 1 + randomNumbers.nextInt(6);
		int die2 = 1 + randomNumbers.nextInt(6);
		
		int sum = die1 + die2; //soma os valores dos dados jogados
		
		//exibe os resultados desse lançamento
		System.out.printf("Jogador rolou os dados %d + %d = %d%n", die1, die2, sum);
		
		return sum;
	}

} // fim da classe CRAPS
