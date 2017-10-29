package contest56week;

public class leetcode_LongSubarrayBest {

	public static void main(String[] args) {
		
		int[] A = {1,2,3,4,5};
		int[] B = {3,4,5,9,7};
		System.out.println(findLength(A, B));
		
		
	}
	 public static  int findLength(int[] A, int[] B) {
		 //DP ЛјПл same idea of Long Common Substring
		 
		 int len1 = A.length;
		 int len2 = B.length;
		 int[][] dp = new int[len1 + 1][len2 + 1];
		 int max = 0;
		 for (int i = 1;  i<= A.length; i++){
			 for (int j = 1; j <= B.length; j++){
					if (A[i - 1] == B[j - 1]){
						dp[i][j] = dp[i - 1][j - 1] + 1;
						max = Math.max(max, dp[i][j]);
					}
				}
		 }
		return max;
		 
		 
	 }
	 
}
