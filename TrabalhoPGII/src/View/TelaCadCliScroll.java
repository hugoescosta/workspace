package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Component;
import javax.swing.JLabel;

public class TelaCadCliScroll extends JFrame {
	
	JTextArea caixaDeText = new JTextArea();
	JScrollPane scrool = new JScrollPane(caixaDeText);
	
	
	public TelaCadCliScroll() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500,300);
		setVisible(true);
		add(scrool);
	
	}
	
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadCliScroll frame = new TelaCadCliScroll();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
