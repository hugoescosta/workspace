package br.com.abc.javacore.exception.runtimeexception.teste;

import javax.swing.JOptionPane;

public class RuntimeExceptionTeste {
	public static void main(String[] args){
		Object o = null;
		/*int a = 10;
		int b = 0;
		if (b != 0){
			int c = a/b;
		System.out.println(c);
		}*/
		try{
			int[] a = new int[2];
			System.out.println(a[2]);
			JOptionPane.showMessageDialog(null, "Imprimindo depois da possível excecao");
		}catch (ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
		}
		JOptionPane.showMessageDialog(null, "Fora do bloco catch");
		//System.out.println(o.toString());
	}

}
