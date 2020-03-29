
import java.lang.Math;
import java.util.Scanner;
public class Questao02 {


	public static void main(String[] args) {
		
		int num = 0 , contador = 0;
		int numInicial = 1, numFinal = 100;
		int numAleatorio = 1 + (int)(Math.random() * 100);
		Scanner entrada = new Scanner(System.in);
		boolean v = true;
		while (v) {
			if (contador == 0){
				System.out.println("Digite um número entre 1 e 100: "+numAleatorio);
				num = entrada.nextInt();
				contador ++;
			}else{
				if (num == numAleatorio){
					System.out.println("Você digitou o numero:" + num);
					System.out.println("O número aleatório é:" + numAleatorio);
					System.out.println("Você acertou em :" + contador + " tentativa.");
					v = false;
				}else if(numAleatorio > num && numAleatorio <= 100){
					if (num <= numInicial){
						System.out.println("Número digitado menor que úmero inicial");
						
					}
					numInicial = num;
					System.out.println("Digite um número entre "  + numInicial +" e " + numFinal);
					num = entrada.nextInt();
					contador ++;
				}else{
					numFinal = num;
					System.out.println("Digite um número entre "+ numInicial +" e "  + numFinal);
					num = entrada.nextInt();
					contador ++;
				}
					
				
			}


		}
		
		
		


	}

}
