package ����;

import java.io.Serializable;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��3��3�� ����9:15:04
* ��˵��: 
*/
public class TestReflect1 implements Cloneable, Serializable{
	private static final long seriaVersionUID = -2862585049955236662L;
	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Class<?> clazz = Class.forName("����.TestReflect1");
		
		// ��ȡ����
		Class<?> parentClass = clazz.getSuperclass();
		
		System.out.println("class����ĸ�����:" + parentClass.getName());
		// clazz�ĸ���Ϊ�� java.lang.Object
        // ��ȡ���еĽӿ�
		
		Class<?> intes[] = clazz.getInterfaces();
		System.out.println("clazzʵ�ֵĽӿ���");
		for (int i = 0; i <intes.length; i++) {
			System.out.println(i++ + ":" + intes[i].getName());
		}
		/**
		 * class����ĸ�����:java.lang.Object
			clazzʵ�ֵĽӿ��� 0:java.io.Serializable
		 */

	}

}
