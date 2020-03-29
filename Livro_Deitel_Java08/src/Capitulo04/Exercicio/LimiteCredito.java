package Capitulo04.Exercicio;

import javax.swing.JOptionPane;

public class LimiteCredito {
	
	private String nConta;
	private int saldoInicial;
	private int despesas;
	private int limite;
	private int credito; // saldoInicial + limite
	
	public LimiteCredito(String nConta, int saldoInicial, int limite, int despesas) {
		this.nConta = nConta;
		this.saldoInicial = saldoInicial;
		this.despesas = despesas;
		this.limite = limite;
	}
	
	//Getters e Setters
	



	public String getnConta() {
		return nConta;
	}
	public int getSaldoInicial() {
		return saldoInicial;
	}
	public int getDespesas() {
		return despesas;
	}
	public int getCredito() {
		return credito;
	}
	public int getLimite() {
		return limite;
	}
	public void setnConta(String nConta) {
		this.nConta = nConta;
	}
	public void setSaldoInicial(int saldoInicial) {
		this.saldoInicial = saldoInicial;
	}
	public void setDespesas(int despesas) {
		this.despesas = despesas;
	}
	public void setCredito() {
		this.credito = this.saldoInicial + this.limite;
	}
	public void setLimite(int limite) {
		this.limite = this.limite;
	}
	
	
	//Métodos
	
	
	public void Saldo() {
		if (this.credito > 0) {
			this.credito = this.credito - this.despesas;
			System.out.printf("Saldo atual após suas compra mensais %.2f%n%n",(double)this.credito);
		} else {
			JOptionPane.showMessageDialog(null, "Conta NEGATIVA: "+(double)this.credito);
		}
	}
	
	public void Resultado() {
		System.out.println();
		System.out.printf("Sua conta nº %s\n\n",this.nConta);
		System.out.printf("Seu saldo inicial era de %.2f\n\n",(double)this.saldoInicial );
		System.out.printf("Seu limite é %.2f\n\n",(double)this.limite );
		System.out.printf("Seu credito é (saldo+limite) %.2f\n\n",(double)this.credito);
		System.out.printf("Sua despesa para esse mês foi de %.2f\n\n",(double)this.despesas);
		}
	

}
