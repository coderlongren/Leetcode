/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��1��12�� ����2:46:22
* ��˵��: 
*/
public class leetcode598_rangeAddtion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public int maxCount(int m, int n, int[][] ops) {
	        if (ops == null || ops.length == 0) {
	            return m * n;
	        }
	        
	        int row = Integer.MAX_VALUE, col = Integer.MAX_VALUE;
	        for(int[] op : ops) {
	            row = Math.min(row, op[0]);
	            col = Math.min(col, op[1]);
	        }
	        
	        return row * col;
	    }

}
