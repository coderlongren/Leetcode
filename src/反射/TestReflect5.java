package ����;

import java.lang.reflect.Field;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��3��4�� ����3:57:26
* ��˵��:  
*/
public class TestReflect5 {
	private String name  = "coderlong";
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class<?> clazz = Class.forName("����.TestReflect5");
		// ����Զ������Ը�ֵ
		Field field = clazz.getDeclaredField("name");
		System.out.println(field.getName());
		Object object = clazz.newInstance();
		// field.get(object)�ǻ�ȡʵ��object��nameֵ
		System.out.println(field.get(object));
		field.setAccessible(true);
		field.set(object,"yake");
		System.out.println(field.get(object));
	}

}
