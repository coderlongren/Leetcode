package һ����У����Ŀ;

import java.util.Scanner;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��8��25�� ����6:05:50
* ��˵��: 
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
