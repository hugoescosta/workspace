package br.com.abc.javacore.enumeracao.classes;

public class Cliente {

	public enum TipoPagamento{
		//todos atributos declarado aqui, serão CONSTANTE
		//enumerações não podem ser criadas dentro de métodos
		AVISTA, APRAZO;
	}
	
	private String nome;
	private TipoCliente tipoCliente;
	private TipoPagamento tipoPagamento;
	
	
	//Construtor
	public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
		this.nome = nome;
		this.tipoCliente = tipoCliente;
		this.tipoPagamento = tipoPagamento;
	}	

	@Override
	public String toString() {
		return "Cliente [Nome: " + nome + ", Tipo Cliente: " + tipoCliente.getDescricaoTipoCliente() + ", Tipo Pagamento: "
				+ tipoPagamento + ", Número: " + tipoCliente.getTipoCliente() +"]";
	}


	//Métodos GETTERS e SETTERS
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public TipoCliente getTipo() {
		return tipoCliente;
	}
	public void setTipo(TipoCliente tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

	public TipoPagamento getTipoPagamento() {
		return tipoPagamento;
	}

	public void setTipoPagamento(TipoPagamento tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}
	
}
