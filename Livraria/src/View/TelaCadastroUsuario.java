package View;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class TelaCadastroUsuario extends JInternalFrame {
	private JTextField txtUsuario;
	private JPasswordField passFieldSenha;
	private JPasswordField passFieldConfirmaSenha;

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
		setTitle("Cadastro de Usu\u00E1rio");
		setFrameIcon(new ImageIcon(TelaCadastroUsuario.class.getResource("/Images/logo_useme_02.png")));
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
		
		txtUsuario = new JTextField();
		txtUsuario.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtUsuario.setBounds(92, 150, 415, 31);
		getContentPane().add(txtUsuario);
		txtUsuario.setColumns(10);
		
		passFieldSenha = new JPasswordField();
		passFieldSenha.setBounds(92, 212, 415, 29);
		getContentPane().add(passFieldSenha);
		
		passFieldConfirmaSenha = new JPasswordField();
		passFieldConfirmaSenha.setBounds(92, 285, 415, 29);
		getContentPane().add(passFieldConfirmaSenha);
		
		JButton btnSalvarUsuario = new JButton("Salvar");
		btnSalvarUsuario.setBounds(410, 353, 97, 25);
		getContentPane().add(btnSalvarUsuario);

	}

}
