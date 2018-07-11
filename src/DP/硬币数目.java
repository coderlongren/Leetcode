package DP;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年4月5日 下午11:19:49
* 类说明:  华为OJ经典题目，也是自己在链家网宣讲会笔试的那道题，当时没做出来
*/
public class 硬币数目 {
	public static void main(String[] args) {
//		for (int i = 1; i < 10; i++) {
//			System.out.println(coin_count(i));
//		}
		System.out.println(coin_count(5));
		System.out.println(minZuhe(5));
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
	// 求组合成一个数目的， 最小钱币数，例如 [1,2,5] 5--> 1(5) ; 4-->2(2,2); 3--2(2,1)   
	public static int minZuhe(int n) {
		int[] coins = {1,2,5};
		int[] dp = new int[n + 1];
		dp[0] = 0; //  最初的状态
		
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < coins.length; j++) {
				if (i >= coins[j]) {
					dp[i] = Math.min(i, dp[i - coins[j]] + 1);
				}
			}
		}
		return dp[n];
	}
}
