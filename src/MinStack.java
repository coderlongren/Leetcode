import java.util.Stack;

class MinStack {

	 /** initialize your data structure here. */
	int min;
	Stack<Integer> stack;
    public MinStack() {
        stack = new Stack<Integer>();
    }
    
    public void push(int x) {
        if (stack.isEmpty()){
        	stack.push(0);
        	min = x;
        }
        else {
        	stack.push(x - min);
        	if (x < min){
        		min = x;
        	}
        }
    }
    
    public void pop() {
        if (stack.isEmpty()){
        	return;
        }
        
        int pop=stack.pop();
        if (pop<0)  
        	min=min-pop;//If negative, increase the min value
        
        
    }
    public static void main(String[] args) {
    	MinStack minStack = new MinStack();
    	minStack.push(0);
    	minStack.push(1);
    	System.out.println();
    	
	}
    
//    public int top() {
//        
//    }
//    
//    public int getMin() {
//        
//    }
}
