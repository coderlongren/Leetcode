package ������������ַ���;

import java.io.Serializable;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2017��12��23�� ����12:10:36
* ��˵��: 
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
