
public class Conta {
	//
	String numero, agencia, nome;
	double saldo, limite;

	//void deposita(double valor) {
	String deposita(double valor) {
		saldo = saldo + valor;
		String msg = "Despósito Realizado com sucesso!!! Novo saldo:"+saldo;
		return msg;
	}
 
	void saca(double valor) {
		saldo = saldo - valor;
	}
	
	void transfere(Conta c, double valor ){
		if (saldo >=valor){
			//saca desta conta
			this.saca(valor);
			//deposita em outra conta
			c.deposita(valor);
			System.out.println("Transferência realizada com sucesso, valor da transferência "+valor);
		}else{
			System.out.println("Saldo Insuficiente");
		}
		
		
	}


}

