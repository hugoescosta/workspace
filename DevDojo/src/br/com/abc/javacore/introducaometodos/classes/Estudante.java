package br.com.abc.javacore.introducaometodos.classes;

public class Estudante {
	
	private String nome;
	private int idade;
	private double[] notas = {};
	private boolean aprovado;
	
	public void imprimeNotas(){
		System.out.println("Nome: "+this.nome);
		System.out.println("Idade:"+this.idade);
		System.out.print("Notas: ");
		for(double num : notas){
			System.out.print(num+" ");
		}
	}
	
	public void tirarMedia(){
		double media = 0;
		for(double num : notas){
			media += num;
		}
		media = media/(notas.length);
		if (Double.isNaN(media)){
			System.out.println("Aluno não possui NOTAS!!!");			
		}else{
			if (media >= 6){
				this.aprovado = true;
				System.out.println("\nAluno APROVADO, média: "+media);
			}else{
				this.aprovado = false;
				System.out.println("\nAluno REPROVADO, média: "+media);
			}
		}
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public void setIdade(int idade){
		if (idade < 0){
			System.out.println("Idade inválida");
			return;
		}
		this.idade = idade;
	}
		
	// getters and setters
	public void setNotas(double[] notas){
		this.notas = notas;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public int getIdade(){
		return this.idade;
	}
	
	public double[] getNotas(){
		return this.notas;
	}
	
	public boolean isAprovado(){
		return this.aprovado;
	}
	
	
}
