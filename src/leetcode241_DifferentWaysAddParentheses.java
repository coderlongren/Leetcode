import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年4月15日 下午10:09:40
* 类说明: 
*/
public class leetcode241_DifferentWaysAddParentheses {
	// 用来存储，已经计算出来的子串
	private Map<String, List<Integer>> map = new HashMap<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		leetcode241_DifferentWaysAddParentheses test = new leetcode241_DifferentWaysAddParentheses();
		System.out.println(test.diffWaysToCompute2("1+2"));
	}
	// 记得三角形塔问题吗？dp入门，记忆数组对于重复问题是很好用的
	public  List<Integer> diffWaysToCompute2(String input) {
		// 可以用Map先把，那些已经计算的出的input,存到Map中，
		// 以后如果遇到了相同的直接拿出来，用
		if (map.containsKey(input)) {
			return map.get(input);
		}
		List<Integer> res = new ArrayList<>();
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch == '+' || ch == '-' || ch == '*') {
				for (Integer l : diffWaysToCompute2(input.substring(0, i))) {
					for (Integer r : diffWaysToCompute2(input.substring(i + 1,input.length()))) {
						if (ch == '+') {
							res.add(l + r);
						}
						else if (ch == '-') {
							res.add(l - r);
						}
						else {
							res.add(l*r);
						}
					}
				}
			}
		}
		if (res.size() == 0) {
			res.add(Integer.valueOf(input));
		}
		map.put(input, res);
		return res;
	}

}
