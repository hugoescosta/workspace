package br.com.abc.javacore.introducaometodos.classes.teste;
import br.com.abc.javacore.introducaometodos.classes.Calculadora;

public class ParametrosTeste {
	public static void main(String[] args){
		Calculadora calc = new Calculadora();
		int x = 5;
		int y = 10;
		calc.alteraDoisNumeros(x, y);
		System.out.println("Dentro do teste");
		System.out.println("X:"+x);
		System.out.println("Y:"+y);
		
	}
	
}
