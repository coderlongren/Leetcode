import java.awt.Window;
import java.awt.event.MouseWheelEvent;
import java.util.LinkedList;
import java.util.Queue;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年5月5日 下午12:50:46
* 类说明: 
*/
public class leetcode529_Minesweeper {
	public int[][] dics = {{0,1}, {0,-1}, {1,0}, {-1,0}, {1,1}, {1,-1}, {-1,1}, {-1,-1}};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] board = {{'E','E','E','E','E'},
				{'E','E','M','E','E'},
				{'E','E','E','E','E'},
				{'E','E','E','E','E'}};
		int[] clicks = {3,0};
		leetcode529_Minesweeper test = new leetcode529_Minesweeper();
		test.updateBoard2(board, clicks);
	}
	public char[][] updateBoard(char[][] board, int[] click) {
		if (board == null || board.length == 0 || board[0].length == 0) {
			return board; 
		}
		int rows = board.length;
		int cols = board[0].length;
		boolean[][] visit = new boolean[rows][cols];
		dfs(board, visit, click[0], click[1]);
		return board;
	}
	public void dfs(char[][] board, boolean[][] visit, int x, int y) {
		int rows = board.length;
		int cols = board[0].length;
		// 探测到了没有揭开的  雷
		if (board[x][y] == 'M') {
			board[x][y] = 'X';
			return;
		}
		// 已经被揭开了 非 M 非 E, 直接返回
		if (board[x][y] != 'E') {
			return;
		}
		visit[x][y] = true;
		// 揭开了一个 不是雷的空地， 向四周搜索
		int mines = 0; // 四周的雷数
		for (int[] dic : dics) {
			int x1 = x + dic[0];
			int y1 = y + dic[1];
			if (x1 < 0 || x1 >= rows || y1 < 0 || y1 >= cols) {
				continue; // 越界
			}
			if (board[x1][y1] == 'M') {
				mines++;
			}
		}
		if (mines == 0) {
			board[x][y] = 'B';
			// x, y 周围没有雷
			for (int[] dic : dics) {
				int x1 = x + dic[0];
				int y1 = y + dic[1];
				if (x1 < 0 || x1 >= rows || y1 < 0 || y1 >= cols || visit[x1][y1]) {
					continue; // 越界
				}
				dfs(board, visit, x1, y1);
			}
		}
		else {
			board[x][y] = (mines + "").charAt(0);
		}
	}
	// 广度优先搜索
	public char[][] updateBoard2(char[][] board, int[] click) {
		if (board == null || board.length == 0 || board[0].length == 0) {
			return board; 
		}
		int rows = board.length;
		int cols = board[0].length;
		boolean[][] visit = new boolean[rows][cols];
		Queue<int[]> queue = new LinkedList<>();
		queue.offer(new int[]{click[0], click[1]});
		while (!queue.isEmpty()) {
			int[] poll = queue.poll();
			int x = poll[0];
			int y = poll[1];
			// 探测到了没有揭开的  雷
			if (board[x][y] == 'M') {
				board[x][y] = 'X';
				continue;
			}
			// 已经被揭开了 非 M 非 E, 直接返回
			if (board[x][y] != 'E') {
				continue;
			}
			visit[x][y] = true;
			int mines = 0; // 雷数目
			for (int[] dic : dics) {
				int x1 = x + dic[0];
				int y1 = y + dic[1];
				if (x1 < 0 || x1 >= rows || y1 < 0 || y1 >= cols) {
					continue; // 越界
				}
				if (board[x1][y1] == 'M') {
					mines++;
				}
			}
			if (mines == 0) {
				board[x][y] = 'B';
				// x, y 周围没有雷
				for (int[] dic : dics) {
					int x1 = x + dic[0];
					int y1 = y + dic[1];
					if (x1 < 0 || x1 >= rows || y1 < 0 || y1 >= cols || visit[x1][y1]) {
						continue; // 越界
					}
					// 
					queue.offer(new int[]{x1,y1});
				}
			}
			else {
				board[x][y] = (mines + "").charAt(0);
			}
			
		}
		return board;
	}

}
