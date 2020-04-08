package Capitulo07;

import javax.swing.JOptionPane;

public class InitArray721 {

	public static void main(String[] args) {
		// Verifica se o número de argumentos é igua a 3
		if ( args.length != 3 ) {
			int parametros = args.length;
			JOptionPane.showMessageDialog(null, "ERROR: Por favor execute o comando novamente, você digitou "+parametros+" parametros");
			System.out.println("ERROR: Por favor execute o comando novamente, você digitou "+parametros+" parametros");
		} else {
			// obtem o tamanho do array a partir do primeiro argumento de linha de comando
			int arrayLength = Integer.parseInt(args[0]);
			int[] array = new int[arrayLength];
			
			// obtém o valor inicial e o incrementa a partir dos argumentos de linha de comando
			int initialValue = Integer.parseInt(args[1]);
			int increment = Integer.parseInt(args[2]);
			
			//caclula o valor de cada elemento do array
			for (int counter = 0; counter < array.length; counter++) {
				array[counter] = initialValue + increment * counter; 
			}
			
			System.out.printf("%s%8s%n", "Index", "Value");
			
			// exibe o valor e o índice de array
			for (int counter = 0; counter < array.length; counter++) {
				System.out.printf("%5d%8d%n", counter, array[counter]);
			}
			
		}
	}

}
