package View;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.text.MaskFormatter;

public class TelaCadastroClientes {

	private JFrame frmCadastroDeClientes;
	private JTextField txtCadCliNome;
	private JTextField textField_2;

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
					TelaCadastroClientes window = new TelaCadastroClientes();
					window.frmCadastroDeClientes.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaCadastroClientes() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		frmCadastroDeClientes = new JFrame();
		frmCadastroDeClientes.setIconImage(Toolkit.getDefaultToolkit().getImage(TelaCadastroClientes.class.getResource("/Images/logo_useme_02.png")));
		frmCadastroDeClientes.setTitle("Cadastro de Clientes");
		frmCadastroDeClientes.setBounds(100, 100, 957, 592);
		frmCadastroDeClientes.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmCadastroDeClientes.getContentPane().setLayout(null);
		
		JPanel panelCadCliDadosPessoais = new JPanel();
		panelCadCliDadosPessoais.setBorder(new TitledBorder(null, "Dados Pessoais", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelCadCliDadosPessoais.setBounds(12, 24, 915, 169);
		frmCadastroDeClientes.getContentPane().add(panelCadCliDadosPessoais);
		panelCadCliDadosPessoais.setLayout(null);
		
		txtCadCliNome = new JTextField();
		txtCadCliNome.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtCadCliNome.setBounds(12, 44, 610, 30);
		panelCadCliDadosPessoais.add(txtCadCliNome);
		txtCadCliNome.setColumns(10);
		
		JFormattedTextField txtCadCliDataNasc = new JFormattedTextField();
		txtCadCliDataNasc.setToolTipText("Ex.: 06/01/1974");
		txtCadCliDataNasc.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtCadCliDataNasc.setBounds(656, 44, 141, 30);
		panelCadCliDadosPessoais.add(txtCadCliDataNasc);
		formatarCampoDN(txtCadCliDataNasc);
		
		JFormattedTextField formTextFieldCadCliCPF = new JFormattedTextField();
		formTextFieldCadCliCPF.setToolTipText("123.456.789-00");
		formTextFieldCadCliCPF.setFont(new Font("Tahoma", Font.PLAIN, 15));
		formTextFieldCadCliCPF.setBounds(12, 108, 254, 30);
		panelCadCliDadosPessoais.add(formTextFieldCadCliCPF);
		formatarCampoCPF(formTextFieldCadCliCPF);
		
		JComboBox comboBoxCadCliSexo = new JComboBox();
		comboBoxCadCliSexo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBoxCadCliSexo.setModel(new DefaultComboBoxModel(new String[] {"Selecione:", "Masculino", "Feminino"}));
		comboBoxCadCliSexo.setBounds(299, 108, 175, 30);
		panelCadCliDadosPessoais.add(comboBoxCadCliSexo);
		
		JLabel lblTelaCadSexo = new JLabel("Sexo");
		lblTelaCadSexo.setBounds(299, 90, 56, 16);
		panelCadCliDadosPessoais.add(lblTelaCadSexo);
		
		JLabel lblTelaCadNome = new JLabel("Nome");
		lblTelaCadNome.setBounds(12, 23, 56, 16);
		panelCadCliDadosPessoais.add(lblTelaCadNome);
		
		JLabel lblTelaCadDataNasc = new JLabel("Data Nascimento");
		lblTelaCadDataNasc.setBounds(656, 23, 111, 16);
		panelCadCliDadosPessoais.add(lblTelaCadDataNasc);
		
		JLabel lblTelaCadCPF = new JLabel("CPF");
		lblTelaCadCPF.setBounds(12, 90, 56, 16);
		panelCadCliDadosPessoais.add(lblTelaCadCPF);
		
		JPanel panelCadCliContato = new JPanel();
		panelCadCliContato.setBorder(new TitledBorder(null, "Contatos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelCadCliContato.setBounds(12, 222, 915, 269);
		frmCadastroDeClientes.getContentPane().add(panelCadCliContato);
		panelCadCliContato.setLayout(null);
		
		JLabel lblCadCliTelefone = new JLabel("Telefone");
		lblCadCliTelefone.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCadCliTelefone.setBounds(12, 39, 91, 16);
		panelCadCliContato.add(lblCadCliTelefone);
		
		JLabel lblCadCliCelular = new JLabel("Celular");
		lblCadCliCelular.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCadCliCelular.setBounds(12, 111, 91, 16);
		panelCadCliContato.add(lblCadCliCelular);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_2.setColumns(10);
		textField_2.setBounds(12, 213, 533, 30);
		panelCadCliContato.add(textField_2);
		
		JLabel lblCadCliEmail = new JLabel("Email");
		lblCadCliEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCadCliEmail.setBounds(12, 192, 91, 16);
		panelCadCliContato.add(lblCadCliEmail);
		
		JFormattedTextField formTextFieldCadCliTelefone = new JFormattedTextField();
		formTextFieldCadCliTelefone.setFont(new Font("Tahoma", Font.PLAIN, 15));
		formTextFieldCadCliTelefone.setBounds(12, 56, 254, 30);
		panelCadCliContato.add(formTextFieldCadCliTelefone);
		formatarCampoTel(formTextFieldCadCliTelefone);
		
		JFormattedTextField formTextFieldCadCliCelular = new JFormattedTextField();
		formTextFieldCadCliCelular.setFont(new Font("Tahoma", Font.PLAIN, 15));
		formTextFieldCadCliCelular.setBounds(12, 129, 254, 30);
		panelCadCliContato.add(formTextFieldCadCliCelular);
		formatarCampoCel(formTextFieldCadCliCelular);
		
		JButton btnCadCliSalvar = new JButton("Salvar");
		btnCadCliSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null,
						"Nome: " + txtCadCliNome.getText() + 
						"Data Nascimento: " + txtCadCliDataNasc.getText() 
						);
			}
		});
		btnCadCliSalvar.setBounds(830, 504, 97, 25);
		frmCadastroDeClientes.getContentPane().add(btnCadCliSalvar);
		
	}
	
	//Metódo para formatar campos
	private void formatarCampoDN( JFormattedTextField txtCadCliDataNasc){
		try {
			MaskFormatter mask = new MaskFormatter("##/##/####");
			mask.install(txtCadCliDataNasc);
		} catch (ParseException e) {
			JOptionPane.showMessageDialog(null,"Erro ao formatar campo de texto","Erro!!!",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	private void formatarCampoCPF( JFormattedTextField txtCadCliCPF){
		try {
			MaskFormatter mask = new MaskFormatter("###.###.###-##");
			mask.install(txtCadCliCPF);
		} catch (ParseException e) {
			JOptionPane.showMessageDialog(null,"Erro ao formatar campo de texto","Erro!!!",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	private void formatarCampoTel( JFormattedTextField txtCadCliTelefone){
		try {
			MaskFormatter mask = new MaskFormatter("(##) ####-####");
			mask.install(txtCadCliTelefone);
		} catch (ParseException e) {
			JOptionPane.showMessageDialog(null,"Erro ao formatar campo de texto","Erro!!!",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	private void formatarCampoCel( JFormattedTextField txtCadCliCelular){
		try {
			MaskFormatter mask = new MaskFormatter("(##) #####-####");
			mask.install(txtCadCliCelular);
		} catch (ParseException e) {
			JOptionPane.showMessageDialog(null,"Erro ao formatar campo de texto","Erro!!!",JOptionPane.ERROR_MESSAGE);
		}
	}
}
