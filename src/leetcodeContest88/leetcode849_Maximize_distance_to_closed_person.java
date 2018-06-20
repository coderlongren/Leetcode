package leetcodeContest88;

import 位运算.max;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年6月10日 上午10:10:38
* 类说明: 
*/
public class leetcode849_Maximize_distance_to_closed_person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] seats = {1,0,0,0};
		System.out.println(maxDistToClosest(seats));
	}
	 public static int maxDistToClosest(int[] seats) {
		 int max = 0;
		 for (int i = 0; i < seats.length; i++) {
			 if (seats[i] == 0) {
				 int left = 0;
				 int right = 0;
				 int ll = i - 1;
				 int rr = i + 1;
				 while (ll >= 0) {
					 if (seats[ll] == 0) {
						 left++;
					 }
					 else {
						 break;
					 }
					 ll--;
				 }
				 while (rr < seats.length) {
					 if (seats[rr] == 0) {
						 right++;
					 }
					 else {
						 break;
					 }
					 rr++;
				 }
				 if (i == 0) {
					 max = Math.max(max, 1 + right);
				 }
				 else if (i == seats.length - 1) {
					 max = Math.max(max, 1 + left);
				 }
				 else {
					 max = Math.max(max, 1 + Math.min(left, right));
				 }
			 }
		 }
		return max;
	 }

}
