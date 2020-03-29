package br.com.abc.javacore.modificadorestatico.teste;

import br.com.abc.javacore.modificadorestatico.classes.Carros;

public class CarrosTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carros.setVelocidadeLimite(220);
		Carros c1 = new Carros("BMW",280);
		Carros c2 = new Carros("AUDI",275);
		Carros c3 = new Carros("Mercedes",290);
		
		c1.imprime();
		c2.imprime();
		c3.imprime();
		
		System.out.println("+++++++++++++++++++++++++++++++++++");
		
		
		c1.imprime();
		c2.imprime();
		c3.imprime();

	}

}
