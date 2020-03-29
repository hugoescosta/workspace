package br.com.abc.javacore.polimorfismo.teste;

import br.com.abc.javacore.polimorfismo.classes.ArquivoDAOImpl;
import br.com.abc.javacore.polimorfismo.classes.DatabaseDAOImpl;
import br.com.abc.javacore.polimorfismo.classes.GenericDAO;

public class DAOTeste {

	public static void main(String[] args) {
		GenericDAO arquivoDAO = new ArquivoDAOImpl();
		arquivoDAO.save();
	}

}
