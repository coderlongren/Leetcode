package 静态代理;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月31日 下午9:38:49
* 类说明: 
*/
public class StaticProxy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HoseeImpl hoseeImpl = new HoseeImpl();
		HoseeProxy hProxy = new HoseeProxy(hoseeImpl);
		System.out.println(hProxy.sayhi());
	}	

}
