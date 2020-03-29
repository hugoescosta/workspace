package br.com.abc.javacore.exception.customexceptions;

public class LoginInvalidoException extends Exception {
	
	public LoginInvalidoException(){
		super("Usuário ou senha inválidos");
	}
	

}
