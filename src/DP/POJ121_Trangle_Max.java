package DP;

import java.util.Scanner;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年3月24日 下午9:28:03
* 类说明: 
*/
public class POJ121_Trangle_Max {
	// 存储数组
	static int[][] D = new int[200][200];
	// 记忆数组
	static int[][] max = new int[200][200];
	static int n = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				D[i][j] = scanner.nextInt();
			}
		}
		System.out.println(maxNum(0, 0));
	}
	public static int maxNum (int i, int j) {
		if (max[i][j] != 0) {
			return maxNum(i, j);
		}
		if (i == n - 1) {
			max[i][j] = D[i][j];
		}
		else {
			int x = maxNum(i + 1, j);
			int y = maxNum(i + 1, j + 1);
			max[i][j] = Math.max(x, y) + D[i][j];
		}
		return max[i][j];
	}

}
