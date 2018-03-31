import java.util.Scanner;


public class leetcode718_LongestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
//		int x = scanner.nextInt();
//		System.out.println(x);
//		System.out.println("abcd".substring(1, 2));
		System.out.println(lengthest_subString2("12321", "32112"));
	}
	 public static  int findLength(int[] A, int[] B) {
		 //DP 思想 same idea of Long Common Substring
		   
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
	 // 同样使用DP解决， 最长字符串问题
	 public static  String lengthest_subString2(String s1, String s2) {
		 int max = 0;
		 char[] charA = s1.toCharArray();
		 char[] charB = s2.toCharArray();
		 int len1 = s1.length();
		 int len2 = s2.length();
		 StringBuffer res = new StringBuffer();
		 int[][] dp = new int[len1 + 1][len2 + 1];
		 for (int i = 1; i <= len1; i++) {
			 for (int j = 1; j <= len2; j++) {
				 if (charA[i - 1] == charB[j - 1]) {
					 dp[i][j] = dp[i - 1][j - 1] + 1;
				 }
				 if (dp[i][j] > max) {
					 max = dp[i][j]; 
					 res = new StringBuffer(s1.substring(i - dp[i][j], i));
				 }
				 
			 }
		 }
		return res.toString();
		    
	 }

}
