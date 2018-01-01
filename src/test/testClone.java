package test;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月1日 下午1:54:11
* 类说明: 
*/
public class testClone {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		person p1 = new person("coderlong", 21);
		person p2 = (person)p1.clone();
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p2.age);
		System.out.println(p2.name);
//		try {
//			person p2 = (person)person.class.newInstance();
//			System.out.println(p2.toString());
//			System.out.println(p2.name);
//			person p3 = (person)p2.clone();
//			syso
//			
//		} catch (InstantiationException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IllegalAccessException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		person person2 = person;
//		System.out.println(person);
//		System.out.println(person2);
		
		
		
	}

}
