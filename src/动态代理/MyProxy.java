package 动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

import com.coderlong.calculate.表达式求值.op;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月31日 下午9:42:49
* 类说明: 
*/
public class MyProxy implements InvocationHandler {

	Object obj;
	public Object bind(Object obj) {
		this.obj = obj;
		return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), this);
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println(" l am a proxy");
		Object res = method.invoke(obj, args);
//		Arrays.copyOf(original, newLength)
		return res;
	}

}
