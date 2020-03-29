package estacio.pgii.data02032020;

public class Aluno {
	int matricula;
	String nome, cidade;
	public Aluno(int matricula, String nome, String cidade) {
		this.matricula = matricula;
		this.nome = nome;
		this.cidade = cidade;
	}
	public String toString() {
		return this.matricula + " " + this.nome + " " + this.cidade;
	}

	


}
