import java.util.LinkedList;
import java.util.Queue;

import org.w3c.dom.stylesheets.LinkStyle;

public class leetcode225_Implement_stack_using_queues {
	
	public static void main(String[] args){
		LinkedList<Integer> list = new LinkedList<Integer>();
//		System.out.println(list.add(1));
//		System.out.println(list.add(2));
////		System.out.println(list.indexOf(2));
////		System.out.println(list.get(1));
//		System.out.println(list.size());
//		list.removeFirst();
//		System.out.println(list.size());
//		System.out.println(list.get(0));
//		System.out.println(list.removeLast());
//		System.out.println("length " + list.size());
//		list.add(4);
//		list.add(1);
//		System.out.println(list.peek());
//		System.out.println(list.offer(24));
//		System.out.println(list.peek());
//		System.out.println(list.getLast());
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list.indexOf(2));
		list.removeFirst();
		System.out.println(list.indexOf(2));
		
	}
	Queue<Integer> queue;
	 /** Initialize your data structure here. */
    public leetcode225_Implement_stack_using_queues() {
    	queue = new LinkedList<Integer>();
    }
    
    /** Push element x onto stack. */
    // 吧元素进队列的 时候  把整个队列 都出队列一次 再进队列 = 逆转队列
    // 1>2>3 
    public void push(int x) {
        queue.add(x);
        for (int i = 0;i < queue.size(); i++){
        	queue.add(queue.poll());
        }
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
		return queue.poll();
        
    }
    
    /** Get the top element. */
    public int top() {
		return queue.peek();
        
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
		return queue.isEmpty();
        
    }

}
