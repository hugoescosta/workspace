package Nio.teste;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CriandoPathTeste {

	public static void main(String[] args) {
		Path p1 = Paths.get("/home/hcosta/workspace/DevDojo/Arquivo.txt");
		Path p2 = Paths.get("/home/hcosta/workspace/DevDojo","Arquivo.txt");
		Path p3 = Paths.get("/","home","hcosta","workspace","DevDojo","Arquivo.txt");
		System.out.println(p3.toAbsolutePath());
		System.out.println(p3.toFile());
		System.out.println(p3.toUri());
		File file = p3.toFile();
		Path path = file.toPath();
		
		Path path1 = Paths.get("pasta");
		Path path2 = Paths.get("pasta2/pasta2/pasta3/pasta4");
		Path arquivo = Paths.get("pasta2/pasta2/pasta3/pasta4/arquivo.txt");
		try {
			//if (Files.notExists(path1.getParent()))
				//Files.createDirectory(path1); // Cria apenas uma pasta
			if (Files.notExists(path2.getParent())) {
				Files.createDirectories(path2); // Cria o caminho
			}
			if(Files.notExists(arquivo))
			{
				Files.createFile(arquivo);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		Path source = Paths.get("folder2/arquivo.txt");
		Path target = Paths.get(path2.toAbsolutePath()+"/arquivo_copiado.txt");
		try {
			Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
			Files.deleteIfExists(target);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
