package Capitulo07;

public class BarChart {
	public static void main(String[] args) {
		
		int [] array = { 0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1 };
		
		System.out.println("Gráfico das Notas:");
		
		// para cada elemento do array, gera uma saída do gráfico de barras
		for (int counter = 0; counter < array.length ; counter++) {
			//gera a sa�da do r�tulo de barra ("00-99:...,90-99,100")
			if (counter == 10) {
				System.out.printf("%5d: ",100);
			} else {
				System.out.printf("%02d-%02d: ", counter * 10, counter * 10 + 9);  // vai imprimir o eixo Y: 0 - 9 , 10 - 19 ...
			}
			
			//imprime a barra de asteriscos conforme o valor contido no índice, exemplo: 
			//no índice array[6] o valor é 2, seram impressos na horizontal, dois asteriscos
			for (int stars = 0; stars < array[counter]; stars++) {
				System.out.print("*");
			}
			if (array[counter] > 0){
				System.out.print(" "+array[counter]);
			}
			System.out.println("");
		}
		
	}

}
