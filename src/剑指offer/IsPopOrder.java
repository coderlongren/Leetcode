package 剑指offer;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年8月5日 下午5:09:31
* 类说明: 
*/
public class IsPopOrder {
	public static void main(String[] args) {
		
	}
	public static boolean isOrder(List<Integer> push_v, List<Integer> pop_v) {
		Stack<Integer> data = new Stack<>();
		int i = 0;
		int j = 0;
		while (i < push_v.size()) {
			data.push(push_v.get(i++));
			while (j < pop_v.size() && pop_v.get(j) == data.peek()) {
				j++;
				data.pop(); // 弹出一个相同的元素
			}
		}
		return data.isEmpty();
	}
}
