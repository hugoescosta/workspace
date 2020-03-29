package br.com.abc.javacore.exception.runtimeexception.teste;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class MultiplasRuntimeExceptionsTeste {

	public static void main(String[] args) {
		try{
			throw new ArrayIndexOutOfBoundsException();
			//throw new IllegalArgumentException();
			//throw new ArithmeticException();
			//throw new RuntimeException();
		}catch(IllegalArgumentException | IndexOutOfBoundsException | ArithmeticException e){
			System.out.println("Dentro do ArrayIndexOutOfBoundsException");
		}finally{
			System.out.println("FINALLY");
		}
			
		try {
			talvezLanceException();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		// a partir do JAVA 7
		
		try {
			talvezLanceException();
		} catch( SQLException | IOException e) {
			e.printStackTrace();
		}
		
		// ou 
		
		try {
			talvezLanceException();
		} catch( Exception e) {
			e.printStackTrace();
		}
		
	}
	private static void talvezLanceException() throws SQLException, FileNotFoundException{
				
	}

}
