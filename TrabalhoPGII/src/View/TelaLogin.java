package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class TelaLogin {

	private JFrame frmLogin;
	private JTextField txtLogin;
	private JPasswordField pF;

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
					TelaLogin window = new TelaLogin();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.setIconImage(Toolkit.getDefaultToolkit().getImage(TelaLogin.class.getResource("/Images/logo_useme_02.png")));
		frmLogin.setResizable(false);
		frmLogin.setTitle("UsemeModa");
		frmLogin.setBounds(100, 100, 615, 414);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);
		//Centraliza o JFrame no centro da tela
		frmLogin.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 609, 379);
		frmLogin.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLogin.setBounds(115, 155, 98, 25);
		panel.add(lblLogin);
		
		txtLogin = new JTextField();
		txtLogin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtLogin.setBounds(115, 183, 357, 29);
		panel.add(txtLogin);
		txtLogin.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSenha.setBounds(115, 227, 56, 16);
		panel.add(lblSenha);
		
		pF = new JPasswordField();
		pF.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pF.setBounds(115, 256, 357, 29);
		panel.add(pF);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (checkLogin(txtLogin.getText(),new String (pF.getPassword()))) {
					JOptionPane.showMessageDialog(null, "Seja Bem Vindo ao Sistema","Login",JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "Acesso NEGADO!!!","Login",JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		btnEntrar.setBounds(375, 298, 97, 25);
		panel.add(btnEntrar);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TelaLogin.class.getResource("/Images/logo_useme_02.png")));
		lblNewLabel.setBounds(236, 23, 125, 118);
		panel.add(lblNewLabel);
	}
	
	public boolean checkLogin(String login, String senha) {
		return login.equals("usuario") && senha.equals("senha");
	}
}
