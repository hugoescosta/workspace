package Capitulo04;

import javax.swing.JFrame;

public class DrawPanelTest {
	public static void main(String[] args) {
		
		// Cria o painel que contem o desenho
		DrawPanel panel = new DrawPanel();
		
		JFrame aplicacao = new JFrame();
		
		aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aplicacao.add(panel);
		aplicacao.setSize(500, 500);
		aplicacao.setVisible(true);
	}

}
