import java.util.Arrays;

import javax.swing.JOptionPane;
public class ExemploArray03 {

	public static void main(String[] args) {
		
		String nomes[] = new String[10];


		for (int i=0;i<nomes.length;i++){
			nomes[i] = JOptionPane.showInputDialog("Digite o "+(i+1)+"º numero:");
		}
		Arrays.sort(nomes);
		for (int i=0;i<nomes.length;i++){
			System.out.println(nomes[i]);
			JOptionPane.showMessageDialog(null, nomes[i]);
		}
		

	}

}
