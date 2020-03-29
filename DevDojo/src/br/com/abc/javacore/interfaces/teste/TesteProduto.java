package br.com.abc.javacore.interfaces.teste;

import br.com.abc.javacore.interfaces.classes.Produto;

public class TesteProduto {
	public static void main(String[] args){
		Produto produto = new Produto("Notebook",4,3000);
		produto.calculaImposto();
		produto.calculaFrete();
		produto.toString();
		System.out.println(produto);
		
		
	}
}
