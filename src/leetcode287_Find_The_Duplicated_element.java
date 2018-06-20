import java.util.HashSet;
import java.util.Set;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年5月24日 上午11:20:11
* 类说明: 
*/
public class leetcode287_Find_The_Duplicated_element {
	public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
        	if (!set.add(num)) {
        		return num;
        	}
        }
        return 0;
    }
}
