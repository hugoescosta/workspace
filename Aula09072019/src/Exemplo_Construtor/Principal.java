package Exemplo_Construtor;

public class Principal {
	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.imprimeInformacoes();
		
		Pessoa p1 = new Pessoa("João","Ana");
		p1.imprimeInformacoes();
		
		Pessoa p2 = new Pessoa("João","Ana","Pedro");
		p2.imprimeInformacoes();
		
		Pessoa p3 = new Pessoa("João","Ana","Pedro",22);
		p3.imprimeInformacoes();
	}

}
