import java.util.ArrayList;
import java.util.List;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年4月27日 下午2:59:28
* 类说明: 
*/
public class leetcode417_Pactic_Atlantic_water_Flow2 {
	public int[][] dics = {{1,0}, {-1,0}, {0,1}, {0,-1}};
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public List<int[]> pacificAtlantic(int[][] matrix) {
		List<int[]> res = new ArrayList<>();
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
			return res;
		}
		int rows = matrix.length;
		int cols = matrix[0].length;
		
		boolean[][] pacific = new boolean[rows][cols];
		boolean[][] atlantic = new boolean[rows][cols];
		// 用Integer.MIN_VALUE 来访问 四周边界元素， 保证四周元素绝对可以流向visit海域
		for (int i = 0; i < rows; i++) {
			dfs(matrix, Integer.MIN_VALUE, i, 0, pacific);
			dfs(matrix, Integer.MIN_VALUE, i, cols - 1, atlantic);
		}
		for (int j = 0; j < cols; j++) {
			dfs(matrix, Integer.MIN_VALUE, 0, j, pacific);
			dfs(matrix, Integer.MIN_VALUE, rows - 1, j, atlantic);
		}
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (pacific[i][j] && atlantic[i][j]) {
					res.add(new int[]{i,j});
				}
			}
		}
		return res;
	}
	public void dfs(int[][] matrix, int height, int x, int y, boolean[][]visit) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		// x y 为坐标， 需先判断是否符合要求
		if (x <0 || x >= rows || y < 0 || y >= cols || visit[x][y] || matrix[x][y] < height) {
			return ;
		}
		visit[x][y] = true; // (x,y) 可以流向visit海域
		for (int[] cur : dics) {
			dfs(matrix, matrix[x][y], x + cur[0], y + cur[1], visit);
		}
	}

}
