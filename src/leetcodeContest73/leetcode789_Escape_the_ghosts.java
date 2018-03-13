package leetcodeContest73;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��3��10�� ����10:26:08
* ��˵��:  ���ѹ���
*/
public class leetcode789_Escape_the_ghosts {
	public static boolean escapeGhosts(int[][] ghosts, int[] target) {
        int youValue = Math.abs(target[0]) + Math.abs(target[1]);
        
        for (int[] ghost : ghosts) {
        	int xValue = Math.abs(ghost[0] - target[0]);
        	int yValue = Math.abs(ghost[1] - target[1]);
        	if (xValue + yValue <= youValue) {
        		return false;
        	}
        }
        return true;
    }
	public static void main(String[] args) {
		System.out.println(Math.pow(4, 0.5));
	}
}
