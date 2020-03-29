package Q2.classes;

import javax.swing.JOptionPane;

public class ContaEspecial extends ContaBancaria{
	float limite;
	
	
	//Construtores
	public ContaEspecial() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ContaEspecial(String cliente, int num_conta, float saldo) {
		super(cliente, num_conta, saldo);
		// TODO Auto-generated constructor stub
	}
	
	
	
	//Getters e Setters
	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}

	//Métodos
	public void sacar(float valorSaque){
	
		
		if (((this.saldo - valorSaque) < 0) && ((limite - valorSaque) < 0)){
			JOptionPane.showMessageDialog(null, "Saldo insuficiente:\nSaldo na conta: "+this.saldo+"\nSaldo Limite: "+limite, "Saldo Insuficiente!!!", JOptionPane.INFORMATION_MESSAGE);
			return; 
		} else if ((this.saldo - valorSaque) < 0) {
			limite = limite - valorSaque;
			JOptionPane.showMessageDialog(null, "Saque no valor de "+valorSaque+" realizado com SUCESSO\n, do seu limite \nLimite atual "+this.limite, "SAQUE", JOptionPane.INFORMATION_MESSAGE);
			return;
		}else{
			this.saldo = this.saldo - valorSaque;
			JOptionPane.showMessageDialog(null, "Saque no valor de "+valorSaque+" realizado com SUCESSO\n, da sua conta \nSaldo atual "+this.saldo + "\nLimite atual "+this.limite, "SAQUE", JOptionPane.INFORMATION_MESSAGE);
			return;
		}
	}

}
