package Capitulo03.Exercicio;

import javax.swing.JOptionPane;

public class DateTest {

	public static void main(String[] args) {
		Date datanascimento = new Date();	
		String nome = JOptionPane.showInputDialog(null, "Qual o seu nome? ","Hugo Costa");
		datanascimento.setDia(Integer.parseInt(JOptionPane.showInputDialog(null, "Dia nascimento:","DIA")));
		datanascimento.setMes(Integer.parseInt(JOptionPane.showInputDialog(null, "Mes nascimento:","MES")));
		datanascimento.setAno(Integer.parseInt(JOptionPane.showInputDialog(null, "Ano nascimento (4 digitos):","ANO")));
		//Mostra a data primeira vez
		datanascimento.displayDate1();
		//Mostra a data segunda vez
		datanascimento.displayDate2();
		//Mostra a data terceira vez
		JOptionPane.showMessageDialog(null,"Data: "+datanascimento.getDia()+"/"+datanascimento.getMes()+"/"+datanascimento.getAno(),"Data",JOptionPane.PLAIN_MESSAGE);	
	}
}
