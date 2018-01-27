import java.util.Arrays;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月27日 下午9:13:47
* 类说明: 
* 6 5 4 8 7 5 1为例来说明这道题
* 
* 
* 首先肯定从后面开始看，1和5调换了没有用。

7、5和1调换了也没有效果，因此而发现了8、7、5、1是递减的。

如果想要找到下一个排列，找到递增的位置是关键。

因为在这里才可以使其增长得更大。

于是找到了4，显而易见4过了是5而不是8或者7更不是1。

因此就需要找出比4大但在这些大数里面最小的值，并将其两者调换。

那么整个排列就成了：6 5 5 8 7 4 1

然而最后一步将后面的8 7 4 1做一个递增。
*/
public class leetcode031_Next_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {6, 5, 4, 8, 7, 5, 1};
		nextPermutation(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}
	public static void nextPermutation(int[] nums) {
        if (nums.length == 1) {
        	return ;
        }
        int length = nums.length;
        int index = length - 1;
        while (index >= 1 && nums[index] <= nums[index - 1])  {
        	index--;
        }
        if (index == 0){
        	Arrays.sort(nums);
        	return;
        }
        int temp = nums[index - 1]; // 第一个递增的数字
        int second = Integer.MAX_VALUE;
        int second_index = index;
        for (int i = index; i < length; i++){
        	if (nums[i] > temp){
        		if (nums[i] < second) {
        			second = nums[i];
        			second_index =  i;
        		}
        	}
        }
        
        nums[index - 1] = nums[second_index];
        nums[second_index] = temp;
        
        // 使用以下优化的冒泡排序
        for (int i = index; i < length - 1; i++){
        	boolean flag = false;
        	for (int j = index; j < length - 1 - i + index; j++){
        		if (nums[j] > nums[j + 1]) {
        			flag = true;
        			int temp1 = nums[j + 1];
        			nums[j + 1] = nums[j];
        			nums[j] = temp1;
        		}
        	}
        	if (!flag) {
        		break;
        	}
        }
    }

}
