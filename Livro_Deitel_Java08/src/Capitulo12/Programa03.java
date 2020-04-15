package Capitulo12;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Programa03 {
	
	JFrame f;
	
	//Construtor
	Programa03() {
		f = new JFrame("Programa 03");
		JButton b1 = new JButton("Norte");
		JButton b2 = new JButton("Sul");
		JButton b3 = new JButton("Leste");
		JButton b4 = new JButton("Oeste");
		JButton b5 = new JButton("Center");
		
		f.add(b1, BorderLayout.NORTH);
		f.add(b2, BorderLayout.SOUTH);
		f.add(b3, BorderLayout.EAST);
		f.add(b4, BorderLayout.WEST);
		f.add(b5, BorderLayout.CENTER);
		
		f.setSize(300,300);
		f.setVisible(true);
		f.setDefaultCloseOperation(3);
		
	}
	
	public static void main(String[] args) {
	
		new Programa03();

	}



}
