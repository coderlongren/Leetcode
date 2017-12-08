package com.coderlong.DP;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[][] array = new int[n+1][n+1];
		int[][] countSum = new int[n+1][n+1];
		
		for (int i = 1; i <= n;i++){
			for (int j = 1; j <= i;j++){
				array[i][j] = scanner.nextInt();
			}
		}
		System.out.println(MaxSum(array, 1, 1));
		
	}
	public static int MaxSum(int[][] array,int i,int j){
		if (i == array.length - 1){
			return array[i][j];
		}
		return Math.max(MaxSum(array, i + 1, j + 1), MaxSum(array, i+1, j)) + array[i][j];
	}
	

}
