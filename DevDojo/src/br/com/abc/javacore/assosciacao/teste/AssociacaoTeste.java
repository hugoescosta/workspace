package br.com.abc.javacore.assosciacao.teste;

import br.com.abc.javacore.assosciacao.classe.*;

public class AssociacaoTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aluno aluno = new Aluno("Hugo Costa",27);
		Aluno aluno2 = new Aluno("Caio Costa",14);
		Seminario seminario = new Seminario("Redes Convergentes");
		Professor professor = new Professor("Yoda","Usar a força para desenvolver códigos de categoria Jedy");
		Local local = new Local("Rua das Flores","Bairro Paraíso");
		
		aluno.setSeminario(seminario);
		aluno2.setSeminario(seminario);
		aluno.print();
		//seminario.setProfessor(professor);
		//seminario.setLocal(local);
		//seminario.setAlunos(new Aluno[] {aluno,aluno2});
		
		Seminario[] seminarioArray = new Seminario[1];
		seminarioArray[0] = seminario;
		professor.setSeminarios(seminarioArray);
		
		
		seminario.print();
		professor.print();
		aluno.print();
		
		
		
		
	}

}
