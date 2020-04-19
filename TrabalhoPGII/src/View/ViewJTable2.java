package View;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.JScrollBar;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.ComponentOrientation;

public class ViewJTable2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtDescricao;
	private JTextField txtQuantidade;
	private JTextField txtPreco;
	private JTable jtProdutos;
	private JPanel panel;

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
					ViewJTable2 frame = new ViewJTable2();
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
	public ViewJTable2() {
		

		
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(ViewJTable2.class.getResource("/Images/logo_useme_02.png")));
		setTitle("Lan\u00E7amentos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1033, 588);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		
		
		panel = new JPanel();
		panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(0, 33, 995, 204);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Descri\u00E7\u00E3o");
		lblNewLabel.setBounds(46, 30, 88, 16);
		panel.add(lblNewLabel);
		
		JLabel lblQuantidade = new JLabel("Quantidade");
		lblQuantidade.setBounds(485, 30, 88, 16);
		panel.add(lblQuantidade);
		
		JLabel lblNewLabel_1_1 = new JLabel("Pre\u00E7o");
		lblNewLabel_1_1.setBounds(711, 30, 88, 16);
		panel.add(lblNewLabel_1_1);
		
		txtDescricao = new JTextField();
		txtDescricao.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtDescricao.setBounds(46, 48, 366, 30);
		panel.add(txtDescricao);
		txtDescricao.setColumns(10);
		
		txtQuantidade = new JTextField();
		txtQuantidade.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtQuantidade.setColumns(10);
		txtQuantidade.setBounds(485, 48, 158, 30);
		panel.add(txtQuantidade);
		
		txtPreco = new JTextField();
		txtPreco.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtPreco.setColumns(10);
		txtPreco.setBounds(711, 48, 211, 30);
		panel.add(txtPreco);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				DefaultTableModel dtmProdutos = (DefaultTableModel) jtProdutos.getModel();
				Object[] dados = { txtDescricao.getText(), txtQuantidade.getText(), txtPreco.getText()};
				//System.out.println(txtDescricao);
				dtmProdutos.addRow(dados);
				
			}
		});
		btnCadastrar.setBounds(46, 147, 97, 25);
		panel.add(btnCadastrar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				if (jtProdutos.getSelectedRow() >= 0) {
					DefaultTableModel dtmProdutos = (DefaultTableModel) jtProdutos.getModel();
					Object[] dados = { txtDescricao.getText(), txtQuantidade.getText(), txtPreco.getText()};
					int linha = jtProdutos.getSelectedRow();
					int resp = JOptionPane.showConfirmDialog(null ,"Deseja excluir o registro?");
					if (resp == 1) {
						JOptionPane.showMessageDialog(null, "Nenhum registro excluído", "Alerta",JOptionPane.WARNING_MESSAGE);
					} else {
						dtmProdutos.removeRow(jtProdutos.getSelectedRow());
					}
					//jtProdutos.getSelectedRows()
				} else {
					JOptionPane.showMessageDialog(null, "Nenhum registro selecionado", "Alerta",JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		btnExcluir.setBounds(199, 147, 97, 25);
		panel.add(btnExcluir);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//alterar
				if (jtProdutos.getSelectedRow() != -1) {
					
					jtProdutos.setValueAt(txtDescricao.getText(), jtProdutos.getSelectedRow(), 0);
					jtProdutos.setValueAt(txtQuantidade.getText(), jtProdutos.getSelectedRow(), 1);
					jtProdutos.setValueAt(txtPreco.getText(), jtProdutos.getSelectedRow(), 2);
					
				}
			}
		});
		btnAlterar.setBounds(359, 147, 97, 25);
		panel.add(btnAlterar);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 247, 995, 279);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
	 

		
		
		jtProdutos = new JTable();
		jtProdutos.getTableHeader();
		jtProdutos.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		jtProdutos.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		jtProdutos.setAutoCreateRowSorter(true);
		jtProdutos.setName("Hugo");
		
		jtProdutos.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				if (arg0.getKeyCode() == KeyEvent.VK_ENTER) {  //se pressionar enter seleciona a linha
					
					txtDescricao.setText(jtProdutos.getValueAt(jtProdutos.getSelectedRow(),0).toString());
					txtQuantidade.setText(jtProdutos.getValueAt(jtProdutos.getSelectedRow(),1).toString());
					txtPreco.setText(jtProdutos.getValueAt(jtProdutos.getSelectedRow(),2).toString());
					
				}
			}
		});
		jtProdutos.addMouseListener(new MouseAdapter() { //se clicar o mouse seleciona a linha
			@Override
			public void mouseClicked(MouseEvent arg0) {
			
				if (jtProdutos.getSelectedRow() != -1) {
					
					//txtDescricao.setText((String) jtProdutos.getValueAt(jtProdutos.getSelectedRow(),0)); //assim
					// ou
					//assim: txtDescricao.setText(jtProdutos.getValueAt(jtProdutos.getSelectedRow(),0).toString());
					 txtDescricao.setText(jtProdutos.getValueAt(jtProdutos.getSelectedRow(),0).toString());
					txtQuantidade.setText(jtProdutos.getValueAt(jtProdutos.getSelectedRow(),1).toString());
					txtPreco.setText(jtProdutos.getValueAt(jtProdutos.getSelectedRow(),2).toString());
					
				}
				
			
			}
		});
		//Não permite o JTABLE ediatar os dados diretamente na tabela...
		jtProdutos.setDefaultEditor(Object.class, null);
		jtProdutos.getDragEnabled();
		
		jtProdutos.setSurrendersFocusOnKeystroke(true);
		jtProdutos.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		jtProdutos.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Descrição", "Quantidade", "Preço"
			}
		));
		jtProdutos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		jtProdutos.setBounds(12, 28, 971, 238);
		panel_1.add(jtProdutos);
		
		JLabel lblNewLabel_1 = new JLabel("Descri\u00E7ao");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(24, 5, 113, 16);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Quantidade");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_2.setBounds(353, 5, 113, 16);
		panel_1.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Pre\u00E7o");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_2_1.setBounds(672, 5, 113, 16);
		panel_1.add(lblNewLabel_1_2_1);
	}
}
