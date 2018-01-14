package List;

import java.util.LinkedList;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月14日 下午2:59:56
* 类说明: 
*/
public class MinStack {
	private LinkedList<Integer> stack; 
	public MinStack(){
		this.stack = new LinkedList<>();
	}
	public void push(int x) {
        stack.add(x);
    }
    
    public void pop() {
        stack.removeLast();
    }
    
    public int top() {
		return stack.getLast();
        
    }
    
    public int getMin() {
		int min = Integer.MAX_VALUE;
		for (Integer integer : stack) {
			min = Math.min(min, integer);
		}
        return min;
    }
}
