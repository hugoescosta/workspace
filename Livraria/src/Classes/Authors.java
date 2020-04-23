package Classes;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class Authors extends ConnectDAO {
	private int author_id;
	private String name;
	private String fname;
	
	ConnectDAO dao = new ConnectDAO();
	
	//Métodos GETTERS e SETTERS
	public int getAuthor_id() {
		return author_id;
	}
	public void setAuthor_id(int author_id) {
		this.author_id = author_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	
	
	//construtor
	
	public Authors() {
	}
	
	public Authors(int author_id, String name, String fname) {
		super();
		this.author_id = author_id;
		this.name = name;
		this.fname = fname;
	}
	
	// Inserir Authors
	public void inserirAuthors(int author_id, String name, String fname) { // Inserir Authors
		
		this.author_id = author_id;
		this.name = name;
		this.fname = fname;
		
		try {
			String query = "INSERT INTO authors (author_id, name, fname) VALUES ( ? , ? , ? )";
			PreparedStatement preparedStmt = con.prepareStatement(query);
		    preparedStmt.setInt(1, this.author_id );
		    preparedStmt.setString(2, this.name );
		    preparedStmt.setString(3, this.fname );
		    preparedStmt.execute();
		    con.close();
		} catch (Exception e) {

		}
	}
	
	//Alterar Authors
	public void atualizarAuthors(int author_id , String name, String fname) { //Alterar Authors
		
		this.author_id = author_id;
		this.name = name;
		this.fname = fname;
		
		try {
			String query = "UPDATE authors SET name = ? , fname = ? WHERE  author_id = ?";
			
			PreparedStatement preparedStmt = con.prepareStatement(query);
		    preparedStmt.setString (1, this.name );
		    preparedStmt.setString(2, this.fname );
		    preparedStmt.setInt(3, this.author_id );
		    preparedStmt.execute();
		    con.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	//Excluir Authors
	public void excluirAuthors(int author_id) { //Excluir Authors

		this.author_id = author_id;

		try {
			String query = "delete from authors where author_id =?";
			PreparedStatement preparedStmt = con.prepareStatement(query);
			preparedStmt.setInt(1, this.author_id );
			preparedStmt.execute();
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	//Pesquisar Authors
	public void pesquisarAuthors(String name) { //Pesquisar Livro

		this.name = name;

		
		try {
			String query = "select * from authors where name like '%"+ this.name + "%'";
			Statement st = this.con.createStatement();
			ResultSet rs = st.executeQuery(query);
			ResultSetMetaData metaData = rs.getMetaData();

			int numColunas = metaData.getColumnCount(); // pegando o numero de colunas 
			System.out.printf("%-10s\t", metaData.getColumnName(1));
			for(int i = 2; i <= numColunas; i++) {
				System.out.printf("%-8s\t", metaData.getColumnName(i));
			}			
			System.out.println();
			while (rs.next()) {
				System.out.printf("%-10s\t", rs.getObject(1));
				for(int i = 2; i <= numColunas; i++) {
					System.out.printf("%-10s\t", rs.getObject(i));
				}
				System.out.println();
			}
			rs.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
	
	
}
