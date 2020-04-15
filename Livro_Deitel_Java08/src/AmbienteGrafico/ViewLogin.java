package AmbienteGrafico;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewLogin {

	private JFrame frame;
	private JTextField tfLogin;
	private JLabel lblSenha;
	private JPasswordField pfSenha;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		// Cores do NETBEANS
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
			System.err.println(ex);
		}
		// Fim Cores NETBEANS
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewLogin window = new ViewLogin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ViewLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 537, 464);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblLogin.setBounds(92, 95, 77, 30);
		frame.getContentPane().add(lblLogin);
		
		tfLogin = new JTextField();
		tfLogin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		tfLogin.setBounds(92, 130, 299, 30);
		frame.getContentPane().add(tfLogin);
		tfLogin.setColumns(10);
		
		lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSenha.setBounds(92, 173, 56, 16);
		frame.getContentPane().add(lblSenha);
		
		pfSenha = new JPasswordField();
		pfSenha.setEchoChar('@');
		pfSenha.setBounds(92, 196, 144, 30);
		frame.getContentPane().add(pfSenha);
		
		btnNewButton = new JButton("Entrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if (checkLogin(tfLogin.getText(),new String(pfSenha.getPassword()))) {
					
					JOptionPane.showMessageDialog(null, "Seja Bem vindo ao Sistema");
					
				}else {
						
					JOptionPane.showMessageDialog(null, "Acesso NEGADO!!!","Acesso NEGADO!!!",JOptionPane.ERROR_MESSAGE);
					
				}
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(209, 261, 97, 43);
		frame.getContentPane().add(btnNewButton);
	}
	
	public boolean checkLogin(String login, String senha) {
		return login.equals("usuario") && senha.equals("senha");
	}
}
