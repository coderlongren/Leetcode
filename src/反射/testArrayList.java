package ����;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��3��4�� ����10:37:21
* ��˵��: 
*/
public class testArrayList {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		Method method = list.getClass().getMethod("add", Object.class);
		method.invoke(list, "�������String��");
		System.out.println(!list.isEmpty());
		
		int[] temp = {1,2,3,4,5};
		Class<?> clazz = temp.getClass().getComponentType();
		System.out.println("��������" + clazz.getName());
		System.out.println("����"  + Array.getLength(temp));
		System.out.println("�����һ��Ԫ��" + Array.get(temp,0));
		Array.set(temp, 0, 100);
		System.out.println("�޸ĺ��һ��Ԫ��" + Array.get(temp, 0));
	}

}
