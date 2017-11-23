import java.util.ArrayList;
import java.util.List;

public class leetcode401_binary_watch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(readBinaryWatch(1));
	}
	public static List<String> readBinaryWatch(int num) {
		List<String> res = new ArrayList<String>();
		int[] nums1 = {8,4,2,1};
		int[] nums2 = {32,16,8,4,2,1};
		for (int i = 0; i <= num; i++){
			List<Integer> list1 = generateDigit(nums1,i);
			List<Integer> list2 = generateDigit(nums2, num - i);
			for (int num1 : list1){
				if (num1 >= 12){
					continue;
				}
				for (int num2:list2){
					if (num2 >= 60){
						continue;
					}
					res.add(num1 + ":" + (num2 < 10? "0" + num2:num2));
				}
			}
				
				
		}
		
		return res;
	}
	public static List<Integer> generateDigit(int[] nums,int count){
			List<Integer> res = new ArrayList<Integer>();
			generateHelper(nums, count, 0, 0, res);
			return res;
	}
	public static void generateHelper(int[] nums,int count,int pos,int sum,List<Integer> res){
		
		// 这就间接的说明count是 递归函数的出口
		if (count == 0){
			res.add(sum);
			return;
		}
		// 下面是 算法核心 ：递归回溯
		for (int i = pos; i < nums.length; i++){
			generateHelper(nums, count - 1, i + 1, sum + nums[i], res);
		}
		
	}
	
}
