package View;

import java.sql.ResultSet;
import java.sql.Statement;

import Classes.ConnectDAO;
import Classes.Usuario;

public class teste {

	public static void main(String[] args) throws Exception {
		
		// Testar a classe de conexão com o banco...
		
		ConnectDAO dao = new ConnectDAO();
		
		Usuario usuario = dao.buscaUsuario("caio","senha");
		System.out.println(usuario.getNome());
		
		
		

		
		

	}

}
