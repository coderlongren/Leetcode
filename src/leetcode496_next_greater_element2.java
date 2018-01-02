import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月2日 下午9:17:05
* 类说明:   坑的吧 
*/
public class leetcode496_next_greater_element2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {10,2,8};
		int[] nums2 = {10,3,2,1,8,-1,12,15};
		nextGreaterElement(nums1, nums2);
	}
	public static int[] nextGreaterElement(int[] findNums, int[] nums) {
		Map<Integer, Integer> map = new HashMap<>(); // map from x to next greater element of x
        Stack<Integer> stack = new Stack<>();
        
        // 这个使用Stack的算法 才是绝妙的，正好利用map的 getOrDefault(index)
        for (int num : nums) {
            while (!stack.isEmpty() && stack.peek() < num)
                map.put(stack.pop(), num);
            stack.push(num);
        }   
        for (int i = 0; i < findNums.length; i++)
            findNums[i] = map.getOrDefault(findNums[i], -1);
        return findNums;
	}

}
