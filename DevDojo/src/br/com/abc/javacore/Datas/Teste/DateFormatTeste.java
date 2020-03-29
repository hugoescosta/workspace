package br.com.abc.javacore.Datas.Teste;


import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormatTeste {

	public static void main(String[] args) {
		Calendar calendario = Calendar.getInstance();
		DateFormat[] dfa = new DateFormat[6];
		dfa[0] = DateFormat.getInstance();
		dfa[1] = DateFormat.getDateInstance();
		dfa[2] = DateFormat.getDateInstance(DateFormat.SHORT);
		dfa[3] = DateFormat.getDateInstance(DateFormat.MEDIUM);
		dfa[4] = DateFormat.getDateInstance(DateFormat.LONG);
		dfa[5] = DateFormat.getDateInstance(DateFormat.FULL);
		
		for (DateFormat df : dfa) {
			System.out.println(df.format(calendario.getTime()));
		}
	}

}
