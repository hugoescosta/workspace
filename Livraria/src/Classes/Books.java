package Classes;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class Books {
	private String title;
	private String isbn;
	private int publisher_id;
	private double price;
	
	private Connection con;
	
		//Métodos Getters e Setters
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public int getPublisher_id() {
		return publisher_id;
	}
	public void setPublisher_id(int publisher_id) {
		this.publisher_id = publisher_id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	//Construtores
	public Books() {
	}
	public Books(String title, String isbn, int publisher_id, double price) {
		super();
		this.title = title;
		this.isbn = isbn;
		this.publisher_id = publisher_id;
		this.price = price;
	}
	
	// Inserir Livro
	public void inserirBooks(String title, String isbn, int publisher_id, double price) { // Inserir Livro
		
		this.title = title;
		this.isbn = isbn;
		this.publisher_id = publisher_id;
		this.price = price;
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			this.con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/livraria","root","B1c4@(root)");
			String query = "INSERT INTO books (title, isbn, publisher_id, price) VALUES ( ? , ? , ? , ? )";
			PreparedStatement preparedStmt = con.prepareStatement(query);
		    preparedStmt.setString (1, this.title );
		    preparedStmt.setString (2, this.isbn );
		    preparedStmt.setInt   (3, this.publisher_id );
		    preparedStmt.setDouble(4, this.price );
		    preparedStmt.execute();
		    con.close();
			
		} catch (Exception e) {

		}
	}
	
	//Alterar Livro
	public void atualizarBooks(String title, String isbn, int publisher_id, double price) { //Alterar Livro
		
		this.title = title;
		this.isbn = isbn;
		this.publisher_id = publisher_id;
		this.price = price;
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			this.con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/livraria","root","B1c4@(root)");
			String query = "UPDATE books SET title = ? , publisher_id = ? , price = ? WHERE  isbn = ?";
			
			//UPDATE books SET title=?, publisher_id=?, price=? WHERE  isbn=?';
			
			PreparedStatement preparedStmt = con.prepareStatement(query);
		    preparedStmt.setString (1, this.title );
		    preparedStmt.setInt (2, this.publisher_id );
		    preparedStmt.setDouble   (3, this.price );
		    preparedStmt.setString(4, this.isbn );
		    preparedStmt.execute();
		    con.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	//Excluir Livro
	public void excluirBooks(String isbn) { //Excluir Livro

		this.isbn = isbn;

		try {
			Class.forName("org.mariadb.jdbc.Driver");
			this.con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/livraria","root","B1c4@(root)");
			String query = "delete from books where isbn =?";

			PreparedStatement preparedStmt = con.prepareStatement(query);
			preparedStmt.setString(1, this.isbn );
			preparedStmt.execute();
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	//Pesquisar Livro
	public void pesquisarBooks(String title) { //Pesquisar Livro

		this.title = title;

		try {
			Class.forName("org.mariadb.jdbc.Driver");
			this.con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/livraria","root","B1c4@(root)");
			String query = "select * from books where title like '%"+ this.title + "%'";
			Statement st = this.con.createStatement();
			ResultSet rs = st.executeQuery(query);
			ResultSetMetaData metaData = rs.getMetaData();

			int numColunas = metaData.getColumnCount(); // pegando o numero de colunas 
			System.out.printf("%-70s\t", metaData.getColumnName(1));
			for(int i = 2; i <= numColunas; i++) {
				System.out.printf("%-8s\t", metaData.getColumnName(i));
			}			
			System.out.println();
			while (rs.next()) {
				System.out.printf("%-70s\t", rs.getObject(1));
				for(int i = 2; i <= numColunas; i++) {
					System.out.printf("%-10s\t", rs.getObject(i));
				}
				System.out.println();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
}
