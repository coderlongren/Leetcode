import java.util.LinkedList;
import java.util.Queue;

public class leetcode225_implement_stack_using_queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	LinkedList<Integer> list;
	 /** Initialize your data structure here. */
   public leetcode225_implement_stack_using_queue() {
   		list = new LinkedList<Integer>();
   }
   
   /** Push element x onto stack. */
   // using LinkedList й╣ож
   // 1>2>3 
   public void push(int x) {
       list.add(x);
  
   }
   
   /** Removes the element on top of the stack and returns that element. */
   public int pop() {
		int head = list.removeLast();
       return head;
   }
   
   /** Get the top element. */
   public int top() {
		return list.getLast();
       
   }
   
   /** Returns whether the stack is empty. */
   public boolean empty() {
		return list.isEmpty();
       
   }


}
