
public class Principal {

	public static void main(String[] args) {
		Conta c1 = new Conta();
		c1.nome = "Conta Corrente";
		c1.agencia = "2005-3";
		c1.limite = 300.00;
		c1.saldo = 500.00;
		c1.numero = "31056-9";
		
		Conta c2 = new Conta();
		c2.nome = "Conta Universitária";
		c2.agencia = "1005-6";
		c2.limite = 100.00;
		c2.saldo = 100.00;
		c2.numero = "21600-5";
		
		System.out.println("O saldo é:"+c1.saldo);
		//c1.deposita(1000.00);
		String status = c1.deposita(1000.00);
		System.out.println(status);
		//System.out.println("O saldo atual é:"+c1.saldo);
		//c1.saca(400.00);
		//System.out.println("O saldo após a retirada é:"+c1.saldo);
		
		System.out.println("Saldo da conta 2: "+c2.saldo);
		c1.transfere(c2, 200);
		System.out.println("Saldo da conta 2: "+c2.saldo);
		System.out.println("Saldo da conta 1: "+c1.saldo);
		
		
		
	}

}
