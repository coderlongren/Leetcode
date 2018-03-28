package DP;

import java.util.Scanner;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年3月27日 上午10:40:51
* 类说明:  DP算法，重新学习
*/
public class POJ121_Trangle_Max2 {
	// 存储数组
	static int[][] D = new int[200][200];
	// 记忆数组
	static int[][] max = new int[200][200];
	static int[][] dp = new int[200][200];
	static int n = 0;
	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			n = scanner.nextInt();
			for (int i = 0; i < n; i++) {
				for (int j = 0; j <= i; j++) {
					D[i][j] = scanner.nextInt();
				}
			}
			for (int i = 0; i < n; i++) {
				dp[n - 1][i] = D[n - 1][i]; //最后一层 手动赋值
			}
			System.out.println(maxNum());
		}
	// 列出Dp方程， dp[i][j] = dp[i + 1][j] + dp[i + 1][j + 1] 
		public static int maxNum () {
			for (int i = n - 2; i >= 0; i--) {
				for (int j = 0; j <= i; j++) {
					dp[i][j] = Math.max(dp[i + 1][j], dp[i + 1][j + 1]) + D[i][j];
				}
			}
			return dp[0][0];
		}
}
