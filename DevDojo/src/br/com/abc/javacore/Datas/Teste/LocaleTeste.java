package br.com.abc.javacore.Datas.Teste;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTeste {

	public static void main(String[] args) {
		Locale locItaly = new Locale("it","IT");
		Locale locSuica = new Locale("it","CH");
		Locale locBrasil = new Locale("pt","BR");
		Locale locJapao = new Locale("ja");
		Locale locIndia = new Locale("hi","IN");
		Calendar calendario = Calendar.getInstance();
		// comentando essa linha eu pego a data ATUAL -  calendario.set(2020, 00, 06);
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locItaly);
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, locSuica);
		DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, locBrasil);
		DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, locJapao);
		DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, locIndia);
		System.out.println("Formato de data "+ locItaly.getDisplayCountry()+" : " +df.format(calendario.getTime()));
		System.out.println("Formato de data "+ locSuica.getDisplayCountry()+" : " +df2.format(calendario.getTime()));
		System.out.println("Formato de data "+ locBrasil.getDisplayCountry()+" : " +df3.format(calendario.getTime()));
		System.out.println("Formato de data "+ locJapao.getDisplayCountry()+" : " +df4.format(calendario.getTime()));
		System.out.println("Formato de data "+ locIndia.getDisplayCountry()+" : " +df5.format(calendario.getTime()));
		
		System.out.println(locItaly.getDisplayLanguage(locJapao));
		System.out.println(locJapao.getDisplayLanguage(locItaly));
		System.out.println(locItaly.getDisplayName(locBrasil));

	}

}
