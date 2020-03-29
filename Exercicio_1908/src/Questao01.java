import java.lang.Math;



public class Questao01 {

	public static void main(String[] args) {
		
		double numAleatorio;
		
		for (int i=0;i<50;i++){
			numAleatorio = Math.random()*100;
			System.out.println("Valor: "+Math.ceil(numAleatorio));		
			System.out.println("Valor: "+(numAleatorio));
		}
	}

}
