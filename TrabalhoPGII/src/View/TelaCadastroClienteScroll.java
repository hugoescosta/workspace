package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class TelaCadastroClienteScroll extends JFrame {
	
	JTextArea caixaDeText = new JTextArea();
	JScrollPane scrool = new JScrollPane(caixaDeText);
	
	public TelaCadastroClienteScroll() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500,300);
		setVisible(true);
		add(scrool);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroClienteScroll frame = new TelaCadastroClienteScroll();
					//frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
