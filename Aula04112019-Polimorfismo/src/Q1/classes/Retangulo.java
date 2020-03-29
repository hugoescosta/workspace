package Q1.classes;

public class Retangulo extends Figura {
	private float lado;
	private float altura;
	
	
	
	public Retangulo(){
	}

	public Retangulo(float lado, float altura) {
		super();
		this.lado = lado;
		this.altura = altura;
	}

	@Override
	float calcularArea() {
		return lado * altura;
	}

	@Override
	float calcularPerimetro() {
		return (lado *2) + (altura * 2);
	}

	public String nome(){
		return "Retangulo";
	}

	public float getLado() {
		return lado;
	}

	public void setLado(float lado) {
		this.lado = lado;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

}
