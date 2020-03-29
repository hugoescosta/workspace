package Q3.teste;

import Q3.classes.Mamifero;
import Q3.classes.Peixe;

public class Zoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Zoo");
		Mamifero camelo = new Mamifero("Camelo","Amarelo","Deserto",150,4,2);
		Peixe tubarao = new Peixe("Tubarão","Cinza","Mar",300,0,1.50f,"Barbatanas e Cauda");
		Peixe p2 = new Peixe();
		Mamifero urso = new Mamifero("Urso-do-Canadá","Vermelho","Terra",180,4,0.5f,"Mel");
		camelo.dados();
		tubarao.dados();
		urso.dados();
		
		

	}

}
