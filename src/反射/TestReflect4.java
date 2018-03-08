package ����;

import java.lang.reflect.Method;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��3��4�� ����3:45:57
* ��˵��: 
*/
public class TestReflect4 {

	public static void main(String[] args) throws Exception {
		Class<?> clazz = Class.forName("����.TestReflect4");
		Method method = clazz.getMethod("reflect1");
		method.invoke(clazz.newInstance());
		
		// �������ķ�����ε���
		method = clazz.getMethod("reflect2", int.class, String.class);
		method.invoke(clazz.newInstance(),20,"wangyake");
		
	}
	public void reflect1() {
        System.out.println("Java ������� - ����ĳ����ķ���1.");
    }
    public void reflect2(int age, String name) {
        System.out.println("Java ������� - ����ĳ����ķ���2.");
        System.out.println("age -> " + age + ". name -> " + name);
    }
}
