import java.util.HashSet;
import java.util.Set;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年2月1日 下午10:50:17
* 类说明: 如何求解一个简单的数独？
*/
public class leetcode036_Valid_Sudoku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean isValidSudoku(char[][] board) {
		// 这道题想了很久，觉得解法太奇妙了。
		// 原理是 如何检查每一行，每一列，每一个小的九方格的 重复情况
		for (int i = 0; i < 9; i++) {
			Set<Character> rowSet = new HashSet<>();
			Set<Character> colSet = new HashSet<>();
			Set<Character> suduSet = new HashSet<>();
			
			for (int j = 0; j < 9; j++) {
				if (board[i][j] != '.' && !rowSet.add(board[i][j])) {
					return false;
				}
				if (board[j][i] != '.' && !colSet.add(board[j][i])) {
					return false;
				}
				// 这里的这个 sudu_row  sudu_col代表的就是 第0-8小数独的行数，列数
				int sudu_row = i/3*3 + j/3;
				int sudu_col = i%3*3 + j%3;
				if (board[sudu_row][sudu_col] != '.' && !suduSet.add(board[sudu_row][sudu_col])) {
					return false;
				}
						 
			}
		}
		return true;
	}

}
