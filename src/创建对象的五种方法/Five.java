package ������������ַ���;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��1��1�� ����3:32:02
* ��˵��: 
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
