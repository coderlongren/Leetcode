package leetcodeContest74;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年3月4日 下午12:24:12
* 类说明:  刚开始没有看明白， 以为就是判断在当前局面下 如何下棋，才能执先的人赢
* 其实 当前局面首先要符合要求
* 哎  还是没读懂题目啊， 题目说的是valid ........ Status, 自己非要多想
*/
public class leetcode794_ValidTic_Tac_toe_status {
	public boolean validTicTacToe(String[] board) {
        int turns = 0;
        boolean xwin = false; 
        boolean owin = false;
        int[] rows = new int[3];
        int[] cols = new int[3];
        int diag = 0;
        int antidiag = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i].charAt(j) == 'X') {
                    turns++;
                    rows[i]++;
                    cols[j]++;
                    if (i == j) {
                        diag++;
                    }
                    if (i + j == 2) {
                        antidiag++;
                    }
                } else if (board[i].charAt(j) == 'O') {
                    turns--;
                    rows[i]--;
                    cols[j]--;
                    if (i == j) {
                        diag--;
                    }
                    if (i + j == 2) {
                        antidiag--;
                    }
                }
            }
        }
        xwin = rows[0] == 3 || rows[1] == 3 || rows[2] == 3 || diag == 3 || antidiag == 3;
        owin = rows[0] == -3 || rows[1] == -3 || rows[2] == -3 || diag == -3 || antidiag == -3;
        if (xwin && turns == 0 || owin && turns == 1) {
            return false;
        }
        return (turns == 0 || turns == 1) && (!xwin || !owin);
    }
}
