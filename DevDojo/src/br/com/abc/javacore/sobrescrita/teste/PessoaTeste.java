package br.com.abc.javacore.sobrescrita.teste;
import br.com.abc.javacore.sobrescrita.classes.Pessoa;



public class PessoaTeste {
		public static void main(String[] args){
			Pessoa pessoa = new Pessoa();
			pessoa.setNome("Princesa Isabel");
			pessoa.setIdade(300);
			System.out.println(pessoa);
			
			Pessoa pessoa2 = new Pessoa();
			pessoa2.setNome("Dom Pedro 1");
			pessoa2.setIdade(200);
			System.out.println(pessoa2);
		
	}

}
