package com.coderlong.DP;

import java.util.Scanner;

public class triangle_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Integer.toBinaryString(4));
		System.out.println(Integer.valueOf("1000", 2));
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[][] array = new int[n+1][n+1];
		int[][] countSum = new int[n+1][n+1];
		for (int i = 1; i <= n;i++){
			for (int j = 1; j <= i;j++){
				array[i][j] = scanner.nextInt();
				
			}
		}
		System.out.println(MaxSum(array, 1, 1,countSum));
		
	}
	public static int MaxSum(int[][] array,int i,int j,int[][] countSum){
		if (countSum[i][j] != 0){
			return countSum[i][j];
		}
		if (i == array.length - 1){
			return array[i][j];
		}
		countSum[i][j] = Math.max(MaxSum(array, i + 1, j + 1,countSum), MaxSum(array, i+1, j,countSum)) + array[i][j];
		return countSum[i][j];
	}
	

}
