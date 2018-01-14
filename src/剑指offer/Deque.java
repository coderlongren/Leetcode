package 剑指offer;

import java.util.Stack;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月13日 下午11:14:00
* 类说明: 
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
			throw new Exception("队列为空");
		}
		return stack2.pop();
	}
}
