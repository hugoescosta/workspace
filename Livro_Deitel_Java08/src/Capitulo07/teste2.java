package Capitulo07;

public class teste2 {

	public static void main(String[] args) {

		int[][] a = {{1,3},{6,8},{8}};
		int total = 0;
		for (int row = 0; row < a.length; row++)
		{
			for (int column = 0; column < a[row].length; column++) {
				total += a[row][column];
			}
			System.out.println(total);
		}

		System.out.println(total);



	}

}
