package ����;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��3��4�� ����3:19:21
* ��˵��: 
*/
public class testReflect3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class<?> clazz = Class.forName("����.testReflect3");
		
		Field[] fields = clazz.getDeclaredFields();
		Method[] methods = clazz.getDeclaredMethods();
		for (int i = 0; i < methods.length; i++) {
			// ����ֵ
			Class<?> returnType = methods[i].getReturnType();
			// ��÷�������
			Class<?>[] para = methods[i].getParameterTypes();
			int mo = methods[i].getModifiers();
			// ���η�
			String priv = Modifier.toString(mo);
			System.out.print(priv + " ");
			System.out.print(returnType.getName() + " ");
			System.out.print(methods[i].getName() + " ");
			System.out.print("(");
			for (int j = 0; j < para.length; j++) {
				System.out.print(para[i].getName() + " arg " + j);
				if (j < methods.length - 1) {
					System.out.print(",");
				}
			}
			Class<?>[] excel = methods[i].getExceptionTypes();
			if (excel.length > 0) {
				for (int k = 0; k < excel.length; k++) {
					System.out.print(excel[k].getName() + " ");
					if (k < excel.length - 1) {
						System.out.print(",");
					}
				}
				
			}
			else {
				System.out.print(")");
			}
			System.out.print(")");
		}
	}
	
	// result:
	// public static void main ([Ljava.lang.String; arg 0java.lang.Exception )

}
