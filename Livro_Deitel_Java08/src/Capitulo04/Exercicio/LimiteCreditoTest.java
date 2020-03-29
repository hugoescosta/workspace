package Capitulo04.Exercicio;

public class LimiteCreditoTest {

	public static void main(String[] args) {
		
		//(String nConta, int saldoInicial, int despesas, int credito, int limite)
		LimiteCredito conta = new LimiteCredito("1234",1000,800,1300);
		
		conta.setCredito();
		conta.Resultado();
		conta.Saldo();
	}

}
