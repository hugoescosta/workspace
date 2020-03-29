package br.com.abc.javacore.introducaometodos.classes.teste;
import br.com.abc.javacore.introducaometodos.classes.*;

public class CalculadoraTeste {
	public static void main(String[] args){
		Calculadora calc = new Calculadora();
		calc.somarDoisNumeros();
		calc.subtraiDoisNumeros();
		calc.multiplicaDoisnumeros(4d, 80);
		calc.divideDoisNumeros(80, 5);
		double resultado = calc.divideDoisNumeros(80, 0);
		calc.imprimeDoisNumerosDivididos(70, 0);
		System.out.println(resultado);
		
		int[] numeros = new int[]{1,2,3,4,5};
		// ou int[] numeros = {1,2,3,4,5}
		
		calc.somaArray(numeros);
		calc.somaVarArgs(1,2,3,4,5,6,7,8,9);
		
		
	}

}
