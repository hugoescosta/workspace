package View;

import java.sql.ResultSet;
import java.sql.Statement;

import Classes.ConnectDAO;
import Classes.Publishers;
import Classes.Usuario;
import Classes.Authors;
import Classes.Books;

public class teste {

	public static void main(String[] args) throws Exception {
		
	

		Books livro = new Books();
		//livro.inserirBooks("teste_HUGO", "99921-58-10-7", 201, 65);
		//livro.atualizarBooks("teste_HUGO_atualiza", "99921-58-10-7", 201, 65);
		//livro.excluirBooks("99921-58-10-7");
		livro.pesquisarBooks("unix"); //lista 
		
		Authors authors = new Authors();
		//authors.inserirAuthors(700, "Hugo", "Costa");
		//authors.atualizarAuthors(700, "Hugo", "Silveira da Costa");
		//authors.excluirAuthors(700);
		//authors.pesquisarAuthors("xa");
		
		Publishers publishers = new Publishers();
		//publishers.inserirPublishers(701, "UsemeCasa", "www.usemecasa.com.br");
		//publishers.atualizarPublishers(701, "UsemeHOME", "www.usemehome.com.br");
		//publishers.excluirPublishers(700);
		//publishers.pesquisarPublishers("");
		
		Usuario usuario = new Usuario();
		//usuario.inserirUsuarios("zete", "Zete Costa", "senha");
		//usuario.atualizarUsuario("zete", "Zete Costa", "oscar");
		//usuario.excluirUsuario("zete");
		//usuario.pesquisarUsuario("");
		
		if(usuario.checaSenhaUsuario("hcosta", "senha")) {
			teste2.main(usuario);
		}
	}

}
