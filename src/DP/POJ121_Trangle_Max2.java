package DP;

import java.util.Scanner;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��3��27�� ����10:40:51
* ��˵��:  DP�㷨������ѧϰ
*/
public class POJ121_Trangle_Max2 {
	// �洢����
	static int[][] D = new int[200][200];
	// ��������
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
				dp[n - 1][i] = D[n - 1][i]; //���һ�� �ֶ���ֵ
			}
			System.out.println(maxNum());
		}
	// �г�Dp���̣� dp[i][j] = dp[i + 1][j] + dp[i + 1][j + 1] 
		public static int maxNum () {
			for (int i = n - 2; i >= 0; i--) {
				for (int j = 0; j <= i; j++) {
					dp[i][j] = Math.max(dp[i + 1][j], dp[i + 1][j + 1]) + D[i][j];
				}
			}
			return dp[0][0];
		}
}
