package Capitulo12;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Programa01 {
	
	JFrame f;
	//define o construtor da clase
	Programa01(){
		//instanciar frame f com tirulo
		f = new JFrame("Programa01");
		
		//criando os botoes
		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		JButton b3 = new JButton("3");
		JButton b4 = new JButton("4");
		JButton b5 = new JButton("5");
		
		//adicionar ao frame
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.setLayout(new FlowLayout(FlowLayout.LEFT));
		f.setSize(300,300);
		f.setVisible(true);
		f.setDefaultCloseOperation(3);
		//posicionamento dos botões no FlowLayout
	}
	
	public static void main(String[] args) {
		
		new Programa01();

	}

}
