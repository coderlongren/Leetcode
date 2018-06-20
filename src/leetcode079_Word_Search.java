/**
* @author 作者 : coderlong
* @version 创建时间：2018年5月21日 下午10:07:40
* 类说明: 
*/
public class leetcode079_Word_Search {
	public static int[][] dics = {{0,1},{0,-1},{-1,0},{1,0}};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] board = {{'A','B','C','E'},
						{'S','F','C','S'},
						{'A','D','E','E'}};
		System.out.println(exist(board, "ES"));
	}
	public static boolean exist(char[][] board, String word) {
	    if (board == null || board.length == 0 || board[0].length == 0) {
	    	return false;
	    }
	    boolean[][] visit = new boolean[board.length][board[0].length];
	    for (int x = 0; x < board.length; x++) {
	    	for (int y = 0; y < board[x].length; y++) {
	    		if (dfs(x, y, board, word.toCharArray(), 0, visit)) {
	    			return true;
	    		}
	    	}
	    }
	    return false;
	}
	public static boolean dfs(int x, int y, char[][] board, char[] word, int len, boolean[][] visit) {
		int rows = board.length;
		int cols = board[0].length;
		if (x < 0 || x >= rows || y < 0 || y >= cols || visit[x][y] || board[x][y] != word[len]) {
			return false;
		}
		if (len == word.length - 1 && word[len] == board[x][y]) {
			return true;
		}
		visit[x][y] = true;
		boolean exit = false;
		for (int[] dic : dics) {
			if (dfs(x + dic[0], y + dic[1], board, word, len + 1, visit)) {
				exit = true;
				break;
			}
		}
		visit[x][y] = false;
		return exit;
	}

}
