package 反射;

import java.nio.ReadOnlyBufferException;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年3月4日 下午9:48:10
* 类说明: 反射机制的动态代理
*/
public class TestReflect6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 获取类加载器方法
		MyInvocationHandler myInvocationHandler = new MyInvocationHandler();
		Subject subject = (Subject) myInvocationHandler.Bind(new RealSubject());
		
		System.out.println(subject.say("yake", 22));
	}

}
