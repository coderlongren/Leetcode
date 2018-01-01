package 创建对象的五种方法;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月1日 下午3:32:02
* 类说明: 
*/
public class Five {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		Person p2 = (Person)p1.clone();
		Person p3 = p1;
		System.out.println(p1 == p2);
		System.out.println(p1 == p3);
	}

}
