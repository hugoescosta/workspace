package Q2.classes;

import javax.swing.JOptionPane;

public abstract class ContaBancaria {
	protected String cliente;
	protected int num_conta;
	protected float saldo;
	
	//construtores
	public ContaBancaria(){
	}
	
	public ContaBancaria(String cliente, int num_conta, float saldo) {
		this.cliente = cliente;
		this.num_conta = num_conta;
		this.saldo = saldo;
	}
	
	
	
	//Métodos GETTERS e SETTERS
	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public int getNum_conta() {
		return num_conta;
	}
	public void setNum_conta(int num_conta) {
		this.num_conta = num_conta;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	
	public void sacar(float valorSaque){
		
		if ((this.saldo - valorSaque) < 0){
			JOptionPane.showMessageDialog(null, "Saldo insuficiente, valor na conta: "+this.saldo, "Saldo Insuficiente!!!", JOptionPane.INFORMATION_MESSAGE);
			return; 
		}else{
			this.saldo = this.saldo - valorSaque;
			JOptionPane.showMessageDialog(null, "Saque no valor de "+valorSaque+"realizado com SUCESSO, saldo em conta: "+this.saldo, "Saldo Insuficiente!!!", JOptionPane.INFORMATION_MESSAGE);
		}
		return;
		
		
	}
	
	public void depositar(float valorDepositar){
		this.saldo = this.saldo + valorDepositar;
		JOptionPane.showMessageDialog(null, "Valor depositado com sucesso, saldo atual: "+this.saldo, "Saldo Atual!!!", JOptionPane.INFORMATION_MESSAGE);
		//return;
	}
	
	public void pedirDados(){
		cliente = JOptionPane.showInputDialog("Nome do Cliente: ");	
		num_conta = Integer.parseInt(JOptionPane.showInputDialog("Número da Conta: "));
		saldo = Float.parseFloat(JOptionPane.showInputDialog("Saldo: "));
	}
}
