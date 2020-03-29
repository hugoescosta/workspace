package br.com.abc.javacore.exception.error;

public class ErrorTeste {
	public static void main(String[] args){
		
		stackOverflowError();
	}
	
	public static void stackOverflowError(){
		stackOverflowError();
	}
	
}
