
import java.util.Arrays;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年3月20日 上午10:43:33
* 类说明: 
*/
public class leetcode801_Mininum_SwapMakesSequencesIncreasing {
	public static int minSwap(int[] A, int[] B) {
		int[][] dp = new int[9999][9999];
		// dp[i][0] 代表到达i坐标  不交换仍然是有序的
		// dp[i][1] 代表到达i坐标， 交换之后 是有序的
		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp[0].length; j++) {
				dp[i][j] = 9999;
			}
		}
		
		dp[0][0] = 0; // 0 不需要交换 即有序
		dp[0][1] = 1; // 显然， 0坐标， 他们之前没有元素， 就算是交换一次， 仍然是互相都是有序的
		
		// DP过程		
		for (int i = 1; i < A.length; i++) {
			if (A[i - 1] < A[i] && B[i - 1] < B[i]) {
				dp[i][0] = Math.min(dp[i][0], dp[i - 1][0]);
			}
			if (A[i - 1] < A[i] && B[i - 1] < B[i]) {
				dp[i][1] = Math.min(dp[i][1], dp[i - 1][1] + 1);
			}
			if (A[i - 1] < B[i] && B[i - 1] < A[i]) {
				dp[i][0] = Math.min(dp[i][0], dp[i - 1][1]);
			}
			if (A[i - 1] < B[i] && B[i - 1] < A[i]) {
				dp[i][1] = Math.min(dp[i][1], dp[i - 1][0] + 1);
			}
		}
		
		return Math.min(dp[A.length - 1][0], dp[A.length - 1][1]);
		
	}
	public static void main(String[] args) {
		int[] A = {1,3,5,4};
		int[] B = {1,2,3,7};
		System.out.println(minSwap(A, B));
	}

}
