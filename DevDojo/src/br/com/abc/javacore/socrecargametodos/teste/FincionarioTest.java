package br.com.abc.javacore.socrecargametodos.teste;
import br.com.abc.javacore.socrecargametodos.classes.Funcionario;

public class FincionarioTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario funcionario = new Funcionario("Chida da Silva", "693-139-703-68", 4598.00,"123456789");
		//funcionario.init("Chida da Silva", "693-139-703-68", 4598.00,"123456789"); 
		Funcionario funcionario2 = new Funcionario();
		funcionario.imprime();
		funcionario2.imprime();

	}

}
