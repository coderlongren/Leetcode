package ��ָoffer;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��8��5�� ����5:09:31
* ��˵��: 
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
				data.pop(); // ����һ����ͬ��Ԫ��
			}
		}
		return data.isEmpty();
	}
}
