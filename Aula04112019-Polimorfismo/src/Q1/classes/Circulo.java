package Q1.classes;

public class Circulo extends Figura{
	private float raio;
	private static final double PI = Math.PI;
	
	public Circulo(){
	}
	
	public Circulo(float raio) {
		super();
		this.raio = raio;
	}

	@Override
	float calcularArea() {
		double area = PI*Math.pow(raio, 2);
		return (float) area;
	}

	@Override
	float calcularPerimetro() {
		double perimetro = 2*PI*raio;
		return (float) perimetro;
	}
	
	public float getRaio() {
		return raio;
	}

	public void setRaio(float raio) {
		this.raio = raio;
	}

	
	

}
