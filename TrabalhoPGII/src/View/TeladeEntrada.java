package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class TeladeEntrada extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TeladeEntrada frame = new TeladeEntrada();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TeladeEntrada() {
		setBounds(100, 100, 789, 489);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				TelaLoginModal tlm = new TelaLoginModal();
				tlm.setVisible(true);
				tlm.getLogin();
				
				JLabel lblBemVindo = new JLabel();
				lblBemVindo.setBounds(243, 74, 259, 86);
				getContentPane().add(lblBemVindo);
				lblBemVindo.setText(tlm.getLogin()+tlm.getSenha());
				
				
			}
		});
		btnLogin.setBounds(183, 233, 385, 99);
		getContentPane().add(btnLogin);
		
		JLabel lblBemVindo = new JLabel();
		lblBemVindo.setBounds(243, 74, 259, 86);
		getContentPane().add(lblBemVindo);
		

	}
}
