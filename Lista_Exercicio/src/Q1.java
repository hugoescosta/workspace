
public class Q1 {
	
	public static void main(String[] args) {
		
		double numAleatorio;
		
		
		for (int i=1;i<=50;i++){
			numAleatorio = Math.random()*100;
			//System.out.println(i+"º Número sorteado: "+Math.ceil(numAleatorio));
			
			System.out.println(i+"º Número sorteado: "+(int) numAleatorio);
		}
	}

}
