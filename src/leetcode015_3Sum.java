import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;


public class leetcode015_3Sum {

	public static void main(String[] args) {
		
	}
	 public  static List<List<Integer>> threeSum(int[] nums) {
		 
		 List<List<Integer>> listNum = new ArrayList<List<Integer>>();
		 // Two pointers question 
		 Arrays.sort(nums);
		 if (nums == null || nums.length == 0){
			 return listNum;
		 }
		 
		 for (int i = 0; i + 2 < nums.length; i++){
			 if (i > 0 && nums[i] == nums[i - 1]){
				 continue;// skip the equal elements avoid the duplicates 
			 }
			 
			 int left = i + 1;
			 int right = nums.length - 1;
			 int target = -nums[i];
			 while (left < right) {
				 if (nums[left] + nums[right] == target){
					 List<Integer> list = new ArrayList<Integer>();
					 list.add(nums[i]);
					 list.add(nums[left]);
					 list.add(nums[right]);
					 listNum.add(list);
					 left++;
					 right--;
					 while (left < right && nums[left] == nums[left - 1]) {
						 left++;
					}
					 while (right> left && nums[right] == nums[right + 1]){
						 right--;
					 }
				 }
				 else if (nums[left] + nums[right] < target){
					 left++;
				 }
				 else {
					right--;
				}
			}
		 }
		 return listNum;
		 // brute force
		 
		 /*
		 for (int i = 0; i < nums.length; i++){
			 for (int j = i + 1; j < nums.length; j++){
				 for (int k = j + 1; k < nums.length; k++){
					 				 
					 if (nums[i] + nums[j] + nums[k] == 0){
						 List<Integer> list = new ArrayList<Integer>();
						 int i1 = nums[i];
						 int j1 = nums[j];
						 int k1 = nums[k];
						 if (i1 > j1){
						 }
						 else {
							int temp = i1;
							i1 = j1;
							j1 = temp;
						}
						 if (k1 > i1){
							int temp = i1;
							int temp1 = j1;
							i1 = k1;
							j1 = temp;
							k1 = temp1;
						 }
						 else if (k1 > j1){
							int temp  = j1;
							j1 = k1;
							k1 = temp;
						}
						 else {
							 ;
						}
						 
						 
						 list.add(i1);
						 list.add(j1);
						 list.add(k1);
						 
						 listNum.add(list);
					 }
				 }
			 }
		 }
		 Set<List<Integer>> set = new HashSet<List<Integer>>(listNum);
		 List<List<Integer>> listtest = new ArrayList<List<Integer>>(set);
		 return listtest;*/
	}

}
