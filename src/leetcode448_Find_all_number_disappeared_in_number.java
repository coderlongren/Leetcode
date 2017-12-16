import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2017��12��16�� ����10:29:52
* ��˵��:  ����Ĵ����Ǵ���� ����˼��һ��ʼ�ʹ��� 
*/
public class leetcode448_Find_all_number_disappeared_in_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,3,5,5,6,6,7,8,9};
		System.out.println(findDisappearedNumbers(nums));
//		Set<Integer> set = new HashSet<>();
//		System.out.println(set.add(1));
//		System.out.println(set.add(1));
	}
	 public static List<Integer> findDisappearedNumbers(int[] nums) {
		 List<Integer> list = new LinkedList<>();
		 if (nums == null){
			 return list;
		 }
		 if (nums.length == 0){
//			 list.add(1);
			 return list;
		 }
	      Set<Integer> set = new TreeSet<>();
	      for (Integer integer : nums) {
			set.add(integer);
	      }
	      if (set.size() == 1){
	    	  int min = set.iterator().next();
	    	  if (min > 1){
	    		  for (int i = 1; i < min; i++){
	    			  list.add(i);
	    		  }
	    		  return list;
	    	  }
	    	  else {
	    		  list.add(2);
	    		  
	    	  }
	    	  return list;
	      }
	      int index = 0;
	      int[] nums2 = new int[set.size()];
	      for (int i : set) {
			nums2[index++] = i;
			
	      }
	      // ���˵õ��� �������ظ�Ԫ�ص�һ�����飬�����л����ж� 
	      for (int i : nums2) {
			System.out.print(i + " ");
	      }
	      int min = nums2[0];
	      int max = nums2[nums2.length - 1];
	     
	      for (int k = min;k <= max; k++){
	    	  if (set.add(k)){
	    		  list.add(k);
	    	  }
	      }
		return list;
	 }

}
