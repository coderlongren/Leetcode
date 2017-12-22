import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2017��12��12�� ����9:12:18
* ��˵��:  2������� ����Ԫ�� ��������еĽ���Ԫ��
*/
public class leetcode350_InterSection_of_two_arrays2 {

	// ��������Ǹ� intersection of two array 
	// ��֮ͬ������ �����Ԫ�ض�Ҫ��������
	// ��������ʹ���� hashMap �洢��ͬԪ�صĴ��� ��nums2 �� ��ÿ������һ����ͬ��
	// Ԫ�� �Ͱ�map��Ԫ�ظ�����һ  ��Ȼ�жϵ�ʱ���Ҫ��һ�������� 
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
	        	// �����Ǵ��㷨�� ����
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
