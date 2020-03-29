package br.com.abc.javacore.blocodeinicializacao.classes;

public class Cliente {
	//1 - Alocado espa�o na mem�ria para o objeto que ser� criado
	//2 - cada atributo de classe � criado e inicializado com seus valores default ou valores expl�citos
	//3 - Bloco de inicializa��o � executado
	//4 - Construtor � executado
	
	private int[] parcelas;
	{
		parcelas = new int[100];
		System.out.println("Dentro do bloco de iniciali��o");
		for (int i=1; i <=100; i++) {
			parcelas[i-1] = i;
		}
	}

	
	public Cliente() {
	}
	
	public int[] getParcelas() {
		return parcelas;
	}

	public void setParcelas(int[] parcelas) {
		this.parcelas = parcelas;
	}
	

}
