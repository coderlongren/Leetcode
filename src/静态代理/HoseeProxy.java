package 静态代理;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月31日 下午9:36:34
* 类说明: 
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
