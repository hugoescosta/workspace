package br.com.abc.javacore.exception.runtimeexception.teste;

import java.io.File;

import javax.swing.JOptionPane;

public class RuntimeExceptionTeste2 {
	public static void main(String[] args){
		try{
			divisao(10,0);
		}catch(RuntimeException e){
			JOptionPane.showMessageDialog(null,e.getMessage());
			e.printStackTrace();
		}
	}
	
	private static void divisao(int num1, int num2){
		if (num2 == 0){
			throw new IllegalArgumentException("Passe um valor diferente de 0 para num2");
		}
		int resultado = num1/num2;
		System.out.println(resultado);
	}
}
