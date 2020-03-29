package br.com.abc.javacore.enumeracao.classes;

public enum TipoCliente {
	//tudo os atributos declarado aqui, serão CONSTANTE
	//enumerações não podem ser criadas dentro de métodos
	
	//constant specific class body
	//Corpo de classe Constante Específico
	PESSOA_FISICA(1, "Pessoa Física"), PESSOA_JURIDICA(2, "Pessoa Jurídica"){
		public String getId(){
			return "B";
		}
	};
	
	private int tipoCliente;
	private String descricaoTipoCliente;
	private TipoCliente(int tipoCliente, String descricaoTipoCliente){
		this.tipoCliente = tipoCliente;
		this.descricaoTipoCliente = descricaoTipoCliente;
	}
	
	

	
	public String getId(){
		return "A";
		
	}
	
	public int getTipoCliente() {
		return tipoCliente;
	}
	public String getDescricaoTipoCliente() {
		return descricaoTipoCliente;
	}	 
}
