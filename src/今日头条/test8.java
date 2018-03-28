package 今日头条;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年3月25日 上午11:25:33
* 类说明: 
*/
public class test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = scanner.nextInt();
		}
			
		List<List<Integer>> list = new ArrayList<>();
		backtrack(list, new ArrayList<>(), array);
		
		for (List<Integer> list2 : list) {
			for (Integer integer: list2) {
				System.out.print(integer);
			}
			System.out.println();
		}
	   }
		public static void backtrack(List<List<Integer>> list, List<Integer> templist, int[] nums){
			if (templist.size() == nums.length) {
				list.add(new ArrayList<>(templist));// 符合条件的加入进去
			}
			else {
				for (int i = 0; i < nums.length; i++) {
					if (templist.contains(nums[i])){ // 这个判断是否包含重复 也是及其精妙啊
						continue;
					}
					templist.add(nums[i]);
					backtrack(list, templist, nums);
					templist.remove(templist.size() - 1);
				}
			}
		}

}
