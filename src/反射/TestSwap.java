package ����;

import java.lang.reflect.Field;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��4��6�� ����6:33:21
* ��˵��: 
*/
public class TestSwap {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Integer m1 = new Integer(1);
		Integer m2 = new Integer(2);
//		
//		Integer m1 = 1;
//		Integer m2 = 2;
		
//		System.out.println(m1 == m2);
		System.out.println("����֮ǰ" + m1 +" " +  m2);
		swap(m1, m2);
		System.out.println("����֮ǰ" + m1 +" " +  m2);
	}
	// ʹ�÷��䣬������
	public static void swap(Integer m1, Integer m2) throws Exception{
		Field field = Integer.class.getDeclaredField("value");
		field.setAccessible(true);
		int temp = m1;
		field.set(m1, m2);
		field.set(m2, new Integer(temp));
	}

}
