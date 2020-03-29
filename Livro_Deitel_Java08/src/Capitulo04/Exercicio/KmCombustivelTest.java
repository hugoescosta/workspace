package Capitulo04.Exercicio;

import java.util.Scanner;

public class KmCombustivelTest {

	public static void main(String[] args) {
		int kmDirigido;
		int ltrGasolinaConsumido;
		
		KmCombustivel consumo = new KmCombustivel();
		Scanner entrada = new Scanner(System.in);
		System.out.println("Km Dirigidos? ");
		kmDirigido = entrada.nextInt();
		System.out.println("Qtd de gasolina consumido");
		ltrGasolinaConsumido = entrada.nextInt();
		
		while (kmDirigido >= 0 || ltrGasolinaConsumido >= 0) {

			
			consumo.setKmDirigido(kmDirigido);
			consumo.setLtrGasolinaConsumido(ltrGasolinaConsumido);
			consumo.calclularConsumo();
			consumo.imprimeConsumoPorLitro();
			
			
			System.out.println("Km Dirigidos? ");
			kmDirigido = entrada.nextInt();
			System.out.println("Qtd de gasolina consumido");
			ltrGasolinaConsumido = entrada.nextInt();
		}

		

	}

}
