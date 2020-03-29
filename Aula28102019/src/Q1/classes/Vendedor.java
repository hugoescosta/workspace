package Q1.classes;

public class Vendedor extends Funcionario {
	private double totalVendas;

	public Vendedor() {
	}

	public Vendedor(String nome, String clt, double salario) {
		super(nome, clt, salario);
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public void calculaSalario(){
		this.salario = salario + (salario * 0.1);
	}
/*
	public double getTotalVendas() {
		return totalVendas;
	}

	public void setTotalVendas(double totalVendas) {
		this.totalVendas = totalVendas;
	}*/
	
	
	
}
