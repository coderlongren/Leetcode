import java.util.HashSet;
import java.util.Set;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��2��1�� ����10:50:17
* ��˵��: ������һ���򵥵�������
*/
public class leetcode036_Valid_Sudoku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean isValidSudoku(char[][] board) {
		// ��������˺ܾã����ý̫ⷨ�����ˡ�
		// ԭ���� ��μ��ÿһ�У�ÿһ�У�ÿһ��С�ľŷ���� �ظ����
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
				// �������� sudu_row  sudu_col����ľ��� ��0-8С����������������
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
