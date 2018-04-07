/**
* @author 作者 : coderlong
* @version 创建时间：2018年4月1日 下午10:57:43
* 类说明: 
*/
public class leetcode213_House_Robber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int rob(int[] nums) {
		 if (nums == null || nums.length == 0) {
	            return 0;
	        }
	        if (nums.length == 1) {
	            return nums[0];
	        }
	        if (nums.length == 2) {
	            return Math.max(nums[0], nums[1]);
	        }

	        return Math.max(robHelper(nums, 0, nums.length - 2), robHelper(nums, 1, nums.length - 1));
	       // this is an extension of House Robber
	}
	public static int robHelper (int[] nums, int lo, int hi) {
        int preRob = 0; //  simple explain
        int preNotRob = 0;
        int rob = 0;
        int notRob = 0;
        for (int j = lo; j <= hi; j++) {
            // what is the include and exclude
            rob = preNotRob + nums[j];
            notRob = Math.max(preRob, preNotRob);

            preRob = rob;
            preNotRob = notRob;

        }
        return Math.max(rob, notRob);

    }

}
