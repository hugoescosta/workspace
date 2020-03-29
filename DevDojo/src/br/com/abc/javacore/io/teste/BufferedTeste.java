package br.com.abc.javacore.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedTeste {

	public static void main(String[] args) {
		File file = new File("Arquivo2.txt");
		
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			BufferedReader br = new BufferedReader(new FileReader(file))){
			
			bw.write("Escrevendo uma mensagem no arquivo");
			bw.newLine();
			bw.write("e Pulando uma linha");
			bw.flush();
			String s;
			while((s=br.readLine()) != null){
				System.out.println(s);
			}
			br.close();
			
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		/*
		try {
		//FileWriter fw = new FileWriter(file,true); // o TRUE permite adicionar o texto ao arquivo
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw); // recebe um FileWriter, nesse caso o fw
		
		bw.write("Escrevendo uma mensagem no arquivo");
		bw.newLine();
		bw.write("e Pulando uma linha");
		bw.flush();
		bw.close();
		
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String s = null;
		while((s=br.readLine()) != null){
			System.out.println(s);
		}
		br.close();
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
	}

}
