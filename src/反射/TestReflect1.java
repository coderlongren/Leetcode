package 反射;

import java.io.Serializable;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年3月3日 下午9:15:04
* 类说明: 
*/
public class TestReflect1 implements Cloneable, Serializable{
	private static final long seriaVersionUID = -2862585049955236662L;
	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Class<?> clazz = Class.forName("反射.TestReflect1");
		
		// 获取父类
		Class<?> parentClass = clazz.getSuperclass();
		
		System.out.println("class对象的父类是:" + parentClass.getName());
		// clazz的父类为： java.lang.Object
        // 获取所有的接口
		
		Class<?> intes[] = clazz.getInterfaces();
		System.out.println("clazz实现的接口有");
		for (int i = 0; i <intes.length; i++) {
			System.out.println(i++ + ":" + intes[i].getName());
		}
		/**
		 * class对象的父类是:java.lang.Object
			clazz实现的接口有 0:java.io.Serializable
		 */

	}

}
