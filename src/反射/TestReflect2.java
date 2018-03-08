package ����;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��3��3�� ����10:08:40
* ��˵��: 
*/
public class TestReflect2 extends TestReflect implements Serializable,Cloneable{
	private static final long serialVersionUID = -2862585049955236662L;
	public static void main(String[] args) throws ClassNotFoundException{
		// TODO Auto-generated method stub
		Class<?> clazz = Class.forName("����.TestReflect2");
		System.out.println("��������");
		// ȡ���Լ��۵�ȫ������
		Field[] fields = clazz.getDeclaredFields();
		
		for (int i = 0; i < fields.length; i++) {
			// ������Ե����η�
			int mo = fields[i].getModifiers();
			String priv = Modifier.toString(mo);
			System.out.println(priv);
			// ������Ե�����
			Class<?> type = fields[i].getType();
			System.out.println(priv + " " + type.getName() + " " + fields[i].getName());
		}
		
		// ȡ�ýӿڵ�ʵ�� ���߸��������
		System.out.println("�ӿڵ�ʵ�� ���߸��������");
		Field[] fields2 = clazz.getFields();
		
		for (int i = 0; i < fields2.length; i++) {
			// Ȩ�����η�
			int mo = fields2[i].getModifiers();
			String priv = Modifier.toString(mo);
			// ���Ե�����
			Class<?> type = fields2[i].getType();
			System.out.println(priv + " " + type.getName() + " " + fields2[i].getName());
		}
	}

}
