package ���߳�;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��1��17�� ����6:03:02
* ��˵��: 
*/
public class Shunxuzhixing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("t1.������������������������");
			}
		});
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					t1.join();
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("t2.������������������������");
			}
		});
		Thread t3 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					t2.join();
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("t3.������������������������");
			}
		});
		t3.start();
		t2.start();
		t1.start();
	}

}
