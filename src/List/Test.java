package List;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��1��14�� ����3:05:01
* ��˵��: 
*/
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinStack minStack = new MinStack();
		minStack.push(1);
		minStack.push(2);
		minStack.push(3);
		minStack.push(4);
		System.out.println(minStack.getMin());
		minStack.push(-6);
		System.out.println(minStack.getMin());
		System.out.println(minStack.top());
		minStack.pop();
		System.out.println(minStack.top());
	}

}