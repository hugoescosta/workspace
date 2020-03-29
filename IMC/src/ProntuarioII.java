import java.io.IOException;
import java.math.*;
public class ProntuarioII {
	String nome;
	String dia, mes, ano; 
	double peso;
	double altura;
	double imc;
	
	public ProntuarioII (String nome, String ano, double peso, double altura){
		this.nome = nome;
		this.ano = ano;
		this.peso = peso;
		this.altura = altura;
		
	}
	
	public void calculaImcII(){
		imc = this.peso/(Math.pow(this.altura,2));
		if (imc < 18.5){
			System.out.println("Você está abaixo do peso ideal: " + imc);			
		} else if (imc >= 18.5 && imc < 25 ) {
			System.out.println("Você está no peso ideal: " + imc);
		} else if (imc >= 25 && imc < 30 ) {
			System.out.println("Você está com sobrepeso: " + imc);
		} else if (imc >= 30 && imc < 35 ) {
			System.out.println("Você está com Obsidade grau I: " + imc);
		} else if (imc >= 35 && imc < 40 ) {
			System.out.println("Você está com Obsidade grau II: " + imc);
		} else {
			System.out.println("Você está com Obsidade Mórbida: " + imc);
		}		
	}

}
