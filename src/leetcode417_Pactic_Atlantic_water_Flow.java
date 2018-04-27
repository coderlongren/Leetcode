import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年4月25日 下午10:05:50
* 类说明: 
*/
public class leetcode417_Pactic_Atlantic_water_Flow {
	int[][] dics = new int[][]{{1,0}, {0,1},{-1,0}, {0,-1}};
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//  这道题明显是可以使用 BFS 或者DFS 来做的，
	// 第一种我才用 广搜
	public List<int[]> pacificAtlantic(int[][] matrix) {
		List<int[]> res = new ArrayList<>();
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
			return res;
		}
		int rows = matrix.length;
		int cols = matrix[0].length;
		boolean[][] pacific =  new boolean[rows][cols]; // 记录 可以到达 pacific
		boolean[][] atlantic = new boolean[rows][cols]; // 记录可以到达 atlantic
		Stack<int[]> visitPac = new Stack<>();
		Stack<int[]> visitAtlan = new Stack<>();
		for (int i = 0; i < rows; i++) {
			pacific[i][0] = true;
			visitPac.push(new int[]{i,0});
			atlantic[i][cols - 1] = true;
			visitAtlan.push(new int[]{i,cols - 1});
		}
		for (int j = 0; j < cols; j++) {
			pacific[0][j] = true;
			visitPac.push(new int[]{0,j});
			atlantic[rows - 1][j] = true;
			visitAtlan.push(new int[]{rows - 1, j});
		}
		bfs(matrix, visitPac, pacific);
		bfs(matrix, visitAtlan, atlantic);
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (pacific[i][j] && atlantic[i][j]) {
					res.add(new int[]{i,j});
				}
			}
		}
		return res;
	}
	public void bfs(int[][] matrix, Stack<int[]> stack, boolean[][] visited) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		while (!stack.isEmpty()) {
			int[] idx = stack.pop();
			for (int[] dic:dics) {
				int x = idx[0] + dic[0];
				int y = idx[1] + dic[1];
				if (x < 0 || x >= rows || y < 0 || y >= cols || visited[x][y] || matrix[x][y] < matrix[idx[0]][idx[1]]) {
					continue;
				}
				visited[x][y] = true;
				stack.push(new int[]{x,y});
			}
		}
	}
	
	

}
