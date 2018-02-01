package 动态代理;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月31日 下午9:49:31
* 类说明: 
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
