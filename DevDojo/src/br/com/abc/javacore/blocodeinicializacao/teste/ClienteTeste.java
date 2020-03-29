package br.com.abc.javacore.blocodeinicializacao.teste;

import br.com.abc.javacore.blocodeinicializacao.classes.Cliente;

public class ClienteTeste {

	public static void main(String[] args) {
		Cliente c = new Cliente();
		System.out.println("Exibir Quantidades de Parcelas");
		for (int parcela : c.getParcelas()){
			System.out.print(parcela + " ");
		}

	}

}
