package JVM����;

import java.util.ArrayList;
import java.util.List;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��3��11�� ����7:24:49
* ��˵��: 
*/
public class StackOverFlow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<test> list = new ArrayList<>();
//		while (true) {
//			list.add(new test());
//		}
//		test();
//		Heap();
		testFangfaqu();
//		testThrad();
	}
	// Exception in thread "main" java.lang.StackOverflowError
	public static void test() {
		test();
	}
	// ���Է��������
	public static void testFangfaqu() {
		// ʹ��List���ֶԳ��������ã������� Full GC���ճ�������Ϊ
		List<String> list = new ArrayList<>();
		int i = 0;
		while (true) {
			list.add(String.valueOf(i++).intern());
		}
	}
	// ���� �����
	public static void Heap() {
		List<Object> list = new ArrayList<>();
		while (true) {
			list.add(new StackOverFlow());
		}
	}
	public static void doStop() {
		while (true) {
			
		}
	}
	public static void testThrad() {
		while (true) {
			Thread thread = new Thread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					doStop();
				}
			});
			thread.start();
		}
	}
}
class test{
	int val = 5;
	String name = "ssss";
}
