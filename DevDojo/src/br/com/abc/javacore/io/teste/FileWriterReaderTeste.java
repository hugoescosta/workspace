package br.com.abc.javacore.io.teste;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReaderTeste {

	public static void main(String[] args) {
		File file = new File("Arquivo.txt");
		try(FileWriter fw = new FileWriter(file);
				FileReader fr = new FileReader(file)){
			fw.write("Escrevendo uma mensagem no arquivo\n e Pulando uma linha\n");
			fw.flush();

			char[] in = new char[500];
			int size = fr.read(in);
			System.out.println("Quantidade de caracteres no arquivo: "+size);
			for(char c: in) {
				System.out.print(c);
			}

		} catch (IOException e1) {
			e1.printStackTrace();
		}
/*		try {
			FileWriter fw = new FileWriter(file,true); // o TRUE permite adicionar o texto ao arquivo
			//FileWriter fw = new FileWriter(file);
			fw.write("Escrevendo uma mensagem no arquivo\n e Pulando uma linha\n");
			fw.flush();
			fw.close();
			FileReader fr = new FileReader(file);
			char[] in = new char[9999];
			int size = fr.read(in);
			System.out.println("Quantidade de caracteres no arquivo: "+size);
			for(char c: in) {
				System.out.print(c);
			}
			fr.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		} */
	}

}
