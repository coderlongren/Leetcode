package 反射;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年3月4日 下午10:37:21
* 类说明: 
*/
public class testArrayList {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		Method method = list.getClass().getMethod("add", Object.class);
		method.invoke(list, "可以添加String？");
		System.out.println(!list.isEmpty());
		
		int[] temp = {1,2,3,4,5};
		Class<?> clazz = temp.getClass().getComponentType();
		System.out.println("数组类型" + clazz.getName());
		System.out.println("长度"  + Array.getLength(temp));
		System.out.println("数组第一个元素" + Array.get(temp,0));
		Array.set(temp, 0, 100);
		System.out.println("修改后第一个元素" + Array.get(temp, 0));
	}

}
