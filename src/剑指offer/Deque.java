package ��ָoffer;

import java.util.Stack;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��1��13�� ����11:14:00
* ��˵��: 
 * @param <T>
*/
public class Deque<T> {
	private Stack<T> stack1 = new Stack<>();
	private Stack<T> stack2 = new Stack<>();
	public void appendTail(T t){
		stack1.push(t);
	}
	public T deleteHead() throws Exception{
		if (stack2.isEmpty()){
			while (!stack1.isEmpty()){
				stack2.push(stack1.pop());
			}
		}
		
		if (stack2.isEmpty()){
			throw new Exception("����Ϊ��");
		}
		return stack2.pop();
	}
}
