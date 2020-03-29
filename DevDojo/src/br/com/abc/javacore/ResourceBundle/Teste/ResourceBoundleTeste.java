package br.com.abc.javacore.ResourceBundle.Teste;
import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBoundleTeste {

	public static void main(String[] args) {
		//System.out.println(Locale.getDefault());
		System.out.println("Locale Inglês EUA");
		ResourceBundle rb = ResourceBundle.getBundle("messages", new Locale("en","US"));
		System.out.println(rb.getString("hello"));
		System.out.println(rb.getString("good.morning"));
		System.out.println(rb.getString("show"));
		System.out.println(rb.getString("video"));
		System.out.println("Locale Português Brasil");
		rb = ResourceBundle.getBundle("messages", new Locale("pt","BR"));
		System.out.println(rb.getString("hello"));
		System.out.println(rb.getString("good.morning"));
		System.out.println(rb.getString("show"));
		System.out.println(rb.getString("video"));
		//Ordem de procura
		//Locale locale = new Locale("fr","CA");
		//ResourceBundle.getBundle("messages",locale);
		
		//messages_fr_CA.properties - procura esse conforme definição do locale, não encontrando
		//messages_fr.properties    - procura esse, não encontrado
		//messages_pt_BR.properties - procura esse, conforme definido pelo Sistema Operacional, não encontrado
		//messages_pt.properties    - procura esse, não encontrado
		//messages.properties		- procura esse, não encontrando, apresenta mensagem de erro!!!
		
	}

}
