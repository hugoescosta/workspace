package br.com.abc.javacore.io.teste;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTeste {
	public static void main(String[] args) {
		File file = new File("Arquivo.txt");
		try {
			//boolean newFile = file.createNewFile();
			//System.out.println(newFile);
			System.out.println(file.createNewFile());
			boolean existe = file.exists();
			System.out.println("Permissão de leitura?"+file.canRead());
			System.out.println("Caminho do arquivo (getPath()): "+file.getPath());
			System.out.println("Caminho do arquivo (getAbsolutePath()): "+file.getAbsolutePath());
			System.out.println("Diretorio?: "+file.isDirectory());
			System.out.println("Arquivo oculto?: "+file.isHidden());
			System.out.println("Última modificação:  "+new Date(file.lastModified()));
			if (existe) {
				System.out.println("Deletado? "+file.delete());
			}			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
