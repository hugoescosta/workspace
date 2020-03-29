package Exemplo_Construtor;

public class Pessoa {
	String nome, nomeMae, nomePai;
	int idade;
	
	public Pessoa(){}
	
	public Pessoa(String nome, String nomeMae) {
		this.nome = nome;
		this.nomeMae = nomeMae;		
	}
	
	public Pessoa (String nome, String nomeMae, String nomePai){
		this.nome = nome;
		this.nomeMae = nomeMae;
		this.nomePai = nomePai;
	}
	
	public Pessoa (String nome, String nomeMae, String nomePai, int idade){
		this.nome = nome;
		this.nomeMae = nomeMae;
		this.nomePai = nomePai;
		this.idade = idade;
	}
//	public Pessoa (String nome, String nomeMae, )
	public void imprimeInformacoes(){
		System.out.println("Seus dados são:"
				+" Nome: " + nome
				+" Nome da Mãe: " + nomeMae
				+" Nome do Pai:" + nomePai
				+" Idade: " + idade);
	
	}
	
	
}