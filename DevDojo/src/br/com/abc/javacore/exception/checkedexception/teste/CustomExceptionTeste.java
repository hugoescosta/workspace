package br.com.abc.javacore.exception.checkedexception.teste;

import javax.swing.JOptionPane;

import br.com.abc.javacore.exception.customexceptions.LoginInvalidoException;

public class CustomExceptionTeste {

	public static void main(String[] args) {
		try {
			logar();
		} catch (LoginInvalidoException e) {
			e.printStackTrace();
		}	

	}
	
	private static void logar() throws LoginInvalidoException{
		String usuarioBancoDeDados = "Hugo";
		String senhaBancoDeDados = "111";
		String usuarioDigitado = "Hugo";
		String senhaDigitada = "123";
		if (!usuarioBancoDeDados.equals(usuarioDigitado) || !senhaBancoDeDados.equals(senhaDigitada)){
			throw new LoginInvalidoException();
		}else{
			JOptionPane.showMessageDialog(null, "Logado!!!");
		}
	}

}
