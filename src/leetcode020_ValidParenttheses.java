import java.util.Stack;

/**
* @author 作者 : coderlong
* @version 创建时间：2017年12月14日 下午6:26:30
* 类说明: 
*/
public class leetcode020_ValidParenttheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (char c : s.toCharArray()) {
			if (c == '(')
				stack.push(')');
			else if (c == '{')
				stack.push('}');
			else if (c == '[')
				stack.push(']');
			else if (stack.isEmpty() || stack.pop() != c)
				return false;
		}
		return stack.isEmpty();
	}

}
