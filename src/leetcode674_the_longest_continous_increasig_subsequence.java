/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��1��17�� ����1:08:41
* ��˵��: 
*/
public class leetcode674_the_longest_continous_increasig_subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {5,5,5,5,5};
		System.out.println(findLengthOfLCIS(nums));
	}
	public static int findLengthOfLCIS(int[] nums) {
		if (nums == null || nums.length == 0){
			return 0;
		}
        if (nums.length == 1){
        	return 1;
        }
        int i = 0, j = 1;
//        int count = 1;
        int res = 1;
        while (j < nums.length){
        	if (nums[j] > nums[j - 1]){
        		res = Math.max(res, j - i + 1);
        		j++;
        	}
        	else {
//        		count = 0;
        		i = j;
        		j++;
        	}
        }
        return res;
    }

}
