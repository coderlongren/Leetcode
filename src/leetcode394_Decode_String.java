import java.util.Stack;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年4月25日 下午7:36:07
* 类说明: 
*/
public class leetcode394_Decode_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "3[a]2[bc]";
		System.out.println(decodeString2(s));
 	}
	// 
	public String decodeString(String s) {
        StringBuilder res = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
        	if (!Character.isDigit(s.charAt(i))) {
        		res.append(s.charAt(i++));
        	}
        	else {
        		if (s.charAt(i + 1) == '[') {
        			
        		}
        	}
        }
		return s;
    }
	// 用两个栈来做的话， 应该思路比较清晰
	public static String decodeString2(String s) {
		int index = 0;
		Stack<Integer> countStack = new Stack<>();
		Stack<String> resStack = new Stack<>();
		StringBuilder res = new StringBuilder("");
		StringBuilder temp = new StringBuilder(); // 临时保存 []之间的字符串
		while (index < s.length()) {
			if (Character.isDigit(s.charAt(index))) {
				// 求出 [ 前面的 十进制数字
				int sum = 0;
				while (Character.isDigit(s.charAt(index))) {
					sum = sum*10 + (s.charAt(index) - '0');
					index++;
				}
				countStack.push(sum); // [ 之前的数字进栈
			}
			
			else if (s.charAt(index) == '[') {
				resStack.push(res.toString());
				res.delete(0, res.length()); // res清空
				index++;
			}
			else if (s.charAt(index) == ']') {
				StringBuilder head = new StringBuilder(resStack.pop());// res的 最开始一部分
				int count = countStack.pop();
				for (int i = 0; i < count; i++) {
					head.append(res.toString());
				}
				res = new StringBuilder(head.toString());
				index++;
			}
			else {
				res.append(s.charAt(index));
				index++;
			}
		}
		return res.toString();
	}

}
