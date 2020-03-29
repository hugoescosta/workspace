package estacio.pgii.data02032020;

import java.util.ArrayList;
import java.util.Collections;

public class TestaAluno {

	public static void main(String[] args) {
		ArrayList<Aluno> alu = new ArrayList<Aluno>();
		alu.add(new Aluno(1172,"Benedito","Milagres"));
		alu.add(new Aluno(1171,"Carlos","Aracati"));
		alu.add(new Aluno(1173,"Hamilton","Pacatuba"));
		alu.add(new Aluno(1170,"Sonia","Fortaleza"));
		System.out.println("Lista não ordenada");
		for(int i = 0; i < alu.size(); i++) {
			System.out.println(alu.get(i));
		}
		Collections.sort(alu, new InterfaceOrdena());
		System.out.println("\nLista ordenada por matricula do aluno em ordem crescente");
		for(int i = 0; i < alu.size(); i++) {
			System.out.println(alu.get(i));
		}
	}

}
