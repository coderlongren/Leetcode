package lanqiao.org;

import java.util.Scanner;

public class Ñî»ÔÈý½ÇÐÎ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[][] triangle = new int[n][n];
		for (int i = 0; i < n; i++){
			triangle[i][0] = 1;
			triangle[i][i] = 1;
		}
		if (n > 2){
			
			for (int i = 2;i < n;i++){
				for (int j = 1;j < i;j++){
					triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
					
				}
			}
			
		}
		for (int i = 0;i < n; i++){
			for (int j = 0; j <= i; j++){
				System.out.print(triangle[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	

}
