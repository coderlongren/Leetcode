package leetcodeContest83;

import java.util.ArrayList;
import java.util.List;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年5月6日 上午9:32:46
* 类说明: 
*/
public class leetcode830_Positions_of_large_groups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S = "abcdddeeeeaabbbcd";
		System.out.println(largeGroupPositions(S));
	}
	 public static List<List<Integer>> largeGroupPositions(String S) {
		 List<List<Integer>> res = new ArrayList<>();
		 if (S == null || S.length() == 0) {
			 return res;
		 }
		 int left = 0, right = 0; 
		 while (true) {
			 if (right == S.length()) {
				 if ((right - left) >= 3) {
					 List<Integer> temp = new ArrayList<>();
					 temp.add(left);
					 temp.add(right);
					 res.add(temp);
				 }
				 break;
			 }
			 if (S.charAt(left) == S.charAt(right)) {
				 right++;
			 }
			 else {
				 if ((right - left) >= 3) {
					 List<Integer> temp = new ArrayList<>();
					 temp.add(left);
					 temp.add(right - 1);
					 res.add(temp);
				 }
				 left = right;
			 }
		 }
		return res;
		 
	 }

}
