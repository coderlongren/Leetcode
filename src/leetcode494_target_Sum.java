/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��4��30�� ����8:38:58
* ��˵��: 
*/
public class leetcode494_target_Sum {
	public static int res = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,1,1,1,1};
		System.out.println(findTargetSumWays(nums, 3));
	}
	public static int findTargetSumWays(int[] nums, int S) {
        if (nums == null || nums.length == 0) {
        	return 0;
        }
        dfs(nums, 0, S, 0);
        return res;
    }
	public static void dfs(int[] nums, int idx, int S, int sum) {
		if (idx == nums.length) {
			if (sum == S) {
				res++;
			}
		}
		else {
			dfs(nums, idx + 1, S, sum + nums[idx]);
			dfs(nums, idx + 1, S, sum - nums[idx]);
		}
	}

}
