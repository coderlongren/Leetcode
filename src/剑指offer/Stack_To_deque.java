package ��ָoffer;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��1��13�� ����11:13:25
* ��˵��: 
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
