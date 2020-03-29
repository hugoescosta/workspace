package Capitulo04;

public class Student {

	private String name;
	private double average;
	
	//Construtor de inicializa as varáveis de instâncias
	public Student(String name, double average) {
		this.name = name;
		
		// se média maior que ZERO
		if ( average > 0.0 ) { 
			if ( average <= 100 ) {
				this.average = average;
			}
		}
	}
	
		
	//Getters e Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public double getAverage() {
		return average;
	}
		//define média do estudante
	public void setAverage(double average) {
		 // valida que a média é > 0.0 e <= 100.0; caso contrário,
		 // armazena o valor atual da média da variável de instância
		 if (average > 0.0) {
			 if ( average <= 100 ) {
				 this.average = average;
			 }
		}
	}
	
	//Método
	//Determina e retorna a LETRA da NOTA do Estudante
	public String getLetterGrade() {
		String letterGrade = ""; //inicializa como uma string vazia
		
		if ( average >= 90.0 ) {
			letterGrade = "A";
		} else if ( average >= 80.0 ){
			letterGrade = "B";
		} else if ( average >= 70.0 ){
			letterGrade = "C";
		} else if ( average >= 60.0 ){
			letterGrade = "D";
		} else {
			letterGrade = "F";
		}
		return letterGrade;
	}
}//Fim da Classe estudante...
