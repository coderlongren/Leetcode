import java.util.Arrays;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月4日 下午9:07:52
* 类说明: 
*/
public class leetcode506_Relative_ranks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public String[] findRelativeRanks(int[] nums) {
        Integer[] index = new Integer[nums.length];
        
        for (int i = 0; i < nums.length; i++) {
            index[i] = i;
        }
        // 这里的lambda表达式 可看懂吗
        Arrays.sort(index, (a, b) -> (nums[b] - nums[a]));
        
        String[] result = new String[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                result[index[i]] = "Gold Medal";
            }
            else if (i == 1) {
                result[index[i]] = "Silver Medal";
            }
            else if (i == 2) {
                result[index[i]] = "Bronze Medal";
            }
            else {
                result[index[i]] = (i + 1) + "";
            }
        }

        return result;
    }

}
