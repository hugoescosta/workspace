package br.com.abc.javacore.enumeracao.teste;
import br.com.abc.javacore.enumeracao.classes.Cliente;
import br.com.abc.javacore.enumeracao.classes.Cliente.TipoPagamento;
import br.com.abc.javacore.enumeracao.classes.TipoCliente;

public class ClenteTeste {
	public static void main(String[] args){
		Cliente cliente = new Cliente("Hugo Costa", TipoCliente.PESSOA_JURIDICA, TipoPagamento.APRAZO );
		
		System.out.println(TipoCliente.PESSOA_JURIDICA.getId());
		System.out.println(TipoCliente.PESSOA_FISICA.getId());
		System.out.println(cliente);
		
	}

}
