package br.com.abc.javacore.exception.checkedexception.teste;

import java.io.File;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

class CheckedExceptionTeste {
	public static void main(String[] args){
		try {
			criarArquivo();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		abrirArquivo();
		
	}
	
	public static void criarArquivo() throws IOException{
		File file = new File("teste.txt");
		try{
			JOptionPane.showMessageDialog(null, "Arquivo criado? "+file.createNewFile());
			JOptionPane.showMessageDialog(null, "Arquivo CRIADO!!!");
		}catch(IOException e){
			//JOptionPane.showMessageDialog(null,"Erro na criação do arquivo");
			e.printStackTrace();
			throw e;
		}
	}
	
	public static String abrirArquivo(){
		
		// opções de criação de try:
		// Sequência:
		// try - catch
		// ou
		// try - catch - finally
		// ou
		// try - finally
		// nunca
		// try sozinho
		
		
		try{
			JOptionPane.showMessageDialog(null, "Abrindo um arquivo!!!");
			JOptionPane.showMessageDialog(null, "Executando a leitura do arquivo");
			//throw new Exception();
			JOptionPane.showMessageDialog(null, "Escrevendo no arquivo!!!");
			return "VALOR";
		}catch(Exception e){
			JOptionPane.showMessageDialog(null,"Dentro do CATCH!!!");
			e.printStackTrace();
		}finally{
			JOptionPane.showMessageDialog(null, "Fechar arquivo!!!");
		}
		return null;
	}
}
