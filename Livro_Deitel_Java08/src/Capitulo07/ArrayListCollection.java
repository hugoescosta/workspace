package Capitulo07;

import java.util.ArrayList;

public class ArrayListCollection {

	public static void main(String[] args) {
		
		// cria um novo ArrayList de String com a capacidade de 10 elementos
		
		ArrayList<String> items = new ArrayList<String>();
		items.add("red"); // anexa um item a lista
		items.add(0,"yellow"); //  insere yellow  no �ndice 0
		
		//cabe�alho
		
		System.out.println("Mostra o conte�do da lista com um FOR de controle por contador");
		
		for (int i = 0; i < items.size() ;  i++) {
			System.out.printf("%s%n", items.get(i));
		}
		
		System.out.println();
		// exibe as cores usando o FOR aprimorado no modo display
		
		display(items, "Mostra a lista com FOR aprimorado:%n");
		items.add("green");
		items.add("yellow");
		display(items,"Acabou de adicionar o verde e amarelo:%n");
		System.out.println();
		
		items.remove("yellow"); //remove o primeiro "yellow"
		display(items,"Remover a primeira inst�ncia de amarelo:%n");
		
		items.remove(1); // remove o item no �ndice 1
		display(items,"Remove segundo elemento da lista (green):%n");
		
		// verifica se um valor est� na List
		System.out.printf("Verifica se tem red na lista: %s%n%n",items.contains("red") ? "Verdadeiro": "Falso");
		
		//Exibir o n�mero de elementos da lista
		System.out.printf("Tamanho da Lista: %s%n", items.size());
	}
	
	
	//Exibe elementos do array na console
	public static void display(ArrayList<String> items, String header)
	{
		System.out.printf(header); // exibe o cabe�alho

		// exibe cada elemento em itens
		for (String item : items) {
			System.out.printf("%s ", item);
		}
		System.out.println();
	}

}
