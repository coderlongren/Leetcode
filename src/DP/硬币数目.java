package DP;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��4��5�� ����11:19:49
* ��˵��:  ��ΪOJ������Ŀ��Ҳ���Լ�����������������Ե��ǵ��⣬��ʱû������
*/
public class Ӳ����Ŀ {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			System.out.println(coin_count(i));
		}
	}
	public static int coin_count (int n) {
		int[] coins = {1,2,5};
		int[] dp = new int[100000];
		dp[0] = 1;
		for (int i = 0; i < coins.length; i++) {
			for (int j = coins[i]; j <= n; j++) {
				dp[j] = dp[j] + dp[j - coins[i]];
			}
		}
		return dp[n];
	}
}
