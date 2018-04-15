import java.util.LinkedList;
import java.util.List;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年4月15日 下午8:41:44
* 类说明: 分治算法的基本思想是将一个规模为N的问题
* 分解为K个规模较小的子问题，
* 这些子问题相互独立且与原问题性质相同，求出子问题的解,
* 就可得到原问题的解。
*/
public class leetcode241_Different_ways_to_add_parentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public List<Integer> diffWaysToCompute(String input) {
        List<Integer> ret = new LinkedList<>();
        for (int i = 0; i < input.length(); i++) {
        	if (input.charAt(i) == '-' 
        			|| input.charAt(i) == '+' 
        			|| input.charAt(i) == '*') {
        		String part1 = input.substring(0, i);
        		String part2 = input.substring(i + 1);
        		List<Integer> part1Ret = diffWaysToCompute(part1);
        		List<Integer> part2Ret = diffWaysToCompute(part2);
        		
        		for (Integer p1 : part1Ret) {
        			for (Integer p2 : part2Ret) {
        				int c = 0;
        				switch (input.charAt(i)) {
                        case '+': c = p1+p2;
                            break;
                        case '-': c = p1-p2;
                            break;
                        case '*': c = p1*p2;
                            break;
        				}
        				ret.add(c);
        			}
        		}
        	}
        }
    }
	

}
