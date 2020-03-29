
import javax.swing.JOptionPane;
public class ExemploArray01 {

	public static void main(String[] args) {
	
		int vetor[] = new int[50];
		int i = 0;
		while(i<vetor.length){
			vetor[i] = i + 100;
			i++;
			
		}
		
		for (int j=0;j<vetor.length;j++){
			System.out.println("Posição["+j+"]="+vetor[j]);
		}
				
			
	}

}
