package br.com.abc.javacore.sobrecargaconstrutores;
import br.com.abc.javacore.sobrecargaconstrutores.classes.Estudante;

public class EstudanteTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Estudante est = new Estudante("123456","Hugo Costa", new double[] {5,7,9},"17/12/2005");
		est.imprime();
		
	}

}
