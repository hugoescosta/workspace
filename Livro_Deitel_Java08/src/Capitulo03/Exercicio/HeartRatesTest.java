package Capitulo03.Exercicio;

import javax.swing.JOptionPane;

public class HeartRatesTest {

	public static void main(String[] args) {
		String nome;
		String sobreNome;
		int dia;
		int mes;
		int ano;
		int idade;
		int fcm;
		int fca;
		
		
		nome = JOptionPane.showInputDialog(null, "Primeiro nome:", "Paciente", JOptionPane.PLAIN_MESSAGE);
		sobreNome = JOptionPane.showInputDialog(null, "Sobrenome Paciente:", "Paciente", JOptionPane.PLAIN_MESSAGE);
		dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Dia nascimento:","DIA"));
		mes = Integer.parseInt(JOptionPane.showInputDialog(null, "Mes nascimento:","MES"));
		ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Ano nascimento (4 digitos):","ANO"));


		
		
		HeartRates paciente1 = new HeartRates(nome, sobreNome, dia, mes, ano);
		paciente1.calculaIdade(2020);
		paciente1.calculaFreqCardMaxima();
		System.out.println("Dados do Paciente");
		System.out.println("Nome: "+paciente1.getNome()+" "+paciente1.getSobreNome());
		System.out.println("Idade: "+paciente1.getIdade());
		System.out.println("Freqeuência Cardíaca Máxima: "+paciente1.getFcm());

		

		
		
		

	}

}
