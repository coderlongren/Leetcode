package 反射;

import java.lang.reflect.Field;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年4月6日 下午6:33:21
* 类说明: 
*/
public class TestSwap {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Integer m1 = new Integer(1);
		Integer m2 = new Integer(2);
//		
//		Integer m1 = 1;
//		Integer m2 = 2;
		
//		System.out.println(m1 == m2);
		System.out.println("交换之前" + m1 +" " +  m2);
		swap(m1, m2);
		System.out.println("交换之前" + m1 +" " +  m2);
	}
	// 使用反射，来交换
	public static void swap(Integer m1, Integer m2) throws Exception{
		Field field = Integer.class.getDeclaredField("value");
		field.setAccessible(true);
		int temp = m1;
		field.set(m1, m2);
		field.set(m2, new Integer(temp));
	}

}
