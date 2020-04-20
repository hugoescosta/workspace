package Classes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConectaBanco {
	
	/*public static void main(String[] args) throws SQLException {
		
		ConectaDAO dao = new ConectaDAO();
		User usuario = dao.getUser("hcosta");
		System.out.println(usuario.getNome_user());
		System.out.println(usuario.getLogin_user());
		System.out.println(usuario.getSenha_user());
		
	}*/

}


class ConectaDAO {
	private User user;

	public User getUser(String login_user,String senha_user) throws SQLException {
		try {
			String query = "select * from users where login_user='"+login_user+"'";
			User user = new User();
			
			Class.forName("org.mariadb.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/livraria","root","B1c4@(root)");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			rs.next();
			String login = rs.getString(1);
			String nome = rs.getString(2);
			String senha = rs.getString(3);
			user.setLogin_user(login);
			user.setNome_user(nome);
			user.setSenha_user(senha);
			rs.close();
			return user;
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
}

class User {
	private String login_user;
	private String nome_user;
	private String senha_user;
	
	public String getLogin_user() {
		return login_user;
	}
	public void setLogin_user(String login_user) {
		this.login_user = login_user;
	}
	public String getNome_user() {
		return nome_user;
	}
	public void setNome_user(String nome_user) {
		this.nome_user = nome_user;
	}
	public String getSenha_user() {
		return senha_user;
	}
	public void setSenha_user(String senha_user) {
		this.senha_user = senha_user;
	}
	
	
}
