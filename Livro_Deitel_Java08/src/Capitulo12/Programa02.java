package Capitulo12;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Programa02 {
	
	JFrame f;
	
	Programa02(){
		f = new JFrame("Programa02");
		JButton b1 = new JButton("H");
		JButton b2 = new JButton("2");
		JButton b3 = new JButton("3");
		JButton b4 = new JButton("4");
		JButton b5 = new JButton("5");
		JButton b6 = new JButton("6");
		JButton b7 = new JButton("7");
		JButton b8 = new JButton("8");
		JButton b9 = new JButton("9");
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);
		f.add(b8);
		f.add(b9);
		f.setLayout(new GridLayout(3,3));
		
		f.setSize(300,300);
		f.setVisible(true);
		f.setDefaultCloseOperation(3);
		

	}

	public static void main(String[] args) {
		
		new Programa02();
	}

}
