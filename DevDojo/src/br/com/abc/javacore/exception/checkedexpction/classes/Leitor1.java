package br.com.abc.javacore.exception.checkedexpction.classes;

public class Leitor1 implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("Fechando Leitor 1");
		
	}

}
