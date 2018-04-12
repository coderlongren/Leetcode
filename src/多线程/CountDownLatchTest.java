package ���߳�;

import java.util.concurrent.CountDownLatch;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��4��10�� ����10:26:19
* ��˵��: 
*/
public class CountDownLatchTest {
	private static CountDownLatch countDownLatch;
	
	static class Bossthread extends Thread {
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("�ϰ��ڵȴ������λ�����Ҫ" + countDownLatch.getCount() + "λԱ��");
			try {
				countDownLatch.await();
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println("����Ա�������ʼ����");
		}
	}
	//Ա�����������
    static class EmpleoyeeThread  extends Thread{
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + "�����������....");
            //Ա����������� count - 1
            countDownLatch.countDown();
        }
    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countDownLatch = new CountDownLatch(5);
		new Bossthread().start();
		for (int i = 0; i < 5; i++) {
			new EmpleoyeeThread().start();
		}
	}

}
