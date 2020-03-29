package estacio.pgii.data19022020;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.swing.JOptionPane;

public class ExercicioPalavraDuplicada {

	public static void main(String[] args) {
		List<String> nomes = new LinkedList<String>();
		int resp = 0;
		int repetidos = 0;
		
		while(resp == 0) {
			nomes.add(JOptionPane.showInputDialog(null,"Digite um nome para a lista: "));
			resp = (JOptionPane.showConfirmDialog(null, "Deseja continuar?"));
		}
		System.out.println("depois do while");
		Map<String, Integer> map = new TreeMap<String, Integer>();
		
		for ( String nome : nomes ) {
			Integer count = map.get(nome);
			if(count == null) {
				count = 0;
			}
		}
		
		for (String nome : map.keySet()) {
			System.out.printf("O nome %s se repetiu %s vezes", nome, map.get(nome));
		}
		
		
	}
}
