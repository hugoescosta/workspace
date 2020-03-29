package br.com.abc.javacore.polimorfismo.teste;

import br.com.abc.javacore.polimorfismo.classes.Funcionario;
import br.com.abc.javacore.polimorfismo.classes.RelatorioPagamento;
import br.com.abc.javacore.polimorfismo.classes.Vendedor;
import br.com.abc.javacore.polimorfismo.classes.Gerente;

public class PolimorfismoTeste {
	public static void main(String[] args){
		Gerente gerente = new Gerente("Hugo Costa",5000,2000);
		Vendedor vendedor = new Vendedor("Zete Costa", 2000,2000);
		RelatorioPagamento relatorio = new RelatorioPagamento();
		//relatorio.relatorioPagamentoGerente(gerente);
		//System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
		//relatorio.relatorioPagamentoVendedor(vendedor);

		relatorio.relatorioPagamentoGenerico(gerente);
		System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
		relatorio.relatorioPagamentoGenerico(vendedor);
		
		
		
	}

}
