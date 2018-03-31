/**
* @author 作者 : coderlong
* @version 创建时间：2018年3月30日 下午3:34:13
* 类说明: 
*/
public class leetcode062_Unique_paths {
	 public  int res = 0;
	 public  int uniquePaths(int m, int n) {
		 search(m, n, 1, 1);
		 return res;
	 }
	 // 这样搜索的话，一下子就超时了
	 public  void search(int m, int n, int x, int y) {
		 if (x == m && y == n) {
			 res++;
		 }
		 if ((x + 1) <= m) {
			 search(m, n, x + 1, y);
		 }
		 if ((y + 1) <= n) {
			 search(m, n, x, y + 1);
		 }
	 }
	 public static int search2(int m, int n) {
		 int[][] dp = new int[m][n];
		 dp[0][0] = 1;
		 for (int i = 1; i < m; i++) {
			 dp[i][0] = 1;
		 }
		 for (int i = 1; i < n; i++) {
			 dp[0][i] = 1;
		 }
		 for (int i = 1; i < m; i++) {
			 for (int j = 1; j < n; j++) {
				 dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
			 }
		 }
		 return dp[m - 1][n - 1];
	 }
	 public static void main(String[] args) {
		 System.out.println(search2(3,7));
	}
}
