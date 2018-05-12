package leetcodeContest83;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年5月6日 上午10:06:35
* 类说明: 
*/
public class leetcode829_Conseccutive_numbers_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println((int)Math.pow(10, 9));
		System.out.println(consectiveNumbersSum(5));
	}
	// 超时的 代码
	public static int consecutiveNumbersSum(int N) {
		int[] dp = new int[N + 1];
		dp[0] = 0;
		for (int i = 1; i <= N; i++) {
			dp[i] = dp[i - 1] + i;
		}
		int sum = 0;
		for (int i = N/2 + 1; i >= 0; i--) {
			for (int j = i; j >= 0; j--) {
				if (dp[i] - dp[j] == N) {
					sum++;
					break;
				}
				if (dp[i] - dp[j] > N) {
					break;
				}
			}
		}
		if (N/2 + 1 < N) {
			sum++;
		}
		return sum;
	}
	public  static int consectiveNumbersSum(int N) {
		long n = 2*N;
		int res = 0;
		for (int i = 1; i < n/i; i++) {
			if (n%i == 0 && (i + n/i)%2 == 1) {
				res++;
			}
		}
		return res;
	} 
}
