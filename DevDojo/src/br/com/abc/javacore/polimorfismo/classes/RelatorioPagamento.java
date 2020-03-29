package br.com.abc.javacore.polimorfismo.classes;

public class RelatorioPagamento {
	
	/*public void relatorioPagamentoGerente(Gerente gerente){
		System.out.println("Gerando relatório de pagamento para Gerência");
		gerente.calcularPagamento();
		System.out.println("Nome: "+gerente.getNome());
		System.out.println("Salario desse mês: "+gerente.getSalario());
		
	}*/
	
	/*public void relatorioPagamentoVendedor(Vendedor vendedor){
		System.out.println("Gerando relatório de pagamento para Vendedor");
		vendedor.calcularPagamento();
		System.out.println("Nome: "+vendedor.getNome());
		System.out.println("Salario desse mês: "+vendedor.getSalario());
		
	}*/
	
	public void relatorioPagamentoGenerico(Funcionario funcionario){
		System.out.println("Gerando relatório de pagamento");
		funcionario.calcularPagamento();
		System.out.println("Nome: " + funcionario.getNome());
		System.out.println("Salario desse mês: " + funcionario.getSalario());
		if(funcionario instanceof Gerente){
			Gerente gerente = (Gerente) funcionario; // fazendo um casting para objeto GERENTE    //Pode ser feito
			System.out.println("Participação nos Lucros: " + gerente.getPnl());                   //assim em duas linhas ou ***
		}
		if(funcionario instanceof Vendedor){
			System.out.println("Total de vendas: " + ((Vendedor) funcionario).getTotalVendas()); // *** Somente com uma linha
		}
		
	}
}
