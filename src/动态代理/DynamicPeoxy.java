package ��̬����;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��1��31�� ����9:49:31
* ��˵��: 
*/
public class DynamicPeoxy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyProxy myProxy = new MyProxy();
		HoseeDynamicimpl hoseeDynamicimpl = new HoseeDynamicimpl();
		Hosee hosee = (Hosee) myProxy.bind(hoseeDynamicimpl);
		System.out.println(hosee.sayhi());
	}

}
