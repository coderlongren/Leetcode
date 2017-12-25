import java.util.ArrayList;
import java.util.List;

/**
* @author 作者 : coderlong
* @version 创建时间：2017年12月15日 下午9:18:38
* 类说明: 滑动窗口法的经典应用
*/
public class leetcode438_find_all_anagrams_in_stirng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "cbaebabacd";
		String p = "abc";
		System.out.println(findAnagrams(s, p));
	}
	public static List<Integer> findAnagrams(String s, String p) {
	    List<Integer> list = new ArrayList<>();
	    if (s == null || s.length() == 0 || p == null || p.length() == 0) return list;
	    int[] hash = new int[256]; //character hash
	    //record each character in p to hash
	    for (char c : p.toCharArray()) {
	        hash[c]++;
	    }
	    // 
	    for (int i : hash) {
			if (i > 0){
				System.out.println(i);
			}
		}
	    //two points, initialize count to p's length
	    int left = 0, right = 0, count = p.length();
	    while (right < s.length()) {
	        //move right everytime, if the character exists in p's hash, decrease the count
	        //current hash value >= 1 means the character is existing in p
	        if (hash[s.charAt(right++)]-- >= 1) {
	        	count--; 
	        }
	        
	        //when the count is down to 0, means we found the right anagram
	        //then add window's left to result list
	        if (count == 0) {
	        	list.add(left);
	        }
	    
	        //if we find the window's size equals to p, then we have to move left (narrow the window) to find the new match window
	        //++ to reset the hash because we kicked out the left
	        //only increase the count if the character is in p
	        //the count >= 0 indicate it was original in the hash, cuz it won't go below 0
	        if (right - left == p.length() && hash[s.charAt(left++)]++ >= 0) {
	        	count++;
	        }
	        System.out.println("");
	    }
	    return list;
	}

}
