package JVM����;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��3��17�� ����8:12:17
* ��˵��: 
*/
public class Java�﷨�� {
	public static void main(String[] args) {
//		Integer i1=10;
//		Integer i2=10;
//		Integer i3=20;
//		Integer i11=new Integer(10);
//		Integer i22=new Integer(10);
//		Integer i33=new Integer(20);
//		
//		System.out.println(i1==i2); // true
//		System.out.println(i1==i11); // false �Ƚ϶���
//		System.out.println(i11==i22); // false
//		System.out.println(i3==(i1+i2)); // true ��װ��һ�������� ������������ǻ��Զ������
//		System.out.println(i3==(i11+i22));// true ��װ��һ�������� ������������ǻ��Զ������
//		System.out.println(i33==(i1+i2));// true ��װ��һ�������� ������������ǻ��Զ������
//		System.out.println(i33==(i11+i22));// true ��װ��һ�������� ������������ǻ��Զ������
//		
		
		
		String s1="abc1";//�˴�������1
		String s2="abc"+1;
		System.out.println(s1==s2);// ��һ�αȽ�
		String s3="ab";
		String s4="c";
		String s5="abc";
		String s6=s3+s4;
		System.out.println(s5==s6);// �ڶ��αȽ�
	}
}
