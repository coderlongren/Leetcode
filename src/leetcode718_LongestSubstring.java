import java.util.Scanner;


public class leetcode718_LongestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		System.out.println(x);
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
