import javax.swing.*;
public class Area {
	
	double area;

	public double calcArea(float raio){
		area = Math.PI*Math.pow(raio, 2);
		return area;	
	}
	
	public double calcArea(double base, double alt) {
		area = base*alt;
		return area;
	}
	
	public double calcAreaTriangulo(double base, double alt) {
		area = (base*alt/2);
		return area;
	}
}