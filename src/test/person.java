package test;
/**
* @author 作者 : coderlong
* @version 创建时间：2017年12月23日 下午12:10:36
* 类说明: 
*/
public class person implements Cloneable{
	 public String name;
	 public int age;
	 @Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	 
	public person(String name,int age) {
		 this.name = name;
		 this.age = age;
	}
	
	// 默认构造函数
	 public person(){
//		 this.name = "aaa";
//		 this.age = 21;
	 }
		
}
