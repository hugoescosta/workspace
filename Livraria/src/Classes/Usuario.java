package Classes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Usuario extends ConnectDAO{
	
	private String login;
	private String nome;
	private String senha;
	
	ConnectDAO dao = new ConnectDAO();
	
	//Métodos Getters e Setters
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	// Inserir Usuario
	public void inserirUsuarios(String login, String nome, String senha) { // Inserir Usuario

		this.login = login;
		this.nome = nome;
		this.senha = senha;

		try {
			String query = "INSERT INTO users (login_user, nome_user, senha_user) VALUES ( ? , ? , ? )";
			PreparedStatement preparedStmt = con.prepareStatement(query);
			preparedStmt.setString(1, this.login );
			preparedStmt.setString(2, this.nome );
			preparedStmt.setString(3, this.senha );
			preparedStmt.execute();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	//Alterar Usuario
	public void atualizarUsuario( String login , String nome, String senha) { //Alterar Usuario

		this.login = login;
		this.nome = nome;
		this.senha = senha;

		try {
			String query = "UPDATE users SET nome_user = ? , senha_user = ? WHERE  login_user = ?";

			PreparedStatement preparedStmt = con.prepareStatement(query);
			preparedStmt.setString(1, this.nome );
			preparedStmt.setString(2, this.senha );
			preparedStmt.setString (3, this.login );
			preparedStmt.execute();
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	//Excluir Usuario
	public void excluirUsuario(String login) { //Excluir Authors

		this.login = login;

		try {
			String query = "delete from users where login_user =?";
			PreparedStatement preparedStmt = con.prepareStatement(query);
			preparedStmt.setString(1, this.login );
			preparedStmt.execute();
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	//PesquisarPublishers
	public void pesquisarUsuario(String nome) { //Pesquisar Usuario

		this.nome = nome;
		
		try {
			String query = "select * from users where nome_user like '%"+ this.nome + "%'";
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
	
	public boolean checaSenhaUsuario(String login, String senha) {
		
		this.login = login;
		this.senha = senha;
		
		try
		{
			String query = "select login_user,senha_user,nome_user from users where login_user = '"+this.login+"'";
			Statement st = this.con.createStatement();
			ResultSet rs = st.executeQuery(query);
			rs.next();
			
			//ResultSetMetaData metaData = rs.getMetaData();
			if (this.login.equals(rs.getString(1)) && this.senha.equals(rs.getString(2))){
				setLogin(this.login);
				setNome(rs.getString(3));
				//System.out.println("Usuario: "+getNome());
				rs.close();
				return true;
			} else {
				JOptionPane.showMessageDialog(null,"Dados Incorretos!!!","Error",JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}
	
	public Usuario checaSenhaUsuario2(String login, String senha) {
		
		this.login = login;
		this.senha = senha;
		
		try {
			String query = "select login_user,senha_user,nome_user from users where login_user = '"+this.login+"'";
			Statement st = this.con.createStatement();
			ResultSet rs = st.executeQuery(query);
			rs.next();
			
			//ResultSetMetaData metaData = rs.getMetaData();
			if (this.login.equals(rs.getString(1)) && this.senha.equals(rs.getString(2))){
				setLogin(this.login);
				setNome(rs.getString(3));
				//System.out.println("Usuario: "+getNome());
				rs.close();
				Usuario usuarioChecado = new Usuario();
				usuarioChecado.setLogin(rs.getString(1));
				usuarioChecado.setSenha(rs.getString(2));
				usuarioChecado.setNome(rs.getString(3));
				return usuarioChecado;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}
	
	
}
