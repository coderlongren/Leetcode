import java.util.HashMap;
import java.util.Map;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��5��19�� ����6:23:30
* ��˵��: 
*/
public class leetcode560_Subarray_Sum_Equals_K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,1,1};
		System.out.println(subarraySum2(nums, 2));
	}
    public static int subarraySum(int[] nums, int k) {
    	 if (nums == null || nums.length == 0) {
    		 return 0;
         } 
         int[] dp = new int[nums.length + 1];
         dp[0] = 0; 
         int res = 0;
         for (int i = 1; i <= nums.length; i++) {
         	dp[i] = dp[i - 1] + nums[i - 1];
         }
         for (int i = nums.length; i >= 1; i--) {
         	for (int j = i - 1; j >= 0; j--) {
         		if ((dp[i] - dp[j]) == k) {
         			res++;
         		}
         	}
         }
         return res;
    }
    // O(n) ʱ�临�Ӷȣ� O(n)�ռ临�Ӷ� �㷨
    public static int subarraySum2(int[] nums, int k) {
    	// ʹ��Map��
    	Map<Integer, Integer> map = new HashMap<>();
    	int res = 0;
    	int sum = 0;
    	map.put(0, 1); // ��� ��������sum ���� k �Ļ�����Ӧ ���entry
    	for(int i = 0; i < nums.length; i++) {
    		sum += nums[i];
    		if (map.containsKey(sum - k)) {
    			res += map.get(sum - k);
    		}
    		if (map.containsKey(sum)) {
    			map.put(sum, map.get(sum) + 1);
    		}
    		else {
    			map.put(sum, 1);
    		}
    		
    	}
		return res;
    	
    }

}
