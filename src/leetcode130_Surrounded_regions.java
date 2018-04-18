/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��4��18�� ����2:36:21
* ��˵��: 
*/
public class leetcode130_Surrounded_regions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// ʹ�ü򵥵� DFS���������������ˡ� 
	// ����˼·�ǣ� �����ܿ�ʼ��ǣ� '0'���ڵ� ȫ�����'*' ��� ɨ��������ά���飬 
	public static void solve(char[][] board) {
	     if (board == null || board.length == 0 || board[0].length == 0) {
	     	 return;
	     }
	     if (board.length < 2 || board[0].length < 2) {
	     	 return;
	     }
	     
	     for (int i = 0; i < board.length; i++) {
	     	 if (board[i][0] == 'O') {
	     		 dfs(board, i, 0);
	     	 }
	     }
	     
	     for (int i = 0; i < board[0].length; i++) {
	     	 if (board[0][i] == 'O') {
	     		 dfs(board, 0, i);
	      	 }
	     }
	     
	     for (int i = 0; i < board.length; i++) {
	     	 if (board[i][board[0].length - 1] == 'O') {
	     	 	 dfs(board, i, board[0].length - 1);
	     	 }
	     }
	     for (int i = 0; i < board[0].length; i++) {
	    	 if (board[board.length - 1][i] == 'O') {
	    		 dfs(board, board.length - 1, i);
	    	 }
	     }
	     
	     // ����ɨ��
	     for (int i = 0; i < board.length; i++) {
	    	 for (int j = 0; j < board[0].length; j++) {
	    		 if (board[i][j] == 'O') {
	    			 board[i][j] = 'X';
	    		 }
	    		 if (board[i][j] == '*') {
	    			 board[i][j] = 'O';
	    		 }
	    	 }
	     }

	     
	}
	// ���ѵĹ���
	public static void dfs(char[][] board, int x, int y) {
		if (board[x][y] == 'O') {
			board[x][y] = '*'; // ��o�� ��Ϊ
		}
		if (x > 1 && board[x - 1][y] == 'O') {
			dfs(board, x - 1, y);
		}
		if (x < board.length - 2 && board[x + 1][y] == 'O') {
			dfs(board, x + 1, y);
		}
		if (y > 1 && board[x][y - 1] == 'O') {
			dfs(board, x, y - 1);
		}
		if (y < board[0].length - 2 && board[x][y + 1] == 'O') {
			dfs(board, x, y + 1);
		}
	}
	
}
