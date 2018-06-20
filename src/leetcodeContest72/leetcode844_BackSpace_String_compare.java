package leetcodeContest72;

import java.util.Stack;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年6月3日 上午9:37:54
* 类说明: 
*/
public class leetcode844_BackSpace_String_compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(backspaceCompare("ab##c", "ad#c"));
	}
	public static boolean backspaceCompare(String S, String T) {
        if (S == null || T == null) {
        	return false;
        }
        Stack<Character> stackT = new Stack<>();
        for (int i = 0; i < T.length(); i++) {
        	if (T.charAt(i) != '#') {
        		stackT.push(T.charAt(i));
        	}
        	else {
        		if (!stackT.isEmpty()) {
        			stackT.pop();
        		}
        	}
        }
        StringBuilder builderT = new StringBuilder();
        while (!stackT.isEmpty()) {
        	builderT.append(stackT.pop());
        }
        builderT.reverse();
        Stack<Character> stackS = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
        	if (S.charAt(i) != '#') {
        		stackS.push(S.charAt(i));
        	}
        	else {
        		if (!stackS.isEmpty()) {
        			stackS.pop();
        		}
        	}
        }
        StringBuilder builderS = new StringBuilder();
        while (!stackS.isEmpty()) {
        	builderS.append(stackS.pop());
        }
        builderS.reverse();
        
        return builderS.toString().equals(builderT.toString());
    }

}
