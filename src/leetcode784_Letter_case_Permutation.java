import java.util.ArrayList;
import java.util.List;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年3月4日 下午1:00:15
* 类说明: 此方法太过于暴力，面试官曰：我们公司不需要此等煞笔
*/
public class leetcode784_Letter_case_Permutation {
	 public static List<String> letterCasePermutation(String S) {
	        List<String> reStirngs = new ArrayList<>();
	        reStirngs.add(S);
	        char[] array = S.toCharArray();
//	        for (int i = 0; i < S.toCharArray().length; i++) {
//	        	if (S.charAt(i) <= 'z' && S.charAt(i) >= 'a' || S.charAt(i) <= 'Z' && S.charAt(i) >= 'A') {
//	        		if (S.charAt(i) <= 'z' && S.charAt(i) >= 'a') {
//	        			StringBuffer stringBuffer = new StringBuffer(S);
//	        			stringBuffer.replace(i, i + 1, (char)(S.charAt(i) - 'a') + "");
//	        			reStirngs.add(stringBuffer.toString());
//	        		}
//	        		else {
//	        			StringBuffer stringBuffer = new StringBuffer(S);
//	        			stringBuffer.replace(i, i + 1, (char)(S.charAt(i) + 28) + "");
//	        			reStirngs.add(stringBuffer.toString());
//	        		}
//	        	}
//	        }
	        backtrack(reStirngs, array, 0);
			return reStirngs;
	  }
	 public static void backtrack(List<String> list, char[] array, int start) {
		 for (int i = start; i < array.length; i++) {
			 if (!list.contains(new String(array))) {
  				list.add(new String(array));
  			 }
			 
			 if (array[i] <= 'Z' && array[i] >= 'A' || array[i] <= 'z' && array[i] >= 'a') {
				 char ddd = array[i];
				 if (array[i] <= 'z' && array[i] >= 'a') {
	        			char[] chars = array;
	        			chars[i] = (char)(chars[i] - 32);
	        			if (!list.contains(new String(chars))) {
	        				list.add(new String(chars));
	        			}
	        		}
	        		else {
	        			char[] chars = array;
	        			chars[i] = (char)(chars[i] + 32);
	        			if (!list.contains(new String(chars))) {
	        				list.add(new String(chars));
	        			}
	        		}
				 backtrack(list, array, i + 1);
				 array[i] = ddd;
			 }
		 }
	 }
	 
	 public static void main(String[] args) {
		 String S = "a1b2";
		 System.out.println(letterCasePermutation(S));
		 System.out.println((char)('A' + 32));
		 System.out.println('a' - 'A');
	}
}
