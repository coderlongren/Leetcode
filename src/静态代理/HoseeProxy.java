package ��̬����;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��1��31�� ����9:36:34
* ��˵��: 
*/
public class HoseeProxy implements Hosee {
	Hosee h;
    public HoseeProxy(Hosee hosee) {
		// TODO Auto-generated constructor stub
		this.h = hosee;
	}
	
	
	
	@Override
	public String sayhi() {
		// TODO Auto-generated method stub
		System.out.println("l am proxy");
		return h.sayhi();
	}

}
