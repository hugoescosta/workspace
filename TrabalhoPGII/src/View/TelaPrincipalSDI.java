package View;

import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JDesktopPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;

public class TelaPrincipalSDI {

	private JFrame frmUsememoda;
	private JMenu mnSobre;

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
					TelaPrincipalSDI window = new TelaPrincipalSDI();
					window.frmUsememoda.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaPrincipalSDI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmUsememoda = new JFrame();
		frmUsememoda.setTitle("UsemeModa");
		frmUsememoda.setIconImage(Toolkit.getDefaultToolkit().getImage(TelaPrincipalSDI.class.getResource("/Images/logo_useme_02.png")));
		frmUsememoda.setBounds(100, 100, 1017, 766);
		frmUsememoda.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmUsememoda.setLocationRelativeTo(null);
		
		JMenuBar menuBar = new JMenuBar();
		frmUsememoda.setJMenuBar(menuBar);
		
		JMenu mnArquivo = new JMenu("Arquivo");
		mnArquivo.setIcon(new ImageIcon(TelaPrincipalSDI.class.getResource("/Images/page.png")));
		menuBar.add(mnArquivo);
		
		JMenuItem mntmSair = new JMenuItem("Sair");
		mntmSair.setIcon(new ImageIcon(TelaPrincipalSDI.class.getResource("/Images/door_in.png")));
		mnArquivo.add(mntmSair);
		
		JMenu mnUsuarios = new JMenu("Usu\u00E1rios");
		mnUsuarios.setIcon(new ImageIcon(TelaPrincipalSDI.class.getResource("/Images/user.png")));
		menuBar.add(mnUsuarios);
		
		JMenuItem mntmUsuCadastrar = new JMenuItem("Cadastrar");
		mntmUsuCadastrar.addActionListener(new ActionListener() {
			@SuppressWarnings("null")
			public void actionPerformed(ActionEvent arg0) {
				

				
				new TelaCadastroUsuarioSDI().setVisible(true);
				
				
				
			}
		});
		mntmUsuCadastrar.setIcon(new ImageIcon(TelaPrincipalSDI.class.getResource("/Images/user_add.png")));
		mnUsuarios.add(mntmUsuCadastrar);
		
		JMenuItem mntmUsuAlterar = new JMenuItem("Alterar");
		mntmUsuAlterar.setIcon(new ImageIcon(TelaPrincipalSDI.class.getResource("/Images/user_edit.png")));
		mnUsuarios.add(mntmUsuAlterar);
		
		JMenuItem mntmUsuExcluir = new JMenuItem("Excluir");
		mntmUsuExcluir.setIcon(new ImageIcon(TelaPrincipalSDI.class.getResource("/Images/user_delete.png")));
		mnUsuarios.add(mntmUsuExcluir);
		
		JMenuItem mntmUsuPesquisar = new JMenuItem("Pesquisar");
		mntmUsuPesquisar.setIcon(new ImageIcon(TelaPrincipalSDI.class.getResource("/Images/zoom.png")));
		mnUsuarios.add(mntmUsuPesquisar);
		
		JMenu mnAlterar = new JMenu("Clientes");
		mnAlterar.setIcon(new ImageIcon(TelaPrincipalSDI.class.getResource("/Images/group.png")));
		menuBar.add(mnAlterar);
		
		JMenuItem mntmCliCadastrar = new JMenuItem("Cadastrar");
		mntmCliCadastrar.setIcon(new ImageIcon(TelaPrincipalSDI.class.getResource("/Images/group_add.png")));
		mnAlterar.add(mntmCliCadastrar);
		
		JMenuItem mntmCliAlterar = new JMenuItem("Alterar");
		mntmCliAlterar.setIcon(new ImageIcon(TelaPrincipalSDI.class.getResource("/Images/group_edit.png")));
		mnAlterar.add(mntmCliAlterar);
		
		JMenuItem mntmCliExcluir = new JMenuItem("Excluir");
		mntmCliExcluir.setIcon(new ImageIcon(TelaPrincipalSDI.class.getResource("/Images/group_delete.png")));
		mnAlterar.add(mntmCliExcluir);
		
		JMenuItem mntmCliPesquisar = new JMenuItem("Pesquisar");
		mntmCliPesquisar.setIcon(new ImageIcon(TelaPrincipalSDI.class.getResource("/Images/zoom.png")));
		mnAlterar.add(mntmCliPesquisar);
		
		mnSobre = new JMenu("Sobre");
		mnSobre.setIcon(new ImageIcon(TelaPrincipalSDI.class.getResource("/Images/information.png")));
		menuBar.add(mnSobre);
		

	}

}
