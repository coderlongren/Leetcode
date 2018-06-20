import java.util.Stack;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��6��10�� ����9:29:16
* ��˵��: 
*/
public class leetcode032_Longest_calid_parentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "()()(()";
		System.out.println(longest_valid_parentheses(s));
	}
	public static int longest_valid_parentheses(String s) {
		Stack<Integer> stack = new Stack<>();
		stack.push(-1);
		int len = 0;
		int maxLen = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				stack.push(i);
			}
			else {
				stack.pop();
				if (!stack.isEmpty()) {
					len = i - stack.peek();
					maxLen = Math.max(maxLen, len);
				}
				else {
					stack.push(i);
				}
			}
		}
		return maxLen;
		
	}
	// other Solution
	public static int longest_valid_Parenteses(String s) {
		Stack<Integer> stack = new Stack<>();
		int max = 0;
		int lastValid = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				stack.push(i);
			}
			else {
				
			}
		}
		return lastValid;
	}
}
