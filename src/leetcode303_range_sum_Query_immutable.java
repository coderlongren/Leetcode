/**
* @author ���� : coderlong
* @version ����ʱ�䣺2017��12��12�� ����8:37:05
* ʹ�ö�̬�滮�Ƚ�����  һ�� sum[] �Ժ����� sumRange(i, j) �ͺܷ�����
* ��˵��:  DP num[i]����ľ��� 0-i֮��ĺͣ���Ȼ��ʼ��num[i]����Ҫʹ��DP�ģ������ڼ��� i -j֮��ĺ;ͷǳ������ˣ� ֱ��num[j] - num[i]
*/
public class leetcode303_range_sum_Query_immutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	int[] nums;

	public leetcode303_range_sum_Query_immutable(int[] nums) {
		// ����һ�� DP����
	    for(int i = 1; i < nums.length; i++) {
	    	nums[i] += nums[i - 1];
	    }
	    
	    this.nums = nums;
	}

	public int sumRange(int i, int j) {
	    if(i == 0)
	        return nums[j];
	    
	    return nums[j] - nums[i - 1];
	}

}
