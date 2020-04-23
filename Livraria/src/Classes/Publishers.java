package Classes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class Publishers extends ConnectDAO {
	private int publisher_id;
	private String name;
	private String url;
	
	ConnectDAO dao = new ConnectDAO();
	
	//métodos GETTERS e SETTERS
	
	public int getPublisher_id() {
		return publisher_id;
	}
	public void setPublisher_id(int publisher_id) {
		this.publisher_id = publisher_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	

	// Inserir Publishers
	public void inserirPublishers(int publisher_id, String name, String url) { // Inserir Publisher

		this.publisher_id = publisher_id;
		this.name = name;
		this.url = url;

		try {
			String query = "INSERT INTO publishers (publisher_id, name, url) VALUES ( ? , ? , ? )";
			PreparedStatement preparedStmt = con.prepareStatement(query);
			preparedStmt.setInt(1, this.publisher_id );
			preparedStmt.setString(2, this.name );
			preparedStmt.setString(3, this.url );
			preparedStmt.execute();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	//Alterar Publishers
	public void atualizarPublishers(int publisher_id, String name, String url) { //Alterar Publishers
		
		this.publisher_id = publisher_id;
		this.name = name;
		this.url = url;
		
		try {
			String query = "UPDATE publishers SET name = ? , url = ? WHERE  publisher_id = ?";
			
			PreparedStatement preparedStmt = con.prepareStatement(query);
			preparedStmt.setString(1, this.name );
			preparedStmt.setString(2, this.url );
			preparedStmt.setInt(3, this.publisher_id );
			preparedStmt.execute();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	//Excluir Publishers
	public void excluirPublishers(int publisher_id) { //Excluir Publishers

		this.publisher_id = publisher_id;

		try {
			String query = "delete from publishers where publisher_id =?";
			PreparedStatement preparedStmt = con.prepareStatement(query);
			preparedStmt.setInt(1, this.publisher_id );
			preparedStmt.execute();
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
	//PesquisarPublishers
	public void pesquisarPublishers(String name) { //Pesquisar Publishers

		this.name = name;

		
		try {
			String query = "select * from publishers where name like '%"+ this.name + "%'";
			Statement st = this.con.createStatement();
			ResultSet rs = st.executeQuery(query);
			ResultSetMetaData metaData = rs.getMetaData();

			int numColunas = metaData.getColumnCount(); // pegando o numero de colunas 
			System.out.printf("%-10s\t", metaData.getColumnName(1));
			for(int i = 2; i <= numColunas; i++) {
				System.out.printf("%-20s\t", metaData.getColumnName(i));
			}			
			System.out.println();
			while (rs.next()) {
				System.out.printf("%-10s\t", rs.getObject(1));
				for(int i = 2; i <= numColunas; i++) {
					System.out.printf("%-20s\t", rs.getObject(i));
				}
				System.out.println();
			}
			rs.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
	

}
