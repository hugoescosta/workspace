package Capitulo05;

import java.util.Scanner;

public class LetterGrades {

	public static void main(String[] args) {
		int total = 0; //soma todoas as notas inseridas
		int gradeCounter = 0; //número de notas inseridas
		int aCount = 0; //conta as noras A
		int bCount = 0; //conta as noras B
		int cCount = 0; //conta as noras C
		int dCount = 0; //conta as noras D
		int eCount = 0; //conta as noras E
		int fCount = 0; //conta as noras F
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.printf("%s%n  %s%n  %s%n",
				"Insira um valor inteiro na grade no intervalo de 1 a 100.",
				"Pressione Ctrl + z + enter (Windows) para encerrar",
				"Pressione Ctrl + d + enter (UNIX/Linux) para encerra");
		
		// o loop será executado até pressionar Ctrl + z + enter (Windows) ou Ctrl + d + enter (Linux)
		
		while (entrada.hasNext()) {
			int grade = entrada.nextInt(); //lé a nota
			total += grade; // total = total + grade
			++gradeCounter; // incrementa mais um no contador
			
			// incrementa o contador de notas adequadamente
			switch (grade / 10) {
				case 9: // a nota está entre 90
				case 10: // e 100, inclusivo
					++aCount;
					break; // sai do switch
				case 8: // 80 a 89
					++bCount;
					break; // sai do switch
				case 7: // 70 a 79
					++cCount;
					break; // sai do switch
				case 6: // 60 a 69
					++dCount;
					break; // sai do switch
				default: // notas menores que 60
					++fCount;
					break; // sai do switch
			} // fim do switch
		} // fim do while
		
		// exibe o relatório das notas
		System.out.printf("%nRelatório das Notas%n");
		
		if (gradeCounter != 0) {
			
			//Calcula a média de todas as notas inseridas
			double media = (double) total / gradeCounter;
			
			//Resumo dos resultados
			System.out.printf("Total da %d notas inseridas: %d%n", gradeCounter,total);
			System.out.printf("Média da classe: %.2f%n",media);
			System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n",
					"Quantidade de estudantes que receberam cada nota:",
					 "A: ", aCount,
					 "B: ", bCount,
					 "C: ", cCount,
					 "D: ", dCount,
					 "F: ", fCount);			
		} //fim do if
		else
		{
			System.out.println("Nenhuma nota foi inserida");
		} // fim else
	} // fim main
} // finaliza a class lettergrades
