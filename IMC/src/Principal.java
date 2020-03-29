import java.util.Scanner;
import java.util.Date;
import java.awt.TextArea;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Principal {
	public static void main(String[] args) throws ParseException{
		
		double imc ;
		Prontuario p1 = new Prontuario();
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Nome do paciente: ");
		p1.nome = entrada.next();
		System.out.print("Data de Nascimento (dd-mm-aaaa):  ");
		p1.dataNascimento = entrada.next();

		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date dt = df.parse(p1.dataNascimento);
	
		
		System.out.print("Informe seu peso:" );
		p1.peso = entrada.nextDouble();
		System.out.print("Informe sua altura: ");
		p1.altura = entrada.nextDouble();
		
		
		p1.imprimirInformacaoPaciente();
		imc = p1.calculaImc();
		
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
