package br.com.abc.javacore.Strings.teste;

import javax.swing.JOptionPane;

public class StringBuilderTeste {

	public static void main(String[] args) {
		String s = "Uma frase comum";
		StringBuilder sb = new StringBuilder(10);
		sb.append("Mais uma frase comum");
		//sb.append(" outra uma frase comum");
		//JOptionPane.showMessageDialog(null, s);
		JOptionPane.showMessageDialog(null,sb);
		JOptionPane.showMessageDialog(null,sb.insert(5,"=-=-=-=-=-=-=-="));
		//JOptionPane.showMessageDialog(null,sb.reverse());
		JOptionPane.showMessageDialog(null,sb.delete(0,2));
		StringBuilder sb2 = new StringBuilder(10);
		sb2.append("def").insert(3, "ghi").reverse().delete(2,4);
		JOptionPane.showMessageDialog(null,sb);

	}

}
