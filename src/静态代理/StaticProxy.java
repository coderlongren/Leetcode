package ��̬����;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��1��31�� ����9:38:49
* ��˵��: 
*/
public class StaticProxy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HoseeImpl hoseeImpl = new HoseeImpl();
		HoseeProxy hProxy = new HoseeProxy(hoseeImpl);
		System.out.println(hProxy.sayhi());
	}	

}
