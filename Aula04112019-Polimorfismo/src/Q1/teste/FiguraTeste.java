package Q1.teste;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import Q1.classes.Circulo;
import Q1.classes.Figura;
import Q1.classes.Quadrado;
import Q1.classes.Retangulo;

public class FiguraTeste {

	public static void main(String[] args) {
		int tipo = 0;
		float base = 0, altura = 0, raio = 0, lado = 0;
		ArrayList<Figura> fig = new ArrayList<Figura>();
		
		for(int i = 0; i < 10; i++){
			
			tipo = Integer.parseInt(JOptionPane.showInputDialog("1 - Retangulo \n2 - Quadrado \n3 - Circulo \nInforme o número da figura:"));
			
			if (tipo == 1){
				base = Float.parseFloat(JOptionPane.showInputDialog("Informe a base"));
				altura = Float.parseFloat(JOptionPane.showInputDialog("Informe a altura"));
				
				Retangulo retangulo = new Retangulo();
				fig.add(retangulo);
			}else if(tipo == 2){
				lado = Float.parseFloat(JOptionPane.showInputDialog("Informe o lado"));
				
				Quadrado quadrado = new Quadrado();
				fig.add(quadrado);
			}else if(tipo == 3){
				raio = Float.parseFloat(JOptionPane.showInputDialog("Informe o raio"));
				
				Circulo circulo = new Circulo();
				fig.add(circulo);
				
			}
		}
	}
}
