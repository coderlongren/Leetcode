package ����;

import java.lang.reflect.Method;

import org.junit.Test;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��6��18�� ����8:13:21
* ��˵��: 
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
