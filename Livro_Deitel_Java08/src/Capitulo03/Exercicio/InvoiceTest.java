package Capitulo03.Exercicio;

import javax.swing.JOptionPane;

public class InvoiceTest {

	public static void main(String[] args) {

		String numero = JOptionPane.showInputDialog("Digite o numero da nota:");
		String descricao = JOptionPane.showInputDialog("Descriçao do produto");
		int qtd = Integer.parseInt(JOptionPane.showInputDialog("Quantos você vai levar?"));
		double precoItem = Double.parseDouble(JOptionPane.showInputDialog("Qual o preco do produto?"));
		
		Invoice fatura = new Invoice(numero, descricao, qtd, precoItem);
		
		fatura.getInvoiceAmount(qtd, precoItem);
		
		JOptionPane.showMessageDialog(null,"Produto " + fatura.getDescricao() + " custa " + fatura.getPrecoItem() + "\nQuantidade: " + fatura.getQtd() + "\nTotal da sua nota: " + fatura.getTotalNota()+"\n ", "Nota no.: "+fatura.getNumero(),JOptionPane.PLAIN_MESSAGE);
		
		
	}

}
