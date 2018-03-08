package leetcodeContest74;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��3��4�� ����12:24:12
* ��˵��:  �տ�ʼû�п����ף� ��Ϊ�����ж��ڵ�ǰ������ ������壬����ִ�ȵ���Ӯ
* ��ʵ ��ǰ��������Ҫ����Ҫ��
* ��  ����û������Ŀ���� ��Ŀ˵����valid ........ Status, �Լ���Ҫ����
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
