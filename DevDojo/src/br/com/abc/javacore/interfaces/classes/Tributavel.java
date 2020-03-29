package br.com.abc.javacore.interfaces.classes;

public interface Tributavel {
	// em uma interface não é possível criar métodos concretos, todos devem ser abstratos
	// interfaces não são instanciadas 
	// não é necessário colocar "public abstract", pois em uma interface isso já está implicito
	// Atributos sempre: public static final (colocar é opcional na definição do atributo é opcional)
	// Métodos, sempre: public abstract
	// Métodos não possuem corpos(códigos)
	public static final double IMPOSTO = 0.2;
	void calculaImposto();

}
