package Capitulo04.Exercicio.Q419;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ComissaoVendas {

	public static void main(String[] args) {
		
		
		String nome = JOptionPane.showInputDialog(null, "Nome do vendedor");
		double salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Salário do Vendedor"));
		int item =1 ;
		
		Vendedor vendedor1 = new Vendedor(nome,salario);
		Item produto1 = new Item("1", 239.99);
		Item produto2 = new Item("2", 129.75);
		Item produto3 = new Item("3", 99.95);
		Item produto4 = new Item("4", 350.89);
		
		while ( item > 0 ) {
			item = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o codigo do item?"));
			if ( item >=1 && item<=4 ) {
				int qtd = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade"));
				if (item == 1) {
					vendedor1.vender(item, 239.99, qtd);
				} else if (item == 2) {
					vendedor1.vender(item,129.75, qtd);
				} else if (item == 3) {
					vendedor1.vender(item,99.95, qtd);
				} else {
					vendedor1.vender(item,350.89, qtd);
				}
			} else {
				JOptionPane.showMessageDialog(null, "Produto inválido", "ERRO!!!",  JOptionPane.PLAIN_MESSAGE);
			}
		}
		vendedor1.calculaSalario();
		JOptionPane.showMessageDialog(null, "Vendedor: "+vendedor1.getNome()+"\nSalário: "+vendedor1.getSalario(), "Demonstrativo",  JOptionPane.PLAIN_MESSAGE);
		System.out.println(vendedor1.getSalario());
		

	}

}
