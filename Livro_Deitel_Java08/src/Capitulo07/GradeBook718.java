package Capitulo07;

public class GradeBook718 {

	private String courseName; // nome do curso que este livro de notas representa
	private int[][] grades; // array bidimensional de notas do aluno


	//construtor de dois argumentos inicializa coursename e array de notas (grades)
	public GradeBook718(String courseName, int[][] grades) {
		this.courseName = courseName;
		this.grades = grades;
	}

	//Getters e Setters
	public String getCourseName() {
		return courseName;
	}


	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public void processGrades() {

		//gera saída de array de notas
		outputGrades();
		
		//chama métodos getMinimum() e getMaximum()
		System.out.printf("%n%s %d","Nota mais baixa: ", getMinimum());
		System.out.printf("%n%s %d%n%n","Nota mais alta: ", getMaximum());
		//Gera a saída grafico de barras
		outputBarChart();
	}

	//localiza menor nota

	public int getMinimum() {

		//suponto que a menor nota está no indice [0][0]
		int lowGrade = grades[0][0];

		// faz um loop pelas linhas do array de notas
		for ( int[] studentsGrades : grades ) {
			// faz um loop pelas colunas da linha atual
			for ( int grade : studentsGrades) {
				if ( grade < lowGrade) { 
					lowGrade = grade;
				}
			}
		}
		return lowGrade;
	}

	public int getMaximum() {

		//supondo que a maior nota está no indice [0][0]
		int highGrade = grades[0][0];

		// faz um loop pelas linhas do array de notas
		for ( int[] studentsGrades : grades ) {
			// faz um loop pelas colunas da linha atual
			for ( int grade : studentsGrades) {
				if ( grade > highGrade) { 
					highGrade = grade;
				}
			}
		}
		return highGrade;
	}


	//determinar a média
	public double getAverage(int[] setOfGrades) {
		int total = 0;

		for ( int grade : setOfGrades) {
			total = total + grade;
		}

		return (double) total / setOfGrades.length;
	}


	public void outputBarChart() {
		System.out.println("Distribuição de Notas");

		// armazena frequência de notas em array auxiliar
		int[] frequency = new int[11];

		//para cada nota em GradeBook, incrementa a frequência apropriada
		for( int[] studentGrades : grades ) {
			for ( int grade : studentGrades ) {
				frequency[grade /10 ] = frequency[grade /10 ] + 1 ; 
			}
		}

		//pra cada frequência de nota, imprime a barra no gráfico

		for ( int count = 0 ; count < frequency.length ; count++) {

			if ( count == 10 ) {
				System.out.printf("%5d: ",100);
			} else {
				System.out.printf("%02d-%02d: ",count*10,count*10+9);
			}

			for ( int star = 0 ; star < frequency[count] ; star++) {
				System.out.printf("*");
			}

			System.out.println();

		}
		
	}
	public void outputGrades() {
		System.out.printf("As notas são:%n%n");
		System.out.printf("            ");
		for ( int test = 0 ; test < grades[0].length ; test++) {
			System.out.printf("Test %d  ",test+1);
		}

		System.out.println("  Média");

		for ( int student = 0 ; student < grades.length ; student++) {

			System.out.printf("Student %2d",student+1);

			for (int test : grades[student]) {
				System.out.printf("%8d",test);
			}

			// chama método getAverage para calcular a média do aluno;
			double average = getAverage(grades[student]);   // calculando a média das notas em linha
			System.out.printf("%9.2f",average);
			System.out.println();

		}	
	}	
}

