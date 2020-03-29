package Capitulo06;

public class Scope {

	// campo acessível para todos os métodos dessa classe
	private static int x = 1;

	// método main cria e inicializa a variável local X
	// e chama o método useLocalVariable e useField

	public static void main(String[] args) {
		System.out.printf("Valor da variável local x é %d%n",x);

		useLocalVariable(); // useLocalVariable também tem uma variável local chamada x
		useField(); // useField utiliza o campo x da classe Scope
		useLocalVariable(); // useLocalVariable reinicializa a variável local x
		useField(); // campo x da classe Scope retém o seu valor

		System.out.printf("%nLocal x em main é %d%n", x);


	}

	//cria e inicializa a variável local x durante cada chamada
	public static void useLocalVariable() {
		int x = 25; // inicializa a variável x, toda vez que esse método é chamado
		System.out.printf("%nLocal x no método useLocalVariable é %d%n", x);
		++x; // mofica o valor de local x desse método
		System.out.printf("Local x do método useLocalVariable agora é %d%n",x);	
	}
	
	public static void useField() {
		System.out.printf("%nCampo x em método useField é %d%n", x);
		x *= 10;
		System.out.printf("Campo x na saída do método useField agora é %d%n",x);
		
	}

}
