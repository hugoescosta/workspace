package br.com.abc.javacore.exception.checkedexception.teste;

import java.io.File;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

class CheckedExceptionTeste2 {
	public static void main(String[] args){
		try{
		criarArquivo();
		}catch (IOException e){
			e.printStackTrace();
		}	
	}
	
	public static void criarArquivo() throws IOException {
	File file = new File("teste.txt");
		JOptionPane.showMessageDialog(null, "Arquivo criado? "+file.createNewFile());
		JOptionPane.showMessageDialog(null, "Arquivo CRIADO!!!");

	}
}
