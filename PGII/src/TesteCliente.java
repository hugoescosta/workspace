import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TesteCliente {

	public static void main(String[] args) {
		Clientes cliente = new Clientes();
		Class<Clientes> claszz = (Class<Clientes>) cliente.getClass();
		//System.out.println(cliente.getClass());
		//System.out.println(cliente.getClass().getName());
		//System.out.println(Clientes.class.getName());
		
		System.out.println("Campos\n");
		for ( Field f: claszz.getDeclaredFields()) {
			System.out.println(f.getName());  
		}
		
		System.out.println("\nMétodos"); 
		
		for ( Method m : claszz.getDeclaredMethods()) {
			System.out.println(m.getName());
		}
		
		
	}

}
