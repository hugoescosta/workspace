package Capitulo05.Exercicio;

import java.util.Scanner;

public class CalculandoVendas {

	public static void main(String[] args) {
		int codProduto = 1;
		int qtdVendida = 0;
		double valorProduto;
		double total = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		while (codProduto >= 1 ) {
			System.out.println("Digite o código do produto:");
			codProduto = entrada.nextInt();
			if (codProduto > 0) {
				System.out.println("Quantidade:");
				qtdVendida = entrada.nextInt();
			}
			
			switch ( codProduto ) {
				case 1:
					valorProduto = 2.98;
					total =  total + (valorProduto*qtdVendida);
					break;
				case 2:
					valorProduto = 4.50;
					total = total + (valorProduto*qtdVendida);
					break;
				case 3:
					valorProduto = 9.98;
					total = total + (valorProduto*qtdVendida);
					break;
				case 4:
					valorProduto = 4.49;
					total = total + (valorProduto*qtdVendida);
					break;
				case 5:
					valorProduto = 6.87;
					total = total + (valorProduto*qtdVendida);
					break;
				default:
					System.out.println(codProduto > 5 ? "Produto não cadastrado" : "");
					System.out.println("");

			}
			System.out.println("");
			System.out.println("============================================");
			System.out.printf(codProduto < 0 ? "Venda FINALIZADA!!!%nValor a pagar: %.2f%n%n" : "Valor da venda parcial: %.2f%n%n",total);		
		}


	}

}
