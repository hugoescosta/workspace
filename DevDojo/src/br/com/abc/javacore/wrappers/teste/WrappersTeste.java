package br.com.abc.javacore.wrappers.teste;

import javax.swing.JOptionPane;

public class WrappersTeste {

	public static void main(String[] args) {
		// 8 tipos primitivos no JAVA - do menor para o maior
		byte bytePrimitivo = 1;
		short shortPrimitivo = 1;
		int intPrimitivo = 10;
		long longPrimitivo = 10;
		float floatPrimitivo = 10;
		double doublePrimitivo = 10;
		char charPrimitivo = 'A';
		boolean booleanPrimitivo = true;
		
		Byte byteWrapper = 1;  // 1 a 127
		Short shorWrapper = 1;
		Integer integerWrapper = new Integer("10");
		Long longWrapper = Long.valueOf(1000000L);
		Float floatWrapper = new Float("10");
		Double doubleWrapper = 10D;
		Character characterWrapper = new Character('B');
		Boolean booleanWrapper = new Boolean("TrUe");
		
		String valor = "10";
		Float f = Float.parseFloat(valor);
		
		JOptionPane.showMessageDialog(null,Character.isDigit('0'));
		JOptionPane.showMessageDialog(null,Character.isLetter('P'));
		JOptionPane.showMessageDialog(null, booleanWrapper + " " + characterWrapper + " " + valor + " " + longWrapper);
		
		int i = integerWrapper;
	}

}
