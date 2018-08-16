/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��3��30�� ����4:09:13
* ��˵��: 
*/
public class leetcode063_Unique_Path2 {
	 public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
		 int m = obstacleGrid.length;
		 int n = obstacleGrid[0].length;
		 int[][] dp = new int[m][n];
		 if (obstacleGrid[0][0] == 1) {
			 dp[0][0] = 0;
		 }
		 else {
			 dp[0][0] = 1;
		 }
//		 for (int i = 0; i < m; i++) {
//			 for (int j = 0; j < n; j++) {
//				 // �ϰ�� ֱ��DP[i][j] = 0
//				 if (obstacleGrid[i][j] == 1) {
//					 dp[i][j] = 0;
//				 }
//			 }
//		 }
		 for (int i = 1; i < m; i++) {
			 if (obstacleGrid[i][0] == 1) {
				 dp[i][0] = 0;
			 }
			 else {
				 dp[i][0] = dp[i - 1][0];
			 }
		 }
		 for (int i = 1; i < n; i++) {
			 if (obstacleGrid[0][i] == 1) {
				 dp[0][i] = 0;
			 }
			 else {
				 dp[0][i] = dp[0][i - 1];
			 }
		 }
		 for (int i = 1; i < m; i++) {
			 for (int j = 1; j < n; j++) {
				 if (obstacleGrid[i][j] == 1) {
					 dp[i][j] = 0;
				 }
				 else {
					 dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
				 }
			 }
		 }
		return dp[m - 1][n - 1];
	 }
	 public static void main(String[] args) {
		 int[][] obstacleGrid = {{0,0,0},{0,1,0},{0,0,0}};
		 System.out.println(uniquePathsWithObstacles(obstacleGrid));
	}
}