package br.com.abc.javacore.exception.checkedexception.teste;

import java.io.File;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

class CheckedExceptionTeste3 {
	public static void main(String[] args){
		criarArquivo();
		
		
	}
	
	public static void criarArquivo(){
	File file = new File("/root/teste.txt");
	try{
		JOptionPane.showMessageDialog(null, "Arquivo criado? "+file.createNewFile());
		JOptionPane.showMessageDialog(null, "Arquivo CRIADO!!!");
	}catch(IOException e){
		//JOptionPane.showMessageDialog(null,"Erro na criação do arquivo");
		e.printStackTrace();
	}
	}
}
