package br.com.abc.javacore.modificadorestatico.teste;

import br.com.abc.javacore.modificadorestatico.classes.Cliente;

public class ClienteTeste {

	public static void main(String[] args) {
		Cliente c = new Cliente();
		Cliente c1 = new Cliente();
		Cliente c2 = new Cliente();
		System.out.println("Exibir Quantidades de Parcelas");
		//for (int parcela : c.getParcelas()){
		//	System.out.print(parcela + " ");
		//}
		System.out.println("Tamanho:"+Cliente.getParcelas().length);
	}

}
