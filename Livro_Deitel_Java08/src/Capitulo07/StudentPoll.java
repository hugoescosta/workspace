package Capitulo07;

public class StudentPoll {

	public static void main(String[] args) {
		
		//array das respostas dos alunos (normalmente inseridos no ato da pesquisa)
		int[] responses = {  1, 1, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 14 };
		int[] frequencia = new int[6]; // array que armazena quantas vezes cada número de 1 a 5 se repetiu
		
		int tiraduvida;
		
		for (int answer = 0; answer < responses.length ; answer++) {
			try {
				//++frequencia[responses[answer]];
				frequencia[responses[answer]] = frequencia[responses[answer]] + 1;
				
			} catch   (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);  //chama o método toString
				System.out.printf("   reponses[%d] = %d%n%n", answer, responses[answer]);
			}
		}
		 System.out.printf("%s%10s%n", "Rating", "Frequency");
		 
		 // gera saída do valor de cada elemento do array
		 for (int rating = 1; rating < frequencia.length; rating++)
		 {
			 System.out.printf("%6d%10d%n", rating, frequencia[rating]);
		 }
	}

}
