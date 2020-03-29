package Capitulo03.Exercicio;

import javax.swing.JOptionPane;

public class Employee {
	private String nome;
	private String sobreNome;
	private double salarioMensal;
	private double salarioAnual;
	
	
	
	//Construtor
	public Employee() {
	}
	
	public Employee(String nome, String sobreNome, double salarioMensal) {
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.salarioMensal = salarioMensal;
	}
	
	
	//Setters e Getters
	public String getNome() {
		return nome;
	}
	public String getSobreNome() {
		return sobreNome;
	}
	public double getSalarioMensal() {
		return salarioMensal;
	}
	public void setNome() {
		this.nome = JOptionPane.showInputDialog(null, "Primeiro nome do funcionário:", "Funcionario", JOptionPane.PLAIN_MESSAGE);
	}
	public void setSobreNome() {
		this.sobreNome = JOptionPane.showInputDialog(null, "Sobrenome do funcionário:", "Funcionario", JOptionPane.PLAIN_MESSAGE);
	}
	
	public void setSalarioMensal() {
		this.salarioMensal = Double.parseDouble(JOptionPane.showInputDialog(null, "Salário Mensal:",0));
		if ( salarioMensal > 0 ) {
			this.salarioMensal = salarioMensal;
		}
	}
	
	//Metodos
	
	public double calculaSalarioAnual() {
		double salAnual = this.salarioMensal * 12;
		return salAnual;
	}
	
	public void aumentoSalario(int percentual) {
		if ( percentual > 0) {
			this.salarioMensal = this.salarioMensal+((this.salarioMensal * percentual)/100); 
		}
		
	}

	public void imprimirSalarioAnual() {
		JOptionPane.showMessageDialog(null,"Funcionario: "+this.getNome()+" "+this.getSobreNome()+"\nSalario Mensal: "+this.getSalarioMensal()+"\n Salario Anual: "+this.calculaSalarioAnual());
	}

}
