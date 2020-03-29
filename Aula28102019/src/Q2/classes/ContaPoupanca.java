package Q2.classes;

import javax.swing.JOptionPane;

public class ContaPoupanca extends ContaBancaria{
	int dia_rendimento;

	
	//Contrutores
	public ContaPoupanca() {
	}
	
	public ContaPoupanca(String cliente, int num_conta, float saldo, int dia_rendimento) {
		super(cliente, num_conta, saldo);
		this.dia_rendimento = dia_rendimento;
	}



	//Getters e Setters
	public int getDia_rendimento() {
		return dia_rendimento;
	}
	public void setDia_rendimento(int dia_rendimento) {
		this.dia_rendimento = dia_rendimento;
	}
	
	
	
	
	
	//Métodos
	
	public void calcularNovoSaldo(){
		float taxaRendimento, saldoAtual;
		taxaRendimento = Float.parseFloat(JOptionPane.showInputDialog("Informe a tada de juros: "));
		saldoAtual = (this.getSaldo()*taxaRendimento)+this.getSaldo();
		this.setSaldo(saldoAtual);
		JOptionPane.showMessageDialog(null, this.getSaldo());
	}
	
	
	
	
	

}
