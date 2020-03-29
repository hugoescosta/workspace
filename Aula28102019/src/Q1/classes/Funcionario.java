package Q1.classes;

import javax.swing.JOptionPane;

public abstract class Funcionario {
	protected String nome;
	protected String clt;
	protected double salario;
	
	
	//Construtores
	
	public Funcionario(){
	}
	
	public Funcionario(String nome, String clt, double salario) {
		this.nome = nome;
		this.clt = clt;
		this.salario = salario;
	}
	
	//Métodos ABSTRATOSh
	//public abstract void calculaSalario();


	
	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", clt=" + clt + ", salario="
				+ salario + "]";
	}

	//Métodos GETTERS e SETTERS
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getClt() {
		return clt;
	}
	public void setClt(String clt) {
		this.clt = clt;
	}
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void calculaSalario() {
		// TODO Auto-generated method stub	
	}
	
	public void pedirDados(){
		nome = JOptionPane.showInputDialog("Nome funcionario:");
		clt = JOptionPane.showInputDialog("CLT funcionario:");
		salario = Double.parseDouble(JOptionPane.showInputDialog("Salario:"));
	}
	
}
