package br.com.abc.introducao;

public class Arrays6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] aaint = {1,2,3};
		int[] arrint2 = new int[2];
		int[] arrint3 = new int[]{1,2,3};
		
		
		//int[][] dias = new int[3][];
		//dias [0] = new int[2];
		//dias [1] = new int[]{1,2,3};
		//dias [2] = new int[4];
		
		int[][] dias = {{0,0},{1,2,3},{0,0,0,0}};
		
		for(int[] arr : dias){
			for(int num : arr){
				System.out.print(num);
			}
		}
		
		

	}

}
