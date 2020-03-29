package Capitulo04;

public class StudentTeste {

	public static void main(String[] args) {
			
		Student estudante1 = new Student("Hugo Costa", 50.3);
		Student estudante2 = new Student("Caio Costa", 100.0);
		
		System.out.printf("%s está com a letra %s na grade curricular, por tanto está ",estudante1.getName(),estudante1.getLetterGrade());
		System.out.println(estudante1.getLetterGrade() == "F" ? "Reprovado.\nNão fique desaminado, estude mais que ná próxima dará certo.\n" : "Aprovado, PARABÉNS!!!" );
		System.out.printf("%s está com a letra %s na grade curricular, por tanto está ",estudante2.getName(),estudante2.getLetterGrade());
		System.out.println(estudante2.getLetterGrade() == "F" ? "Reprovado.\nNão fique desaminado, estude mais que ná próxima dará certo.\n" : "Aprovado, PARABÉNS!!!" );
	}

}
