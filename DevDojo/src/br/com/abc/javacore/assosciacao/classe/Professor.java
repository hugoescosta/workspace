package br.com.abc.javacore.assosciacao.classe;

public class Professor {
	private Seminario[] seminarios;
	private String nome;
	private String especialidade;
	
	
	//Construtores
	public Professor(String nome, String especialidade) {
		this.nome = nome;
		this.especialidade = especialidade;
	}
	
	public Professor() {;
	}
	
	//Métodos
	
	public void print(){
		System.out.println("=-=-=-=-=-=-=-=-=-=..: Relatório de Professores :..=-=-=-=-=-=-=-=-=-=");
		System.out.println("Nome Professor: "+this.nome);
		System.out.println("Especialidade"+this.especialidade);
		System.out.println("Seminarios Participantes:");
		if (seminarios != null && seminarios.length != 0 ){
			for(Seminario semi : seminarios){
				System.out.println(semi.getTitulo());
			}
		} else {
			System.out.println("Professor não tem nenhum seminário cadastrado");
		}
	}
	
	//Métodos Getters e Setters

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public Seminario[] getSeminarios() {
		return seminarios;
	}

	public void setSeminarios(Seminario[] seminarios) {
		this.seminarios = seminarios;
	}
	
	
}
