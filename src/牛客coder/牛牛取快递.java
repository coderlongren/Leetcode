package 牛客coder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年5月23日 下午8:06:19
* 类说明: 
*/
public class 牛牛取快递 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
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
