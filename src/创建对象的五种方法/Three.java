package ������������ַ���;


/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��1��1�� ����2:59:57
* ��˵��: 
*/
public class Three {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Person person = (Person) Class.forName("������������ַ���.Person").newInstance();
		System.out.println(person);
	}

}
