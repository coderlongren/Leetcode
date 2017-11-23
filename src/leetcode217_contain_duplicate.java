import java.util.HashSet;
import java.util.Set;

public class leetcode217_contain_duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(containsDuplicate(new int[]{2,1}));
	}
	
	 public static boolean containsDuplicate(int[] nums) {
		 Set<Integer> set = new HashSet<Integer>();
		 for (int i : nums){
			 if (!set.add(i)){
				 return  true; 
			 }
		 }
		 return false;
		 
	 }

}
