package br.com.abc.javacore.modificadorestatico.classes;

public class Cliente {
	//1 - Bloco de inicialização estático é executado quando a jvm carregar a classe, é excutado apenas uma vez
	//2 - Alocado espa�o na mem�ria para o objeto que ser� criado
	//3 - cada atributo de classe � criado e inicializado com seus valores default ou valores expl�citos
	//4 - Bloco de inicializa��o � executado
	//5 - Construtor � executado
	
	private static int[] parcelas;
	static {
		parcelas = new int[100];
		System.out.println("Dentro do bloco de iniciali��o estatico 1");
		for (int i=1; i <=100; i++) {
			parcelas[i-1] = i;
		}
	}
	
	public Cliente() {
	}
	
	public static int[] getParcelas() {
		return parcelas;
	}


}
