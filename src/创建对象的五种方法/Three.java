package 创建对象的五种方法;


/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月1日 下午2:59:57
* 类说明: 
*/
public class Three {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Person person = (Person) Class.forName("创建对象的五种方法.Person").newInstance();
		System.out.println(person);
	}

}
