package 反射;

import java.lang.reflect.Field;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年3月4日 下午3:57:26
* 类说明:  
*/
public class TestReflect5 {
	private String name  = "coderlong";
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class<?> clazz = Class.forName("反射.TestReflect5");
		// 反射对对象属性赋值
		Field field = clazz.getDeclaredField("name");
		Object object = clazz.newInstance();
		System.out.println(field.get(object));
		field.setAccessible(true);
		field.set(object,"yake");
		System.out.println(field.get(object));
	}

}
