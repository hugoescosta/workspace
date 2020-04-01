package Capitulo07;

public class GradeBookTest {

	public static void main(String[] args) {
		// array com as notas dos alunos
		int[] gradesArray = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
		
		GradeBook myGradeBook = new GradeBook("Curso de JAVA",gradesArray);
		
		System.out.printf("Bem vindos ao livro de notas do curso:%n%s%n%n",myGradeBook.getCourseName());
		myGradeBook.processGrades();
		

	}

}
