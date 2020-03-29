package br.com.abc.javacore.introducaometodos.classes.teste;

import br.com.abc.javacore.introducaometodos.classes.Professor;

public class ProfessorTeste {
	public static void main(String[] args){
		Professor prof = new Professor();
		prof.cpf = "693.139.703.68";
		prof.matricula = "258963";
		prof.nome = "Hugo Costa";
		prof.rg = "123456789";
		
		Professor prof2 = new Professor();
		prof2.cpf = "555.139.703.68";
		prof2.matricula = "99999";
		prof2.nome = "Eduardo Costa";
		prof2.rg = "987654321";

		prof.imprime();

		prof2.imprime();
	}
}
