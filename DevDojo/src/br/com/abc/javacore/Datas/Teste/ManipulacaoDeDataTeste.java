package br.com.abc.javacore.Datas.Teste;

import java.util.Calendar;
import java.util.Date;

public class ManipulacaoDeDataTeste {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		//date.setTime(date.getTime()+3_600_000L);
		System.out.println(date);
		
		Calendar calendario = Calendar.getInstance();
		calendario.setTime(date);
		if(Calendar.SUNDAY == calendario.getFirstDayOfWeek()){
			System.out.println("Domingo é o primeiro dia da semana!!!");
		}
		System.out.println(calendario.get(Calendar.DAY_OF_MONTH));
		System.out.println(calendario.get(Calendar.DAY_OF_WEEK));
		System.out.println(calendario.get(Calendar.DAY_OF_YEAR));
		calendario.roll(Calendar.HOUR,24);
		//calendario.roll(Calendar.MONTH,9);
		Date date2 = calendario.getTime();
		System.out.println(date2);
		//System.out.println(calendario.z);
		//zone=sun.util.calendar.ZoneInfo[id="America/Fortaleza"
		
		//NumberFormat, Locale, Calendar, Date, DateFormat
		
	}

}
