package br.com.abc.javacore.Datas.Teste;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTeste {

	public static void main(String[] args) {
		float valor = 111123.456799999999999f;
		Locale locJP = new Locale("jp");
		Locale locIndia = new Locale("fr");
		NumberFormat[] nfa = new NumberFormat[4];
		nfa[0] = NumberFormat.getInstance();
		nfa[1] = NumberFormat.getInstance(locIndia);
		nfa[2] = NumberFormat.getCurrencyInstance();
		nfa[3] = NumberFormat.getCurrencyInstance(locIndia);
		
		for (NumberFormat nf : nfa) {
			System.out.println(nf.format(valor));
		}
		NumberFormat nf = NumberFormat.getInstance();
		System.out.println(nf.getMaximumFractionDigits());
		nf.setMaximumFractionDigits(7);
		System.out.println(nf.getMaximumFractionDigits());
		System.out.println(nf.format(valor));
		String valorString = "212,4567";
		try {
			System.out.println(nf.parse(valorString));
			nf.setParseIntegerOnly(true);
			System.out.println(nf.parse(valorString));
			//nf.form
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		

	}

}
