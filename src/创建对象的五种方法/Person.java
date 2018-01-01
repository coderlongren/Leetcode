package 创建对象的五种方法;

import java.io.Serializable;

/**
* @author 作者 : coderlong
* @version 创建时间：2017年12月23日 下午12:10:36
* 类说明: 
*/
public class Person  implements Cloneable,Serializable{
	 public String name;
	 @Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	public int age;
	 public Person(String name,int age) {
		 this.name = name;
		 this.age = age;
	}
	 public Person(){
		 
	 }
	 
		
}
