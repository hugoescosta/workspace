package br.com.abc.javacore.io.teste;

import java.io.File;
import java.io.IOException;

public class FileDiretorioTeste {

	public static void main(String[] args) throws IOException {
		/*File diretorio = new File("folder");
		boolean mkdir = diretorio.mkdir();
		System.out.println("Diretório Criado "+mkdir);
		File arquivo = new File(diretorio,"aqruivo.txt");
		boolean newFile = arquivo.createNewFile();
		System.out.println("Arquivo criado " + newFile);
		File arquivoNovoNome = new File(diretorio,"arquivo_renomeado.txt");
		boolean renamed = arquivo.renameTo(arquivoNovoNome);
		System.out.println("Renoeado "+renamed);
		
		File diretorioRenomeado = new File("folder2");
		boolean diretorioRenamed = diretorio.renameTo(diretorioRenomeado);
		System.out.println("Diretorio Renomeado: "+diretorioRenamed);*/
		buscaArquivos();
	}
	
	public static void buscaArquivos() {
		File file = new File("..//");
		String[] list = file.list();
		for (String arquivo: list) {
			System.out.println(arquivo);
		}
		System.out.println(list.length);
	}

}
