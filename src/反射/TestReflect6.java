package ����;

import java.nio.ReadOnlyBufferException;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��3��4�� ����9:48:10
* ��˵��: ������ƵĶ�̬����
*/
public class TestReflect6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��ȡ�����������
		MyInvocationHandler myInvocationHandler = new MyInvocationHandler();
		Subject subject = (Subject) myInvocationHandler.Bind(new RealSubject());
		
		System.out.println(subject.say("yake", 22));
	}

}
