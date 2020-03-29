package br.com.abc.javacore.introducaometodos.classes.teste;
import br.com.abc.javacore.introducaometodos.classes.*;

public class EstudanteTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Estudante aluno = new Estudante();
		aluno.setNome("Hugo Costa");
		aluno.setIdade(45);
		aluno.setNotas(new double[]{4,3,9.8});
		aluno.imprimeNotas();
		aluno.tirarMedia();
		System.out.println(aluno.getNome());
		System.out.println(aluno.getIdade());
		System.out.println(aluno.isAprovado());
		
	}

}