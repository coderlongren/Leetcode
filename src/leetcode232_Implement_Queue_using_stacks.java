import java.util.LinkedList;

/**
* @author 作者 : coderlong
* @version 创建时间：2017年12月11日 下午9:56:55
* 类说明: 
*/
public class leetcode232_Implement_Queue_using_stacks {
	LinkedList<Integer> list;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public leetcode232_Implement_Queue_using_stacks(){
		list = new LinkedList<>();
	}
	 /** Push element x to the back of queue. */
    public void push(int x) {
        list.add(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
    	return list.removeFirst();
        
    }
    
    /** Get the front element. */
    public int peek() {
        return list.getFirst();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return list.isEmpty();
    }

}
