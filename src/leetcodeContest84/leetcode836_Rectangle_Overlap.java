package leetcodeContest84;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年5月20日 上午9:51:19
* 类说明: 
*/
public class leetcode836_Rectangle_Overlap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] rec1 = {0,0,4,1};
		int[] rec2 = {1,0,2,2};
		System.out.println(isRectangleOverlap(rec1, rec2));
	}
	
	public static boolean isRectangleOverlap(int[] rec1, int[] rec2) {
//		return !(rec1[2] <= rec2[0] || rec1[0] >= rec2[2] || rec1[3] <= rec2[1] || rec1[1] >= rec2[3]);       
		int Lx = Math.abs((rec1[0] + rec1[2])/2 - (rec2[0] + rec2[2])/2);
		int Ly = Math.abs((rec1[1] + rec1[3])/2 - (rec2[1] + rec2[3])/2);
		
		int Sx1 = Math.abs(rec1[0] - rec1[2]);
		int Sx2 = Math.abs(rec2[0] - rec2[2]);
		int Sy1 = Math.abs(rec1[1] - rec1[3]);
		int Sy2 = Math.abs(rec2[1] - rec2[3]);
		return Lx < (Sx1 + Sx2)/2 && Ly < (Sy1 + Sy2)/2;
	}

}
