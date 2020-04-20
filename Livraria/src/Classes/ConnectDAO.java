package Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectDAO {
	
	private Connection con; 

	//Contrutores 
	
	
	public ConnectDAO() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			this.con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/livraria","root","B1c4@(root)");
		} catch (Exception e) {
			e.printStackTrace();
		}
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
	

	
	
	
}
