package leetcodeContest59;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class leetcode728_Self_dividing_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println(selfDividingNumbers(1, 22));
		 List<Integer> test = new LinkedList<Integer>();
		 test.add(1);
		 test.add(2);
		 System.out.println(test.get(1));
		 System.out.println(selfDividingNumbers(1, 22));

	}
	 public static List<Integer> selfDividingNumbers(int left, int right) {
		 if (left > right || left < 1 || right > 10000){
			 return null;
		 }
		 List<Integer> res = new ArrayList<Integer>();
		 
		 for (int i = left;i <= right;i++){
			 List<Integer> temp = new LinkedList<Integer>();
			 boolean flag = true;
			 int i1 = i;
			 while (i1 != 0){
				 int weishu = i1%10;
				 if (weishu == 0){
					 flag = false;
					 break;
				 }
				 temp.add(weishu);
				 i1 /= 10;
			 }
			 if (flag){
				 boolean isDividing = true;
				 for (int j = 0; j < temp.size(); j++){
					 if ((i % temp.get(j)) != 0){
						 isDividing = false;
						 break;
					 }
				 }
				 if (isDividing){
					 res.add(i);
				 }
				 
			 }
			 
		 }
		 
		 return res;
	 }

}
