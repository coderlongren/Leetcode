package leetcodeContest74;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��3��4�� ����11:01:35
* ��˵��:  ����һ�������ƽ��˼·�� �ο������ϴ����������leetcode794��AC����
* �һ�����һ��������˵��
*/
public class leetcode794_Valid_tic_tac_toe_Status {
	
	public static boolean validTicTacToe(String[] board) {
		char[][] array = {board[0].toCharArray(),board[1].toCharArray(),board[2].toCharArray()};
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (array[i][j] == ' ') {
					array[i][j] = 'X';
					if (judge(array)) {
						return true;
					}
					array[i][j] = ' ';
				}
			}
		}
		return false;
    }
	public static boolean judge(char[][] array) {
		if (check(array)) {
			return true;
		}
		int total = 0; // ���ܵ����
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (array[i][j] == ' ') {
					array[i][j] = 'X';
					if (judge(array)) {
						total++;
					}
					array[i][j] = ' ';
				}
			}
		}
		if (total >= 2) {
			return true;
		}
		else {
			return false;
		}
		
	}
	public static boolean check(char[][] array) {
		if (array[0].equals(array[1]) && array[1].equals(array[2])) {
			return true;
		}
		if (array[0][0] == array[1][0] && array[1][0] == array[2][0]) {
			return true;
		}
		if (array[0][1] == array[1][1] && array[1][1] == array[2][1]) {
			return true;
		}
		if (array[0][2] == array[1][2] && array[1][2] == array[2][2]) {
			return true;
		}
		if (array[0][0] == array[1][1] && array[1][0] == array[2][2]) {
			return true;
		}
		if (array[0][2] == array[1][1] && array[1][0] == array[2][0]) {
			return true;
		}
		return false;
		
	}
	public static void main(String[] args) {
		String[] board = {"XOX", " X ", "   "};
		System.out.println(validTicTacToe(board));
		
	}
}
