
import java.lang.Math;
import java.util.Scanner;

import javax.swing.JOptionPane;
public class Q2 {


	public static void main(String[] args) {
		
		int num = 0 , contador = 0;
		int numInicial = 1, numFinal = 100;
		int numAleatorio = 1 + (int)(Math.random() * 100);
		Scanner entrada = new Scanner(System.in);

		do{
			System.out.println("Digite um número de "  + numInicial +" a " + numFinal + " :");
			num = entrada.nextInt();
			//num = Integer.parseInt(JOptionPane.showInputDialog("teste"));
			
			contador ++;
			// Ficará dentro do construtor
			if (num == numAleatorio){
				if (contador > 1){
					System.out.println("Parabéns, você acertou em " + contador + " tentativas!!!");
				}else{
					System.out.println("Parabéns, você é crack hein, acertou em " + contador + "tentativa!!!");
				}
				System.out.println("Você digitou o numero:" + num);
				System.out.println("O número aleatório é:" + numAleatorio);
			}else{
				if(num > numInicial && num < numFinal){
					if(num < numAleatorio ){
							numInicial = num;
					}else{
						numFinal = num;
					}
				}else{
					System.out.println("Fora do intervalo de "+numInicial+" a "+numFinal);
				}
			}
			//fim construtor
		}while (num != numAleatorio);
	}
}



		
		
		



