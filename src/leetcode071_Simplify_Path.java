import java.util.Stack;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年5月10日 上午9:51:19
* 类说明: 	String处理
*/
public class leetcode071_Simplify_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(simplifyPath("/abc/..."));
	}
	public static String simplifyPath(String path) {
		int idx = 0;
		Stack<String> stack = new Stack<>();
		while (idx < path.length()) {
			while (idx < path.length() && path.charAt(idx) == '/') {
				idx++; // 多个 / 只要其中一个
			}
			String temp = "";
			while (idx < path.length() && path.charAt(idx) != '/') {
				temp += path.charAt(idx);
				idx++;
			}
			if (temp.equals("..") && !stack.isEmpty()) {
				stack.pop();
			} 
			else if (!temp.equals("") && !temp.equals("..") && !temp.equals(".")) {
//				System.out.println(temp.equals("."));
				stack.push(temp);
			}
			idx++;
		}
		String res = "";
		Stack<String> newstack = new Stack<>();
		while (!stack.isEmpty()) {
			newstack.push(stack.pop());
		}
		while (!newstack.isEmpty()) {
			res += "/" + newstack.pop();
		}
		if (res == "") {
			res = "/";
		}
		return res;
		
	}

}
