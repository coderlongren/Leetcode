/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��3��31�� ����1:32:20
* ��˵��: 
*/
public class leetcode096_Unique_binary_Search_Trees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(numTrees(3));
	}
	// ���������е�ʹ�ã���ǰ��֪����
	public static int numTrees(int n) {
		if (n <= 0) {
			return 0;
		}
	    int[] dp = new int[n + 1];
	    dp[0] = 1; // ��BSTҲ���� 1 
	    dp[1] = 1; //
	    for (int i = 2; i <= n; i++) {
	    	for (int j = 0; j < i; j++) {
	    		dp[i] += (dp[j]*dp[i - j - 1]);
	    	}
	    }
	    return dp[n];
	}
}
