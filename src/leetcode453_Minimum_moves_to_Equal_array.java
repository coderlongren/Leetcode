import java.util.concurrent.ForkJoinPool.ForkJoinWorkerThreadFactory;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2017��12��18�� ����10:23:11
* ��˵��:  it is a math question? please receive my kneels 
*  ����һ����ѧ������⣬
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
	       // �Ѿ��ҵ�������������С��Ԫ���� 
	       for (int i : nums) {
	    	   result += (i - min);
	       }
		 return result;
	 }

}
