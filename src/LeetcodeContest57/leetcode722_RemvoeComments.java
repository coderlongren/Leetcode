package LeetcodeContest57;

import java.util.ArrayList;
import java.util.List;
/***
 *  题目 去掉一个C++程序里面的 注释 包括 多行注释  单行注释
 * @author Administrator
 *
 */
public class leetcode722_RemvoeComments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public List<String> removeComments(String[] source) {
	        List<String> res = new ArrayList<String>();
	        StringBuilder sb = new StringBuilder();
	        boolean mode = false;
	        for (String s : source) {
	            int i;
	            for (i = 0; i < s.length(); i++) {
	                if (mode) {
	                    if (s.charAt(i) == '*' && i < s.length() - 1 && s.charAt(i + 1) == '/') {
	                        mode = false;
	                        i++;
	                    }
	                }
	                else {
	                    if (s.charAt(i) == '/' && i < s.length() - 1 && s.charAt(i + 1) == '/') {
	                        if (sb.length() > 0)    res.add(sb.toString());
	                        sb = new StringBuilder();
	                        break;
	                    }
	                    else if (s.charAt(i) == '/' && i < s.length() - 1 && s.charAt(i + 1) == '*') {
	                        mode = true;
	                        i++;
	                    }
	                    else    sb.append(s.charAt(i));
	                }
	            }
	            
	            if (i == s.length() && !mode && sb.length() > 0) {
	                res.add(sb.toString());
	                sb = new StringBuilder();
	            }
	            
	        }
	        
	        
	        
	        return res;
	        
	        
	        
	        
	    }
	}
