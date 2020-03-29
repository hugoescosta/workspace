package Nio.teste;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizacaoTeste {

	public static void main(String[] args) {
		String diretorioProjeto = "/home/hcosta/workspace/DevDojo";
		String arquivoTxt = "../../arquivo.txt";
		Path p1 = Paths.get(diretorioProjeto,arquivoTxt);
		System.out.println(p1);
		System.out.println(p1.normalize());
		Path p2 = Paths.get("/home/./hugo/./workspace");
		System.out.println(p2);
		System.out.println(p2.normalize());
		

	}

}
