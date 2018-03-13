package JVM测试;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年3月12日 下午7:57:40
* 类说明: 
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
