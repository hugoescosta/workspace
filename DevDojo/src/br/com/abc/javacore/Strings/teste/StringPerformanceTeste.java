package br.com.abc.javacore.Strings.teste;

import javax.swing.JOptionPane;

public class StringPerformanceTeste {

	public static void main(String[] args) {
		long inicio = System.currentTimeMillis();
		concatString(30000);
		long fim = System.currentTimeMillis();
		JOptionPane.showMessageDialog(null, "String: " + (fim - inicio));
		
		inicio = System.currentTimeMillis();
		concatStringBuilder(500000);
		fim = System.currentTimeMillis();
		JOptionPane.showMessageDialog(null, "String Builder: " + (fim - inicio));
		inicio = System.currentTimeMillis();
		concatStringBuffer(10000000);
		fim = System.currentTimeMillis();
		JOptionPane.showMessageDialog(null, "String Buffer: " + (fim - inicio));
	}

	private static void concatString(int tam){
		String string = "";
		for(int i = 0; i < tam; i ++){
			string += i;
		}
	}

	private static void concatStringBuilder(int tam){
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < tam; i ++){
			sb.append(i);
		}
	}
	
	private static void concatStringBuffer(int tam){
		StringBuffer sbuffer = new StringBuffer();
		for(int i = 0; i < tam; i ++){
			sbuffer.append(i);
		}
	}



}
