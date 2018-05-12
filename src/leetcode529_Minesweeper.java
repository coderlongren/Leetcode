import java.awt.Window;
import java.awt.event.MouseWheelEvent;
import java.util.LinkedList;
import java.util.Queue;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��5��5�� ����12:50:46
* ��˵��: 
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
		// ̽�⵽��û�нҿ���  ��
		if (board[x][y] == 'M') {
			board[x][y] = 'X';
			return;
		}
		// �Ѿ����ҿ��� �� M �� E, ֱ�ӷ���
		if (board[x][y] != 'E') {
			return;
		}
		visit[x][y] = true;
		// �ҿ���һ�� �����׵Ŀյأ� ����������
		int mines = 0; // ���ܵ�����
		for (int[] dic : dics) {
			int x1 = x + dic[0];
			int y1 = y + dic[1];
			if (x1 < 0 || x1 >= rows || y1 < 0 || y1 >= cols) {
				continue; // Խ��
			}
			if (board[x1][y1] == 'M') {
				mines++;
			}
		}
		if (mines == 0) {
			board[x][y] = 'B';
			// x, y ��Χû����
			for (int[] dic : dics) {
				int x1 = x + dic[0];
				int y1 = y + dic[1];
				if (x1 < 0 || x1 >= rows || y1 < 0 || y1 >= cols || visit[x1][y1]) {
					continue; // Խ��
				}
				dfs(board, visit, x1, y1);
			}
		}
		else {
			board[x][y] = (mines + "").charAt(0);
		}
	}
	// �����������
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
			// ̽�⵽��û�нҿ���  ��
			if (board[x][y] == 'M') {
				board[x][y] = 'X';
				continue;
			}
			// �Ѿ����ҿ��� �� M �� E, ֱ�ӷ���
			if (board[x][y] != 'E') {
				continue;
			}
			visit[x][y] = true;
			int mines = 0; // ����Ŀ
			for (int[] dic : dics) {
				int x1 = x + dic[0];
				int y1 = y + dic[1];
				if (x1 < 0 || x1 >= rows || y1 < 0 || y1 >= cols) {
					continue; // Խ��
				}
				if (board[x1][y1] == 'M') {
					mines++;
				}
			}
			if (mines == 0) {
				board[x][y] = 'B';
				// x, y ��Χû����
				for (int[] dic : dics) {
					int x1 = x + dic[0];
					int y1 = y + dic[1];
					if (x1 < 0 || x1 >= rows || y1 < 0 || y1 >= cols || visit[x1][y1]) {
						continue; // Խ��
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
