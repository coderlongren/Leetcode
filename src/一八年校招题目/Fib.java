package 一八年校招题目;

import java.util.Scanner;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年8月25日 下午6:05:50
* 类说明: 
*/
public class Fib {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] dp = new int[100];
		dp[1] = 1;
		dp[2] = 2;
		for (int i = 3; i <= 50; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		System.out.println(dp[n]);
	}
}
