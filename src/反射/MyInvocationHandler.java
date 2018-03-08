package 反射;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import javax.xml.bind.Binder;

import com.coderlong.calculate.表达式求值.op;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年3月4日 下午9:53:52
* 类说明: 
*/
public class MyInvocationHandler implements InvocationHandler{
	
	private Object Object = null;
	
	public Object Bind(Object object) {
		this.Object = object;
		
		return Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), this);
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		Object temp = method.invoke(this.Object, args);
		return temp;
	}

}
