package Capitulo04;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Analysis {

	public static void main(String[] args) {
		int aprovado = 0;
		int reprovado = 0;
		int contador = 1;
		Scanner entrada = new Scanner(System.in);
		
		while ( contador <= 10) {
			System.out.printf("Insira o resultado #%d (1=Aprovado - 2=Repovado): ",contador);
			int resultado = entrada.nextInt();
			
			if (resultado == 1) {
				aprovado = aprovado + 1;
			} else {
				reprovado = reprovado +1;
			}
			contador = contador + 1;
		}
		
		System.out.printf("Candidatos aprovados: %d%n",aprovado);
		System.out.printf("Candidatos reprovados: %d%n",reprovado);
		
		if ( aprovado >= 8) {
			JOptionPane.showMessageDialog(null, "Pague BÔNUS para os Professores!!!");
		} else {
			JOptionPane.showMessageDialog(null, "Professores precisam incentivar mais os candidatos.");
		}

	}

}
