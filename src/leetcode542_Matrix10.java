import java.util.LinkedList;
import java.util.Queue;


/**
* @author 作者 : coderlong
* @version 创建时间：2018年5月1日 下午12:01:57
* 类说明:   前面这道题 用DFS 写了他妈一个小时 最后还是 有BUG 还没找到
*   看了 大佬的答案 原来用 BFS 是最简单的算法
*/
public class leetcode542_Matrix10 {
	public static  int[][] dics = {{0,-1},{0,1},{1,0},{-1,0}};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix= {{0,0,0},{0,1,0},{1,1,1}};
		for (int[] i : updateMatrix(matrix)) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
	}
	public static  int[][] updateMatrix(int[][] matrix) {
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
			return  new int[][]{};
		}
		int rows = matrix.length;
		int cols = matrix[0].length;
		int[][] res = new int[rows][cols];
		Queue<Integer[]> queue = new LinkedList<>();
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (matrix[i][j] == 0) {
					queue.offer(new Integer[]{i,j});
					res[i][j] = 0;
				}
				else {
					res[i][j] = Integer.MAX_VALUE;
				}
			}
		}
		while (!queue.isEmpty()) {
			Integer[] temp = queue.poll();
			for (int[] dic : dics) {
				int x = temp[0] + dic[0];
				int y = temp[1] + dic[1];
				 // 第一次做的错误点 ，忘记了吧 res矩阵 和 matrix矩阵对换
				if (x < 0 || x >= rows || y < 0 || y >= cols || res[x][y] <= res[temp[0]][temp[1]]) {
					continue;
				}
				res[x][y] = res[temp[0]][temp[1]] + 1;
				queue.offer(new Integer[]{x,y});
			}
		}
		return res;
	}
}
