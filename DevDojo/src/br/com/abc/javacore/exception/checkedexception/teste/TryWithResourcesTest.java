package br.com.abc.javacore.exception.checkedexception.teste;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.BufferedReader;

import br.com.abc.javacore.exception.checkedexpction.classes.Leitor1;
import br.com.abc.javacore.exception.checkedexpction.classes.Leitor2;

public class TryWithResourcesTest {
	public static void main(String[] args) {
		lerArquivo();
	}
	

	
	//A partir do JAVA 7
	public static void lerArquivo(){
		/*try( Reader reader = new BufferedReader(new FileReader("teste3.txt")) ) {
		} catch (IOException e) {
			e.printStackTrace();
		}*/
		
		try (Leitor1 leitor1 = new Leitor1();
			 Leitor2 leitor2 = new Leitor2()){
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
	}
	
	// Até a versão 6 do JAVA 
	public static void lerArquivoOld(){
		Reader reader = null;
		try {
			reader = new BufferedReader(new FileReader("teste2.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally{
			try {
				if( reader != null){
					reader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	

}
