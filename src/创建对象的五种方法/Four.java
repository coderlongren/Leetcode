package ������������ַ���;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��1��1�� ����3:03:01
* ��˵��: 
*/
public class Four {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		Constructor<Person> constructor = Person.class.getConstructor();
		Person person = constructor.newInstance();
		System.out.println(person.name);
		
		
	}

}
