package ��̬����;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

import com.coderlong.calculate.���ʽ��ֵ.op;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��1��31�� ����9:42:49
* ��˵��: 
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
