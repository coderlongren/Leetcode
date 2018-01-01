package 创建对象的五种方法;


/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月1日 下午1:59:01
* 类说明: 
*/
public class Two {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
		//  这样使用需要 写一个无参的构造方法，不然报异常
		Person person = Person.class.newInstance();
		System.out.println(person);
	}

}
