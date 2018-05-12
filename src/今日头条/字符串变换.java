package 今日头条;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年3月28日 上午10:30:35
* 类说明: 
*/
public class 字符串变换 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(editDistance("113", "222"));
	}
	public static int editDistance (String s1, String s2) {
		int len1 = s1.length();
		int len2 = s2.length();
		int[][] dp = new int[len1 + 1][len2 + 1];
		for (int i = 1; i <= len1; i++) {
			dp[i][0] = i; // 把长度为i的字符串变为空串
		}
		for (int j = 1; j <= len2; j++) {
			dp[0][j] = j; // 把空川 变为长度为j的字符串
		}
		
		for (int i = 1; i <= len1; i++) {
			for (int j = 1; j <= len2; j++) {
				// 边界条件, s1[i] == s2[j],
				if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
					dp[i][j] = dp[i - 1][j - 1];
				}
				else {
					dp[i][j] = Math.min(dp[i - 1][j - 1] + 1, Math.min(dp[i - 1][j] + 1, dp[i][j - 1] + 1));
				}
			}
		}
		return dp[len1][len2];
		
	}

}
