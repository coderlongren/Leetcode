package DP;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年6月24日 下午2:11:37
* 类说明: 
*/
public class LSC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(LCS("ababc", "acabc"));
	}
	public static int LCS(String s1, String s2) {
		int[][] dp = new int[s2.length() + 1][s1.length() + 1];
		dp[0][0] = 0;
		int max = Integer.MIN_VALUE;
		for (int i = 1; i < dp.length; i++) {
			dp[i][0] = 0;
		}
		for (int j = 1; j < dp[0].length; j++) {
			dp[0][j] = 0;
		}
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				if (s1.charAt(j - 1) == s2.charAt(i - 1)) {
					dp[i][j] = dp[i - 1][j - 1] + 1;
					max = Math.max(max, dp[i][j]);
				}
			}
		}
		return max;
	} 

}
