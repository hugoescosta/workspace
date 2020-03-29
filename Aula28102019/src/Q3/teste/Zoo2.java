package Q3.teste;

import javax.swing.JOptionPane;

import java.util.ArrayList;

import Q3.classes.Mamifero;
import Q3.classes.Peixe;

public class Zoo2 {
	public static void main(String[] args){
		String nome, cor, ambiente, caracteristica, alimento;
		int comprimento, patas;
		float velocidade;
		int contador = 0;
		String especie ;
		char caractere;
		boolean v = true;
		ArrayList<Peixe> peixe = new ArrayList<Peixe>();
		ArrayList<Mamifero> mamifero = new ArrayList<Mamifero>();
		
		
		while (v){
			especie = JOptionPane.showInputDialog("Qual a espécie do animal, (P)eixe ou (M)amífero?"); 			
			if (especie.contentEquals("PEIXE")){
				for (int i = 0 ; i < 1; i++){
					Peixe p = new Peixe();
					peixe.add(p);
				}
			}else if( especie.contentEquals("MAMIFERO")){
				for (int i = 0 ; i < 1; i++){
					Mamifero m = new Mamifero();
					mamifero.add(m);
				}
			} else {
				JOptionPane.showMessageDialog(null, "Opção inválida, digite 'PEIXE' ou 'MAMIFERO'");
			}
			int continua = JOptionPane.showConfirmDialog(null,"Cadastrar outro animal?", "Responda",JOptionPane.YES_NO_OPTION);
			if(continua == 1){ //Se o usuário escolher não
				v = false;
			}else{
				v = true;
			}
		}
		for (int i = 0 ; i < peixe.size() ; i++ ){
			JOptionPane.showMessageDialog(null, peixe.get(i).getNome()+"\n"+peixe.get(i).getCor()+"\n=-=-=-=-=-=-=-=-=-=-=\n"+mamifero.get(i).getNome()+"\n"+mamifero.get(i).getCor()+"\n");
			//JOptionPane.showMessageDialog(null, mamifero.get(i).getNome()+"\n"+mamifero.get(i).getCor());
		}
		//for (int i = 0 ; i < mamifero.size() ; i++ ){
			//JOptionPane.showMessageDialog(null, mamifero.get(i).getNome()+"\n"+mamifero.get(i).getCor());
		//}

		
		/*System.out.println("Zoo");
		Mamifero camelo = new Mamifero("Camelo","Amarelo","Deserto",150,4,2);
		Peixe tubarao = new Peixe("Tubarão","Cinza","Mar",300,0,1.50f,"Barbatanas e Cauda");
		Mamifero urso = new Mamifero("Urso-do-Canadá","Vermelho","Terra",180,4,0.5f,"Mel");
		camelo.dados();
		tubarao.dados();
		urso.dados();*/
		
		
	}
}
