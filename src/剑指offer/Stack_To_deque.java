package 剑指offer;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月13日 下午11:13:25
* 类说明: 
*/
public class Stack_To_deque {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Deque<String> deque = new Deque<>();
		deque.appendTail("java");
		deque.appendTail("Python");
		deque.appendTail("Node");
		System.out.println(deque.deleteHead());
		System.out.println(deque.deleteHead());
		deque.appendTail("C++");
		System.out.println(deque.deleteHead());
		System.out.println(deque.deleteHead());
	}
	
	

}
