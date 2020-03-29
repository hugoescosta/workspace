import java.math.*;

public class Prontuario {
	String nome;
	String dataNascimento;
	double peso;
	double altura;
	
	public void imprimirInformacaoPaciente(){
		System.out.println("Nome do paciente: " + nome);
		System.out.println("Data de Nascimento: " + dataNascimento);
		System.out.println("Altura: " + altura);
		System.out.println("Peso: " + peso);
	}
	
	public double calculaImc(){
		double imc;
		imc = peso/(Math.pow(altura,2));
		return imc;
		
	}
}
