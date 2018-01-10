/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月10日 下午5:10:13
* 类说明: 
*/
public class leetcode566_reshape_the_maxtrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int[][] matrixReshape(int[][] nums, int r, int c) {
	    int n = nums.length, m = nums[0].length;
	    if (r*c != n*m) return nums;
	    int[][] res = new int[r][c];
	    for (int i=0;i<r*c;i++) 
	        res[i/c][i%c] = nums[i/m][i%m];
	    return res;
	}

}
