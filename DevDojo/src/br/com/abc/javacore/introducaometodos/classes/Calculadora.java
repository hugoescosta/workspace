package br.com.abc.javacore.introducaometodos.classes;

public class Calculadora {
	public void somarDoisNumeros(){
		System.out.println("Soma: "+(8+8));
	}
	
	public static void subtraiDoisNumeros(){
		System.out.println("Subtrai:"+(8-5));
	}
		
	public static void multiplicaDoisnumeros(double x, int y){
		System.out.println("Multiplica: "+(x*y));
	}
	
	public static double divideDoisNumeros(int x, int y){
		// forçar o retorno de um número inteiro 
		if (y !=  0){
			// sermpre que um return é executado, ele retorna para classe que o chamou
			return x/y;
		}
		return 0;
	}
	
	public static void imprimeDoisNumerosDivididos(double x, double y){
		if (y != 0){
			System.out.println(x/y);
			return;
		}
		System.out.println("Não é possível divisão por ZERO");
	}
	
	public static void alteraDoisNumeros( int x, int y){
		x = 30;
		y = 40;
		System.out.println("Dentro do altera dois numeros");
		System.out.println("X:"+x);
		System.out.println("Y:"+y);
		
	}
	
	public static void somaArray(int[] numeros){
		int soma = 0;
		for(int num : numeros){
			soma += num;
		}
		System.out.println(soma);
	}
	
	//passagem de parâmetros do tipo VARARGS:  só pode existir apenas um valor por assinatura de método, ou serja, não posso fazer assim
	// public void somaVarArgs(int... numeros, String... texto)
	// você pode passar mais parâmetros, mas o VARARGS tem que ser o último, exemplo:
	// public void somaVarArgs(double valorDouble, int... numeros)
	public void somaVarArgs(double valorDouble, int... numeros){
		int soma = 0;
		for(int num : numeros){
			soma += num;
		}
		System.out.println(soma);		
	}
	

	
	
}
