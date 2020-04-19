package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class TelaCadastroUsuarioSDI extends JFrame {

	private JPanel contentPane;
	private JTextField txtCadUsuarioSDI;
	private JPasswordField passFieldSenhaSDI;
	private JPasswordField passwFieldConfirmaSenhaSDI;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroUsuarioSDI frame = new TelaCadastroUsuarioSDI();
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
	public TelaCadastroUsuarioSDI() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 637, 479);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usu\u00E1rio");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblUsuario.setBounds(89, 80, 56, 16);
		contentPane.add(lblUsuario);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSenha.setBounds(89, 143, 56, 16);
		contentPane.add(lblSenha);
		
		JLabel lblConfirmarSenha = new JLabel("Confirmar Senha");
		lblConfirmarSenha.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblConfirmarSenha.setBounds(89, 214, 128, 16);
		contentPane.add(lblConfirmarSenha);
		
		txtCadUsuarioSDI = new JTextField();
		txtCadUsuarioSDI.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtCadUsuarioSDI.setColumns(10);
		txtCadUsuarioSDI.setBounds(89, 99, 415, 31);
		contentPane.add(txtCadUsuarioSDI);
		
		passFieldSenhaSDI = new JPasswordField();
		passFieldSenhaSDI.setBounds(89, 161, 415, 29);
		contentPane.add(passFieldSenhaSDI);
		
		passwFieldConfirmaSenhaSDI = new JPasswordField();
		passwFieldConfirmaSenhaSDI.setBounds(89, 234, 415, 29);
		contentPane.add(passwFieldConfirmaSenhaSDI);
		
		JButton btnSalvarUsuarioSDI = new JButton("Salvar");
		btnSalvarUsuarioSDI.setBounds(407, 302, 97, 25);
		contentPane.add(btnSalvarUsuarioSDI);
	}
}
