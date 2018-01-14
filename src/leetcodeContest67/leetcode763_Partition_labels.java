package leetcodeContest67;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月14日 上午10:48:06
* 类说明:  还是滑动窗口法的 经典应用
*/
public class leetcode763_Partition_labels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S = "ababcbacadefegdehijhklij";
		System.out.println(partitionLabels(S));
	}
	 public static List<Integer> partitionLabels(String S) {
	        List<Integer> res = new ArrayList<>();
	        
	        int[] table = new int[26];
	        char[] stc = S.toCharArray();
	        for(char c:stc)// 记录C 在整个String里面出现的次数
	            table[c-'a']++;
	        
	        int i = 0, j = 0, l = S.length(), counter = 0;
	        HashSet<Character> hs = new HashSet<>();
	        while(j < l){
	            char c = stc[j];
	            if(!hs.contains(c)){//  count记录，   除了窗口里面的字符，外面都不包含这个窗口里面的字符，也就是说这个窗口是独立于整个字符串的
	                hs.add(c);
	                counter++;
	            }
	            table[c-'a']--; // 
	            j++;
	            if(table[c-'a'] == 0){ // table[c - 'a'] == 0 也就意味着窗口已经包含字符串里面所有的这个字符 c
	                counter--;
	                hs.remove(c);
	            }
	            if(counter == 0){// 如果count，说明整个窗口是独立于整个字符串的 
	                res.add(j - i);// 把这个窗口的长度记录到res
	                i = j;// 重新选择一个窗口，也就是重置起点   i坐标
	            }            
	        } 
	        return res;
	    }

}
