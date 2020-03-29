import java.util.Scanner;

public class Exercicio03 {


	public static void main(String[] args) {
		
		int num01, num02;
		int resultado = 0;
		
		String operador = "";
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		num01 = entrada.nextInt();
		System.out.println("Digite o segundo número: ");
		num02 = entrada.nextInt();
		System.out.println("Digite a operação desejada: ");
		operador = entrada.next();
		
		
		if (operador.equals("+") ){
			resultado = num01 + num02;
			System.out.println("A soma é:"+resultado);			
		}else if(operador.equals("-") ){
			resultado = num01 - num02;
			System.out.println("A subtração é:"+resultado); 
		}else if(operador.equals("*") ){
			resultado = num01 * num02;
			System.out.println("A multiplicação é:"+resultado);
		}else if(operador.equals("/") ){
			if(num02 <= 0){
				System.out.println("divisão por ZERO!!!");
			}
			resultado = num01 / num02;
			System.out.println("A divisão é:"+resultado);
		}else{
			System.out.println("Operador Inválido");
		}

	}

}
