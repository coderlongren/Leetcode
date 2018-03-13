package JVM测试;

import java.util.ArrayList;
import java.util.List;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年3月11日 下午7:24:49
* 类说明: 
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
	// 测试方法区溢出
	public static void testFangfaqu() {
		// 使用List保持对常量池引用，避免了 Full GC回收常量池行为
		List<String> list = new ArrayList<>();
		int i = 0;
		while (true) {
			list.add(String.valueOf(i++).intern());
		}
	}
	// 测试 堆溢出
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
