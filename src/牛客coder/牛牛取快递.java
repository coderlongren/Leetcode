package ţ��coder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��5��23�� ����8:06:19
* ��˵��: 
*/
public class ţţȡ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
	}
	 public static List<List<Integer>> subsets(int[] nums) {
	     // ����֮��ѭ�� ��Ŀ�ؼ�֮������ distinct integers ��ζ�� ���ֲ����ظ����������Ѷ�
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
