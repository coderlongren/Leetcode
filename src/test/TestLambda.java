package test;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2017��12��20�� ����6:35:12
* ��˵��: 
*/
public class TestLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread =  new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("running.....");
			}
		});
		thread.start();
		Thread thread2 = new Thread(() ->System.out.println("running"));
		thread2.run();
		
	}
	class mythread extends Thread{
		
	}

}
