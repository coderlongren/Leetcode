package ע��;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��3��1�� ����10:36:51
* ��˵��: 
*/
public class TestInterface {
	public @interface MethodInfo {
		String author() default "coderlong";
	    String date();
	    int version() default 1;
	}
	
	@MethodInfo(date = "test")
	public void test() {
		System.out.println("ע����Ч����");
	}
}	
