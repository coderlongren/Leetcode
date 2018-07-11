package leetcodeContest90;

import java.util.HashSet;
import java.util.Set;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年6月25日 下午4:21:51
* 类说明: 
*/
public class leetcode859_Budy_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		char[] chars = {'a','B'};
//		System.out.println(new String(chars));
		String A = "abab";
		String B = "abab";
		System.out.println(buddyStrings(A, B));
	}
    public  static boolean buddyStrings(String A, String B) {
    	if (A == null && B == null || A == "" && B == "") {
    		return true;
    	}
    	
    	int count = 0;
    	Set<Character> set = new HashSet<>();
    	int a1 = 0;
    	int b1 = 0;
    	if (A.length() == B.length()) {
    		for (int i = 0; i < A.length(); i++) {
    			set.add(A.charAt(i));
    			if (A.charAt(i) != B.charAt(i)) {
    				count++;
    				if (count == 1) {
    					a1 = i;
    				}
    				else if (count == 2) {
    					b1 = i;
    				}
    				else {
    					break;
    				}
    			}
    		}
    		if (count == 0 && set.size() < A.length()) {
    			return true;
    		}
    		if (count == 2) {
    			char a = A.charAt(a1);
    			char b = A.charAt(b1);
    			char[] chars = A.toCharArray();
    			chars[a1] = b;
    			chars[b1] = a;
    			if (new String(chars).equals(B)) {
    				return true;
    			}
    		}
    	}
    	return false;
    	
    }
}
