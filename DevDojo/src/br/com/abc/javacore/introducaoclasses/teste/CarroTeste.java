package br.com.abc.javacore.introducaoclasses.teste;
import br.com.abc.javacore.introducaoclasses.classes.Carro;
public class CarroTeste {

	public static void main(String[] args) {
		Carro carro = new Carro();
		carro.modelo = "Fusca";
		carro.placa = "QWJ-1025";
		carro.velocidadeMaxima = 120f;
		System.out.println(carro.modelo);
		System.out.println(carro.placa);
		System.out.println(carro.velocidadeMaxima);
		
		

	}

}
