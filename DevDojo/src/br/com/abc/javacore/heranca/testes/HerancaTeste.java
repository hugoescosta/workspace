package br.com.abc.javacore.heranca.testes;
import br.com.abc.javacore.heranca.classes.Pessoa;
import br.com.abc.javacore.heranca.classes.Funcionario;
import br.com.abc.javacore.heranca.classes.Endereco;

public class HerancaTeste {

	public static void main(String[] args) {
		//-Pessoa pessoa = new Pessoa("Zete Costa");
		Endereco endereco = new Endereco();
		//pessoa.setNome("Zete Costa");
		//-pessoa.setCpf("555633033-58");
		endereco.setRua("Avenida José Leon, 1415");
		endereco.setBairro("Cidade dos Funcionários");
		//-pessoa.setEndereco(endereco);
		//pessoa.imprime();
		
		System.out.println("=+=+=+=+=+=+=+=+=+=..: FUNCIONARIO :..=+=+=+=+=+=+=+=+=+=");
		
		Funcionario funcionario = new Funcionario("Hugo Costa");
		Endereco funcEndereco = new Endereco();
		//funcionario.setNome("Hugo Costa");
		funcionario.setCpf("693139703-68");
		funcionario.setSalario(8500.00);
		funcEndereco.setRua("Rua Avenida Jośe Leon, 1415141514151415");
		funcEndereco.setBairro("Jardim das Oliveiras");
		funcionario.setEndereco(funcEndereco);
		//funcionario.imprime();
		
		

	}

}
