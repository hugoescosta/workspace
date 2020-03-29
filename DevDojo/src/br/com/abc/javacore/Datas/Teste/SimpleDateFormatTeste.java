package br.com.abc.javacore.Datas.Teste;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SimpleDateFormatTeste {

	public static void main(String[] args) {
		Calendar calendario = Calendar.getInstance();
		String mascara = "dd/MM/yyyy G 'as' HH:mm:ss z";
		String mascara2 = "'Fortaleza,' dd 'de' MMMM 'de' yyyy ' as ' HH:MM:ss z";
		SimpleDateFormat formatador = new SimpleDateFormat(mascara);
		System.out.println(formatador.format(calendario.getTime()));
		SimpleDateFormat formatador2 = new SimpleDateFormat(mascara2);
		System.out.println(formatador2.format(calendario.getTime()));
		
		///https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html

	}

}
