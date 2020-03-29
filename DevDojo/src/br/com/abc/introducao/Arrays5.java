package br.com.abc.introducao;

public class Arrays5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] dias = new int[2][2];
		dias[0][0] = 30;
		dias[0][1] = 31;
		dias[1][0] = 29;
		dias[1][1] = 28;
		
		
		for(int i = 0;i < dias.length ; i++){
			//System.out.println(dias[i]);
			for(int x = 0;x < dias[i].length ; x++){
				System.out.println(dias[i][x]);
			}
		}
		
		for( int[] ref : dias){
			//System.out.println(ref);
			for( int dia : ref){
				System.out.println(dia);
				
			}
			
			
		}

	}

}
