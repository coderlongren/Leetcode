/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��3��30�� ����8:47:25
* ��˵��: 
*/
public class leetcode064_Minimum_Path_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = {{1,3,1}, {1,5,1}, {4,2,1}};
		System.out.println(minPathSum2(grid));
	}
	public static int minPathSum(int[][] grid) {
		if (grid == null || grid.length == 0) {
			return 0;
		}
		return  minPath(grid, grid.length - 1, grid[0].length - 1);
	}
	// ջ����� ��Ҫ����辶
	public static int minPath (int[][] grid, int x, int y) {
		if ((x - 1) >= 0 && (y - 1) >= 0) {
			return grid[x][y] + Math.min(minPath(grid, x - 1, y), minPath(grid, x, y - 1));
		}
		else if ((x - 1) >= 0) {
			return grid[x][y] + minPath(grid, x - 1, y);
		}
		else if ((y - 1) >= 0){
			return grid[x][y] + minPath(grid, x, y - 1);
		}
		else {
			return grid[x][y];
		}
	}
	// ����ʹ��һ�������������� �Ѿ�����AC��,�������鲢û����ô��
	public static int minPathSum2(int[][] grid) {
		if (grid == null || grid.length == 0) {
			return 0;
		}
		int m = grid.length;
		int n = grid[0].length;
		int[][] dp = new int[m][n];
		dp[0][0] = grid[0][0];
		// ��һ��DP��ֵ
		for (int i = 1; i < m; i++) {
			dp[i][0] = dp[i - 1][0] + grid[i][0];
		}
		// ��һ��DP��ֵ
		for (int i = 1; i < n; i++) {
			dp[0][i] = dp[0][i - 1] + grid[0][i];
		}
		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
			}
		}
		return dp[m - 1][n - 1];
		
	}

}
