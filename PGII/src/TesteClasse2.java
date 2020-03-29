import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

public class TesteClasse2 {
	
	public static void main(String[] args){
		Clientes cliente = new Clientes();
		cliente.setCodigo(1010);
		cliente.setDataNascimento(new Date());
		cliente.setEnderecoCompleto("Rua Dois, Bairro da Sé no 190");
		cliente.setNome("Antonio da Silva Xavier");
		cliente.setNomeMae("Maria da Silva Xavier");
		cliente.setNomePai("Joao da Silva Xavier");
	    mostrarValores(cliente);

}
	
	public static void mostrarValores(Object obj) {
		try {
			Class clazz = obj.getClass();
			//for ( Method t : clazz.getDeclaredMethods()) {
			//	System.out.println(t.getName());
			//}
			
			for (Method m : clazz.getDeclaredMethods()) {
				if (m.isAnnotationPresent(Mostrar.class)){
					System.out.println(m.getName()+": "+m.invoke(obj));
				}
			}
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
	}

}
