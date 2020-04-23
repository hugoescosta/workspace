package View;

import java.util.Scanner;
import Classes.*;

import javax.swing.JOptionPane;

import Classes.ConnectDAO;

public class MenuLivraria {

	public static void main(String[] args) {

		int opcao;
		int opcao1;
		int opcao2;
		int opcao3;
		int opcao4;
		int opcao5;
		
		//Livros
		String title;
		String isbn;
		int publisher_id;
		double price;
		
		
		
		boolean continua = true;
		
		Scanner entrada = new Scanner(System.in); 
		
		ConnectDAO dao = new ConnectDAO();
		
		while (continua ){
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Menu Livraria Fortaleza"
					+ "\n1. Incluir"
					+ "\n2. Modificar"
					+ "\n3. Excluir"
					+ "\n4. Listar"
					+ "\n5. Pesquisar"
					+ "\n6. Sair", "Escolha uma opção"));
			switch(opcao) {
				case 1:
					opcao1 = Integer.parseInt(JOptionPane.showInputDialog("Livraria Fortaleza - Menu: Incluir"
							+ "\n1. Livros"
							+ "\n2. Autores"
							+ "\n3. Editora"
							+ "\n4. Sair", "Escolha uma opção"));
					switch(opcao1) {
						case 1:
							System.out.println("Nome do Livro: ");
							title = entrada.nextLine();
							System.out.println("ISBN do Livro: ");
							isbn = entrada.nextLine();
							System.out.println("Código do Autor: ");
							publisher_id = Integer.parseInt(entrada.nextLine());
							System.out.println("Preço : ");
							price = Double.parseDouble(entrada.nextLine());
							Books livro = new Books();
							if (title.isEmpty() || isbn.isEmpty()) {
								System.out.println("Faltando informação!!!");
							} else {
								livro.inserirBooks(title, isbn, publisher_id, price);
							}
							break;
						case 2:

						case 3:
							
						default:
							//JOptionPane.showMessageDialog(null, "Opção inválida!!!","Erro",JOptionPane.ERROR_MESSAGE);
							JOptionPane.showMessageDialog(null, "Opção inválida!!!");
					
					}
							
				case 2:
					
					break;
				case 3:
	
					break;
				case 4:
	
					break;
				case 5:
	
					break;
				case 6:
					System.out.println("Saindo....");
					continua = false;	
					break;
				default:
					break;
			}
		}
	}
}
