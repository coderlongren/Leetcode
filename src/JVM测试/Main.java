package JVM����;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��3��12�� ����7:57:40
* ��˵��: 
*/
public class Main {
	final int i;
	public Main() {
		// TODO Auto-generated constructor stub
		this.i = 4;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(SuperClass.value);
//		System.out.println(SubClass.value);
//		SuperClass[] supers = new SuperClass[3];
		System.out.println(SuperClass.STRING);
		new Thread()
		{
			public void run() {
				
			}
		}.checkAccess();
		Thread t = new Thread();
		t.checkAccess();
	}

	
}
