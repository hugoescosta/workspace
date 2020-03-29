import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TesteCliente1 {

	public static void main(String[] args){
		Clientes cliente = (Clientes) createNewInstance(Clientes.class);
		if (cliente == null) {
		System.err.println("Ops, não foi possível criar o objeto cliente");
		} else {
		System.out.println("Objeto cliente criado = " + cliente.toString());
		}
		}
	
	private static Object createNewInstance(Class clazz) {
		Constructor<?> ctor;
		try {
			ctor = clazz.getConstructors()[0];
			Object object = ctor.newInstance();
			return object;
		} catch (SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;
		}
}
