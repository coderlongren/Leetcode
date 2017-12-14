import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
* @author 作者 : coderlong
* @version 创建时间：2017年12月14日 下午6:32:10
* 类说明: Longest Palindrome 
*/
public class leetcode409_longest_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// 这个就是一个数学式子了吧 
	public static int longest(String s){
		if (s == null || s.length() == 0){
			return 0;
		}
		int count = 0;
		Set<Character> set = new HashSet<>();
		for (Character character : s.toCharArray()) {
			if (set.contains(character)){
				set.remove(character);
				count++;
			}
			else {
				set.add(character);
			}
		}
		// 如果最后有 落单的元素
		if (!set.isEmpty()){
			return 2*count + 1;
		}
		else {
			return 2*count;
		}
	}

}
