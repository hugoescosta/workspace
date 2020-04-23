package Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class ConnectDAO {

	protected Connection con; 

	//Contrutores 


	public ConnectDAO() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			this.con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/livraria","root","B1c4@(root)");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}



	public Usuario buscaUsuario(String login) {
		try {
			String query = "select * from users where login_user='"+login+"'";
			Statement st = this.con.createStatement();
			ResultSet rs = st.executeQuery(query);
			rs.next();
			Usuario usuario = new Usuario();
			usuario.setLogin(rs.getString(1));
			usuario.setNome(rs.getString(2));
			usuario.setSenha(rs.getString(3));
			rs.close();
			return usuario;
		} catch (Exception e){

		}
		return null;
	}


	public Usuario buscaUsuario() {
		Usuario usuario = new Usuario();
		return usuario;
	}

	public Usuario buscaUsuario(String login, String senha) {
		try {
			String query = "select * from users where login_user='"+login+"'";
			Statement st = this.con.createStatement();
			ResultSet rs = st.executeQuery(query);
			rs.next();
			Usuario usuario = new Usuario();
			usuario.setLogin(rs.getString(1));
			usuario.setNome(rs.getString(2));
			usuario.setSenha(rs.getString(3));
			rs.close();
			return usuario;
		} catch (Exception e){

		}
		return null;
	}


	public Books executaQuery() {
		Books books = new Books();
		return books;
	}

	public Books executaQuery(int publisher_id) {
		try {

			String query = "select * from books where publisher_id="+publisher_id;
			Statement st = this.con.createStatement();
			ResultSet rs = st.executeQuery(query);
			rs.next();
			Books books = new Books();
			books.setTitle(rs.getString(1));
			books.setIsbn(rs.getString(2));
			books.setPublisher_id(Integer.parseInt(rs.getString(3)));
			books.setPrice(Double.parseDouble(rs.getString(4)));
			rs.close();
			return books;
		} catch (Exception e){

		}
		return null;


	}

	//Lista todos os Livros
	public Books listaBooks() {
		try {
			String query = "select * from books";
			Statement st = this.con.createStatement();
			ResultSet rs = st.executeQuery(query);
			ResultSetMetaData metaData = rs.getMetaData();
			int numColunas = metaData.getColumnCount(); // pegando o numero de colunas 
			Books books = new Books();
			for(int i = 1; i <= numColunas; i++)
				System.out.printf("%-8s\t", metaData.getColumnName(i));
			System.out.println();

			while (rs.next()) {
				System.out.printf("%-70s\t", rs.getObject(1));
				for(int i = 2; i <= numColunas; i++) {
					System.out.printf("%-10s\t", rs.getObject(i));
				}
				System.out.println();
			}
			rs.close();
			return books;

		} catch (Exception e) {

		}
		return null;
	}


	public void listaQualquerTabela(String tabela ) {

		try {
			String query = "select * from "+tabela;
			Statement st = this.con.createStatement();
			ResultSet rs = st.executeQuery(query);
			ResultSetMetaData metaData = rs.getMetaData();
			int numColunas = metaData.getColumnCount(); // pegando o numero de colunas 
			Books books = new Books();
			if (tabela.equals("books")) {
				System.out.printf("%-70s\t", metaData.getColumnName(1));
				for(int i = 2; i <= numColunas; i++) {
					System.out.printf("%-8s\t", metaData.getColumnName(i));
				}
			} else {
				for(int i = 1; i <= numColunas; i++) {
					System.out.printf("%-8s\t", metaData.getColumnName(i));
				}
			}
			System.out.println();
			while (rs.next()) {
				System.out.printf("%-70s\t", rs.getObject(1));
				for(int i = 2; i <= numColunas; i++) {
					System.out.printf("%-10s\t", rs.getObject(i));
				}
				System.out.println();
			}
			//books.setTitle(rs.getString(1));
			//books.setIsbn(rs.getString(2));
			//books.setPublisher_id(Integer.parseInt(rs.getString(3)));
			//books.setPrice(Double.parseDouble(rs.getString(4)));
			rs.close();

		} catch (Exception e) {

		}
	}

}
