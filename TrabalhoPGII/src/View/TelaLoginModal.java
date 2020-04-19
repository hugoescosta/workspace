package View;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Dialog.ModalityType;

public class TelaLoginModal extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtLogin;
	private JPasswordField txtSenha;
	
	private String login;
	private String senha;
	
	
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
		
		try {
			TelaLoginModal dialog = new TelaLoginModal();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	
	public TelaLoginModal() {
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setModalityType(ModalityType.DOCUMENT_MODAL);
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaLoginModal.class.getResource("/Images/logo_useme_02.png")));
		setTitle("Login");
		setBounds(100, 100, 381, 322);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setBounds(15, 13, 56, 16);
		contentPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Senha");
		lblNewLabel_1.setBounds(15, 81, 56, 16);
		contentPanel.add(lblNewLabel_1);
		
		txtLogin = new JTextField();
		txtLogin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtLogin.setBounds(15, 38, 116, 30);
		contentPanel.add(txtLogin);
		txtLogin.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(TelaLoginModal.class.getResource("/Images/usuarios.jpg")));
		lblNewLabel_2.setBounds(143, 66, 208, 161);
		contentPanel.add(lblNewLabel_2);
		
		txtSenha = new JPasswordField();
		txtSenha.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtSenha.setBounds(15, 108, 116, 30);
		contentPanel.add(txtSenha);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						
						if(checkLogin(txtLogin.getText(),new String (txtSenha.getPassword()))) {
							
							login = txtLogin.getText();
							senha = new String (txtSenha.getPassword());
							setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
							
						} else {
							JOptionPane.showMessageDialog(null,"Dados estão incorretos","Erro",JOptionPane.ERROR_MESSAGE);
						}
						
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
	
	public boolean checkLogin(String login, String senha) {
		return login.equals("maria") && senha.equals("senha");
	}

	public String getLogin() {
		return login;
	}

	public String getSenha() {
		return senha;
	}


}
