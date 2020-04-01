package Capitulo07;

public class GradeBook {
	
	private String courseName; // Nome do curso que essa Grade representa
	private int[] grades; // array com as notas dos alunos
	
	
	//Construtor
	public GradeBook(String courseName, int[] grades) {
		super();
		this.courseName = courseName;
		this.grades = grades;
	}

	//Getters e Setters
	//courseName
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	//grades
	public int[] getGrades() {
		return grades;
	}

	public void setGrades(int[] grades) {
		this.grades = grades;
	}
	
	// realiza várias operações nos dados
	public void processGrades() {
		
		//gera a saída do array das notas
		outputGrades();
		
		//Chama o método getAverage para calcular a nota média da classe
		System.out.printf("%nMédia da classe é %.2f%n", getAverage());
		
		//Nota mais baixa e nota mais alta da classe
		System.out.printf("Nota mais baixa é %.2f%nNota mais alta é %.2f%n", (double) getMinimun(), (double) getMaximun());
		
		//Gráfico de Barras da notas
		outputBarChar();
		
		//Localiza a menor Nota do array
	}
	
	public int getMinimun() {
		int lowGrade = grades[0]; // supoe que a menor nota é grades[0]
		
		//procura a menor nota do array grades
		for ( int grade : grades ) {
			if ( grade < lowGrade ) {
				lowGrade = grade;
			}
		}
		return lowGrade; //retorna lowGrade
	}
	
	public int getMaximun() {
		int highGrade = grades[0]; // supoe que a maior nota é grades[0]
		
		//procura a maior nota do array grades
		for ( int grade : grades ) {
			if ( grade > highGrade ) {  // testa se a nota em highGrade é maior que a nota do atual indice do array grades
				highGrade = grade;
			}
		}
		return highGrade; //retorna highGrade
	}
	
	public double getAverage() {
		int total = 0;
		
		for ( int grade : grades ) {
			total = total + grade ;
		}
		
		//retorna a média das notas
		return (double) total / grades.length;
	}
	
	
	// Gráfico de Barras
	
	public void outputBarChar() {
		
		System.out.println("Distribuição de notas");
		
		int[] frequency = new int[11];
		
		for ( int grade : grades ) {
			frequency[grade/10] = frequency[grade/10]+ 1;
		}
		
		for ( int count = 0 ; count < frequency.length ; count++) {
			
			if ( count == 10 ) {
				System.out.printf("%5d: ",100);
			} else {
				System.out.printf("%02d-%02d: ",count*10,count*10+9);
			}
			
			for (int stars = 0 ; stars < frequency[count] ; stars++ ) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	//gera a saída da nota de cada aluno
	public void outputGrades() {
		System.out.printf("As notas são:%n%n");
		
		//gera a saída das notas de cada aluno
		for ( int student = 0 ; student < grades.length ; student++) {
			System.out.printf("Student %2d: %3d%n",student+1, grades[student]);
		}
	}
} //fim da clase
