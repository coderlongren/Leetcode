package 反射;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年3月3日 下午10:08:40
* 类说明: 
*/
public class TestReflect2 extends TestReflect implements Serializable,Cloneable{
	private static final long serialVersionUID = -2862585049955236662L;
	public static void main(String[] args) throws ClassNotFoundException{
		// TODO Auto-generated method stub
		Class<?> clazz = Class.forName("反射.TestReflect2");
		System.out.println("本类属性");
		// 取得自己累得全部属性
		Field[] fields = clazz.getDeclaredFields();
		
		for (int i = 0; i < fields.length; i++) {
			// 获得属性的修饰符
			int mo = fields[i].getModifiers();
			String priv = Modifier.toString(mo);
			System.out.println(priv);
			// 获得属性的类型
			Class<?> type = fields[i].getType();
			System.out.println(priv + " " + type.getName() + " " + fields[i].getName());
		}
		
		// 取得接口的实现 或者父类的属性
		System.out.println("接口的实现 或者父类的属性");
		Field[] fields2 = clazz.getFields();
		
		for (int i = 0; i < fields2.length; i++) {
			// 权限修饰符
			int mo = fields2[i].getModifiers();
			String priv = Modifier.toString(mo);
			// 属性的类型
			Class<?> type = fields2[i].getType();
			System.out.println(priv + " " + type.getName() + " " + fields2[i].getName());
		}
	}

}
