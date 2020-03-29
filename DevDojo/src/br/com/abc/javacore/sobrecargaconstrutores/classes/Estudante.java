package br.com.abc.javacore.sobrecargaconstrutores.classes;

public class Estudante {
	private String matricula;
	private String nome;
	private double[] notas;
	private String dataMatricula;
	
	public Estudante(String matricula, String nome, double[] notas) {
		this.matricula = matricula;
		this.nome = nome;
		this.notas = notas;	
	}
	
	public Estudante(String matricula, String nome, double[] notas, String dataMatricula) {
		this(nome,matricula,notas);  // chamando outro construtor, nesse caso o construtor Estudante com os demais parâmetros
		this.dataMatricula = dataMatricula;
	}
	
	public Estudante() {
		System.out.println("Construtor DEFAULT!!!");
		
	}
	
	public void imprime() {
		System.out.println(this.nome);
		System.out.println(this.matricula);
		for (double nota : notas) {
			System.out.println(nota + " ");
		}
		System.out.println(this.dataMatricula);
		
	}
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}
	
	
}
