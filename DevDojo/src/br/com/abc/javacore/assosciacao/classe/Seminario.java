package br.com.abc.javacore.assosciacao.classe;

public class Seminario {
	private Aluno[] alunos;
	private Professor professor;
	private Local local;
	private String titulo;
	
	
	//Construtores
	public Seminario(String titulo) {
		this.titulo = titulo;
	}
	public Seminario() {
	}
	//Metodos
	
	public void print(){
		System.out.println("=-=-=-=-=-=-=-=-=-=..: Relatório de Seminarios :..=-=-=-=-=-=-=-=-=-=");
		System.out.println("Título: "+this.titulo);
		
		
		if (this.professor != null){
			System.out.println("Professor palestrante: "+this.professor.getNome());
		}else{
			System.out.println("Não temos nenhum professor cadastrado nesse seminrio");
		}
		
		if (this.local != null){
			System.out.println("Local: "+this.local.getRua()+"Bairro: "+this.local.getBairro());
		}else{
			System.out.println("Não temos um local definido para este seminário");
		}
		if ( this.alunos != null && this.alunos.length != 0 ){
			System.out.println("Alunos participantes:");
			for(Aluno aluno : alunos){
				System.out.println(""+aluno.getNome());
			}
		} else {
			System.out.println("Não existem alunos cadastrado nesse semário");
		}
	}
	
	
	//Métodos Getters e Setters
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Aluno[] getAlunos() {
		return alunos;
	}
	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public Local getLocal() {
		return local;
	}
	public void setLocal(Local local) {
		this.local = local;
	}
}
