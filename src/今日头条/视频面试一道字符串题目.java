package 今日头条;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年4月19日 下午8:44:20
* 类说明: 
*/
public class 视频面试一道字符串题目 {
	public static void main(String[] args) {
		// 面试的时候，在文本编辑器写的有bug, 数组下标溢出，
		// 结束后我还特地下面又写了一下，很完美啊， 还好面试官没在意
		String string = "10101101011101";
		int[] dp = new int[string.length()];
		int res = Integer.MIN_VALUE;
		int k = 4;
		for (int i = 0; i < k; i++) {
			if (string.charAt(i) == '1') {
				dp[k - 1]++;
			}
		}
		for (int i = k; i < string.length(); i++) {
			if (string.charAt(i) == '1') {
				if (string.charAt(i - k) == '1') {
					dp[i] = dp[i - 1];
					res = Math.max(res, dp[i]);
				}
				else {
					dp[i] = dp[i - 1] + 1;
					res = Math.max(res, dp[i]);
				}
			}
			else {
				if (string.charAt(i - k) == '1') {
					dp[i] = dp[i - 1] - 1;
					res = Math.max(res, dp[i]);
				}
				else {
					dp[i] = dp[i - 1];
					res = Math.max(res, dp[i]);
				}
			}
		}
		System.out.println(res);
		
	}
}
