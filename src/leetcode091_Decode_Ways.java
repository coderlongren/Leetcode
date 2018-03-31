/**
* @author 作者 : coderlong
* @version 创建时间：2018年3月30日 下午9:40:30
* 类说明: 
*/
public class leetcode091_Decode_Ways {
	public static void main(String[] args) {
		System.out.println(numDecodings("12222222"));
	}
	public static int numDecodings(String s) {
		if (s == null || s.length() == 0) {
			return 0;
		}
		int n  = s.length();
		int[] dp = new int[n + 1];
		dp[0] = 1;
		dp[1] = s.charAt(0) != '0' ? 1 : 0;
		for (int i = 2; i <= n; i++) {
			int first = Integer.valueOf(s.substring(i - 1, i));
			int second = Integer.valueOf(s.substring(i - 2, i));
			if (Integer.valueOf(first) <= 9 && Integer.valueOf(first) > 0) {
				dp[i] += dp[i - 1];
			}
			if (Integer.valueOf(second) > 9 && Integer.valueOf(second) <= 26) {
				dp[i] += dp[i - 2];
			}
		}
		return dp[n];
    }
}
