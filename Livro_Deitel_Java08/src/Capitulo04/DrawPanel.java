package Capitulo04;

import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawPanel extends JPanel {
	
	//desenha um X a partid dos cantos do PAINEL
	public void paintComponent(Graphics g) {
		
		// chama paintComponent para assegurar que o oainel é exibido corretamente
		super.paintComponent(g);
		
		int largura = getWidth(); // largura total
		int altura = getHeight(); // altura total
		
		// desenha uma linha do canto superior esquerdo até o inferior direito
		g.drawLine(0, 0, largura , altura);
		
		//desenha uma linha do canto inferior esquerdo até o superior direito
		g.drawLine(0, altura, largura, 0);
	}

} //Fim da Classe DRAWPANEL
