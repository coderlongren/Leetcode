package ����;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��3��3�� ����9:27:11
* ��˵��: 
*/
public class TestReflect {
	public int test;
	public String name;
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		Class<?> clazz1 = null;
		clazz1 = Class.forName("����.User");
		User user = (User)clazz1.newInstance();
		user.setAge(20);
        user.setName("������");
        System.out.println(user);
        // result :  User [age=20, name=������]
        
        // �ڶ��ַ��� ��ȡ���췽��
        Constructor<?> cons[] = clazz1.getConstructors();
        // ��һ�� ÿ�����췽����Ҫ�ķ���
        for (int i = 0; i < cons.length; i++) {
        	Class<?> clazzs[] = cons[i].getParameterTypes();
        	System.out.print("cons[" + i + "] (");
            for (int j = 0; j < clazzs.length; j++) {
                if (j == clazzs.length - 1)
                    System.out.print(clazzs[j].getName());
                else
                    System.out.print(clazzs[j].getName() + ",");
            }
            System.out.println(")");
        }
        // ���
        	
        User user2 = (User)cons[0].newInstance(20,"������");
        
        System.out.println(user2);
        
        
	}

}
