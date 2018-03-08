package 反射;

import java.lang.reflect.Method;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年3月4日 下午3:45:57
* 类说明: 
*/
public class TestReflect4 {

	public static void main(String[] args) throws Exception {
		Class<?> clazz = Class.forName("反射.TestReflect4");
		Method method = clazz.getMethod("reflect1");
		method.invoke(clazz.newInstance());
		
		// 带参数的方法如何调用
		method = clazz.getMethod("reflect2", int.class, String.class);
		method.invoke(clazz.newInstance(),20,"wangyake");
		
	}
	public void reflect1() {
        System.out.println("Java 反射机制 - 调用某个类的方法1.");
    }
    public void reflect2(int age, String name) {
        System.out.println("Java 反射机制 - 调用某个类的方法2.");
        System.out.println("age -> " + age + ". name -> " + name);
    }
}
