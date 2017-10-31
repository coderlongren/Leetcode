import java.util.ArrayList;
import java.util.List;


public class leetcode023_Generate_Parentheses {

	/**
	 *  Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

For example, given n = 3, a solution set is:

[
  "((()))",
  "(()())",
  "(())()",
  "()(())",
  "()()()"
	 * @param args[()()(), ()(()), (())(), (()()), ((()))]
	 * 			  [((())), (()()), (())(), ()(()), ()()()]
	 * 
	 *  
	 */
	public static void main(String[] args) {
		
		System.out.println(generateParenthesis(3));
		
	}
public static List<String> generateParenthesis(int n) {
    List<String> res = new ArrayList<String>();
    backtracking("", res, n, n);
	
	return res;
}
public static void backtracking(String subString, List<String> res, int left,int right){
	//左右括号 皆用完，则得到的是正解 加入正解集
	if (left == 0 && right == 0){
		res.add(subString);
		return;
	}
	
	if (left > right || left < 0 || right < 0){
		return;
	}
	backtracking(subString + "(", res, left - 1, right);
	backtracking(subString + ")", res, left, right - 1);	
}

}
