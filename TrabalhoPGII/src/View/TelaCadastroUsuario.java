package View;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class TelaCadastroUsuario extends JInternalFrame {
	private JTextField textField;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroUsuario frame = new TelaCadastroUsuario();
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
	public TelaCadastroUsuario() {
		setClosable(true);
		setBounds(100, 100, 626, 470);
		getContentPane().setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usu\u00E1rio");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblUsuario.setBounds(92, 131, 56, 16);
		getContentPane().add(lblUsuario);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSenha.setBounds(92, 194, 56, 16);
		getContentPane().add(lblSenha);
		
		JLabel lblConfirmarSenha = new JLabel("Confirmar Senha");
		lblConfirmarSenha.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblConfirmarSenha.setBounds(92, 265, 128, 16);
		getContentPane().add(lblConfirmarSenha);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setBounds(92, 150, 415, 31);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(92, 212, 415, 29);
		getContentPane().add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(92, 285, 415, 29);
		getContentPane().add(passwordField_1);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(410, 353, 97, 25);
		getContentPane().add(btnSalvar);

	}

}
