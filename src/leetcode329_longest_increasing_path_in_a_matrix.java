/**
* @author 作者 : coderlong
* @version 创建时间：2018年4月23日 下午9:37:42
* 类说明: 
*/
public class leetcode329_longest_increasing_path_in_a_matrix {
	public static int[][] cache;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] nums = {{3,4,5},{3,2,6},{2,2,1}};
		System.out.println(longestIncreasingPath(nums));
	}
	 public static int longestIncreasingPath(int[][] matrix) {
		 if (matrix == null || matrix.length == 0) {
			 return 0;
		 } 
		 int rows = matrix.length;
		 int cols = matrix[0].length;
		 int res = 1;
		 cache = new int[rows][cols];
		 for (int i = 0; i < rows; i++) {
			 for (int j = 0; j < cols; j++) {
				 res = Math.max(res, dfs(i, j, rows, cols, cache,matrix));
			 }
		 }
		 return res;
		 
	 }
	 public static int dfs(int x, int y, int rows, int cols, int[][] cache, int[][] matrix) {
		 if (cache[x][y] > 0) {
			 return cache[x][y];
		 }
		 int k = 1;
		 if (bound(x + 1, y, rows, cols) && matrix[x + 1][y] < matrix[x][y]) {
			 k = Math.max(k, 1 + dfs(x + 1, y, rows, cols, cache, matrix)); 
		 }
		 if (bound(x - 1, y, rows, cols) && matrix[x - 1][y] < matrix[x][y]) {
			 k = Math.max(k, 1 + dfs(x - 1, y, rows, cols, cache,matrix));
		 }
		 if (bound(x, y + 1, rows, cols) && matrix[x][y + 1] < matrix[x][y]) {
			 k = Math.max(k, 1 + dfs(x, y + 1, rows, cols, cache,matrix));
		 }
		 if (bound(x, y - 1, rows, cols) && matrix[x][y - 1] < matrix[x][y]) {
			 k = Math.max(k, 1 + dfs(x, y - 1, rows, cols, cache,matrix));
		 }
		 cache[x][y] = k;
		 return k;
	 }
	 public static boolean bound(int x, int y, int rows, int cols) {
		 return x < rows && x >= 0 && y < cols && y >= 0; 
	 }

}
