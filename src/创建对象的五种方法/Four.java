package 创建对象的五种方法;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月1日 下午3:03:01
* 类说明: 
*/
public class Four {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		Constructor<Person> constructor = Person.class.getConstructor();
		Person person = constructor.newInstance();
		System.out.println(person.name);
		
		
	}

}
