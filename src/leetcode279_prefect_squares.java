/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��4��4�� ����1:32:28
* ��˵��: 
*/
public class leetcode279_prefect_squares {
	public static void main(String[] args) {
		System.out.println(numSquares(12));
	}
	public static int numSquares(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        
//        dp[1] = 1;
//        dp[2] = 2;
//        dp[3] = 3;
//        dp[4] = Math.min(dp[4 - 1*1] + 1, dp[4 - 2*2] + 1);
        //  һ����������������أ�
        // dp[i] = min(dp[i - j*j]+1) : (i - j*j) >= 0 && j <= i
        
        
        for (int i = 1; i <= n; i++) {
        	int min = Integer.MAX_VALUE;
        	for (int j = 1; j <= i; j++) {
        		if (i - j*j >= 0) {
        			min = Math.min(min, dp[i - j*j] + 1);
        		}
        	}
        	dp[i] = min;
        }
        return dp[n];
         
    }
	
}
