package 今日头条;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
* @author 作者 : coderlong
* @version 创建时间：2018年8月12日 上午11:13:35
* 类说明: 
*/
public class gggg {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String in = scanner.nextLine();
		int n = Integer.valueOf(in);
		int[] a = new int[n];
		int[] b = new int[n];
		String line1 = scanner.nextLine();
		String line2 = scanner.nextLine();
		String[] aa = line1.split(" ");
		String[] bb = line2.split(" ");
		for (int i = 0; i < n; i++) {
			a[i] = Integer.valueOf(aa[i]);
		}
		for (int i = 0; i < n; i++) {
			b[i] = Integer.valueOf(bb[i]);
		}
		int count = 0;
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = i;
		}
		List<List<Integer>> res = subsets(nums);
		res.remove(0);
		for (List<Integer> item : res) {
			int left = item.get(0);
			int right = item.get(item.size() - 1);
			int maxa = Integer.MIN_VALUE;
			int minb = Integer.MAX_VALUE;
			for (int i = left; i <= right; i++) {
				maxa = Math.max(maxa, a[i]);
				minb = Math.min(minb, b[i]);
			}
			if (maxa < minb) {
				count++;
			}
		}
		System.out.println(count);
		
	}
	public static List<List<Integer>> subsets(int[] nums) {
	     // 排序之后循环 题目关键之处在于 distinct integers 意味着 数字不会重复，降低了难度
		 List<List<Integer>> answer = new ArrayList<List<Integer>>();
		 
		 answer.add(new ArrayList<Integer>());
		 for (int i = 0;i < nums.length;i++){
			 List<List<Integer>> temp = new ArrayList<List<Integer>>();
			 for (List<Integer> x:answer){
				 List<Integer> y = new ArrayList<Integer>(x);
				 y.add(nums[i]);
				 temp.add(y);
			 }
			 answer.addAll(temp);
		 }
		 return answer;
		 
	  }
}
