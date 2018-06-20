package 反射;

import java.lang.reflect.Method;

import org.junit.Test;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年6月18日 下午8:13:21
* 类说明: 
*/
public class Reflection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class<?> clazz = new Reflection().getClass();
//		Method[] methods = clazz.getDeclaredMethods();
		Method[] methods = clazz.getMethods();
		for (Method method : methods) {
			System.out.println(":" + method.getName());
		}
	}
	@Test
	public void test1() {
		System.out.println("ss");
	}
	public void test2() {
		
	}
	public static void test3() {
		
	}

}
