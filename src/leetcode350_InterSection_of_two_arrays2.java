import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
* @author 作者 : coderlong
* @version 创建时间：2017年12月12日 下午9:12:18
* 类说明:  2个数组的 交叉元素 计算出所有的交叉元素
*/
public class leetcode350_InterSection_of_two_arrays2 {

	// 和上面的那个 intersection of two array 
	// 不同之处在于 交叉的元素都要保存下来
	// 在这里我使用了 hashMap 存储相同元素的次数 在nums2 中 ，每出现了一次相同的
	// 元素 就把map中元素个数减一  方然判断的时候就要加一层限制了 
	public static void main(String[] args) {
		
	}
	 public int[] intersect(int[] nums1, int[] nums2) {
	        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	        ArrayList<Integer> result = new ArrayList<Integer>();
	        for(int i = 0; i < nums1.length; i++)
	        {
	            if(map.containsKey(nums1[i])) map.put(nums1[i], map.get(nums1[i])+1);
	            else map.put(nums1[i], 1);
	        }
	    
	        for(int i = 0; i < nums2.length; i++)
	        {
	        	// 这里是此算法的 核心
	            if(map.containsKey(nums2[i]) && map.get(nums2[i]) > 0)
	            {
	                result.add(nums2[i]);
	                map.put(nums2[i], map.get(nums2[i])-1);
	            }
	        }
	       int[] r = new int[result.size()];
	       for(int i = 0; i < result.size(); i++)
	       {
	           r[i] = result.get(i);
	       }
	       return r;
	    }
}
