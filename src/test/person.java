package test;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2017��12��23�� ����12:10:36
* ��˵��: 
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
	
	// Ĭ�Ϲ��캯��
	 public person(){
//		 this.name = "aaa";
//		 this.age = 21;
	 }
		
}