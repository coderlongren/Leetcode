import java.util.HashMap;
import java.util.Stack;

/***
 * 
 * 
 * <p>Title:</p>
 * <p>Description:  Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

					The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.</p>
 * <p>Company:</p> 
 * @author codeÁú
 * @date
 * @version 1.0
 */
public class leetcode020_isValid_String {
	public static void main(String[] args){
		//ÅÐ¶Ï×Ö·ûÊÇ·ñºÏ·¨ 
		String string = "(){}{}[][]";
		System.out.println(isValid(string));
	}
public static boolean isValid(String s){
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		map.put('(', ')');
		map.put('{', '}');
		map.put('[', ']');
		Stack< Character> stack = new Stack<Character>();
		for (int i = 0; i <  s.length(); i++){
			char c = s.toCharArray()[i];
			if (map.keySet().contains(c)){
				//°Ñ×óÀ¨ºÅ ·Å
				stack.push(c);
			}
			//ÅÐ¶ÏÊÇ·ñÓÐ°éµÄÀ¨ºÅ »¹ÔÓ
			else if (map.values().contains(c)){
				if (!stack.empty() && map.get(stack.peek()) == c){
					stack.pop();
				}                                                                                  
				else{
					return false;
				}
			}
		}
		
		return stack.empty();
	}
}