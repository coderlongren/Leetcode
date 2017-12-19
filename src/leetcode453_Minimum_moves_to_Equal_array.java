import java.util.concurrent.ForkJoinPool.ForkJoinWorkerThreadFactory;

/**
* @author 作者 : coderlong
* @version 创建时间：2017年12月18日 下午10:23:11
* 类说明:  it is a math question? please receive my kneels 
*  这是一道数学类的问题，
*/
public class leetcode453_Minimum_moves_to_Equal_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public static int minMoves(int[] nums) {
	       if(nums.length == 0){
	    	   return 0;
	       } 
	       if (nums == null){
	    	   return 0;
	       }
	       int min = nums[0];
	       for (int i : nums) {
	    	   min = Math.min(min, i);
	       }
	       int result = 0;
	       // 已经找到了数组里面最小的元素了 
	       for (int i : nums) {
	    	   result += (i - min);
	       }
		 return result;
	 }

}
