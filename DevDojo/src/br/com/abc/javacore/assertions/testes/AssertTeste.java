package br.com.abc.javacore.assertions.testes;
//assert só foi introduzido no JAVA a partir da versão 1.4 
public class AssertTeste {
	public static void main(String[] args){
		calculaSalario(1000);
		calcSalario(-1000);
		
	}
	
	private static void calculaSalario(double salario){
		// em boas práticas, usar assert apenas em métodos PRIVADOS
		assert (salario > 0): "Salário não deve ser MENOR que ZERO!!! "+salario;
		//calculo salario
		
		//dia da semana
		diasDaSemana(8);
		
	}
	public static void calcSalario(double salario){
		if(salario < 0){
			throw new IllegalArgumentException();
		}
	}
	
	public static void diasDaSemana(int dia){
		switch (dia){
		case 1:break;
		case 2:break;
		case 3:break;
		case 4:break;
		case 5:break;
		case 6:break;
		case 7:break;
		default: assert false: "Dia Inválido";
		}
	}
}
