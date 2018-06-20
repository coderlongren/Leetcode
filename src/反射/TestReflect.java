package 反射;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年3月3日 下午9:27:11
* 类说明: 
*/
public class TestReflect {
	public int test;
	public String name;
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		// TODO Auto-generated method stub
		List<?> list = new ArrayList<>();
		Method method = list.getClass().getMethod("add", Object.class);
		Method method2 = list.getClass().getDeclaredMethod("add", Object.class);
		method.invoke(list, "sss");
		method2.invoke(list, 3);
		System.out.println(list.size());
		
		Class<?> clazz1 = null;
		clazz1 = Class.forName("反射.User");
		User user = (User)clazz1.newInstance();
		user.setAge(20);
        user.setName("林黛玉");
        System.out.println(user);
        // result :  User [age=20, name=林黛玉]
        
        // 第二种方法 获取构造方法
        Constructor<?> cons[] = clazz1.getConstructors();
        // 看一下 每个构造方法需要的方法
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
        // 结果
        	
        User user2 = (User)cons[2].newInstance();
        
        System.out.println(user2);
        
        
	}

}
