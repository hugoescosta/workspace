package Capitulo07;

public class GradeBookTest719 {

	public static void main(String[] args) {
		
		
		int[][] gradesArray = 	{{87, 96, 70},
								{68, 87, 90},
								{94, 100, 90},
								{100, 81, 82},
								{83, 65, 85},
								{78, 87, 65},
								{85, 75, 83},
								{91, 94, 100},
								{76, 72, 84},
								{87, 93, 73}};
		
		GradeBook718 myGradesBook = new GradeBook718("Intrudução ao Curso de JAVA", gradesArray);
		
		System.out.printf("Bem vindos ao livro de notas %n%s%n%n",myGradesBook.getCourseName());
		myGradesBook.processGrades();
		
				
	}
}
