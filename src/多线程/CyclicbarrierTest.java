package ���߳�;

import java.util.concurrent.CyclicBarrier;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��4��10�� ����10:06:51
* ��˵��: 
*/
public class CyclicbarrierTest {
	private static CyclicBarrier cyclicBarrier;
	static class CyclicBarrierThread extends Thread {
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("һ����Ա����");
			try {
				cyclicBarrier.await(); // �ȴ�
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cyclicBarrier = new CyclicBarrier(10, new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("�˶������ˣ����ᣡ");
			}
		});
		for (int i = 0; i < 10; i++) {
			new CyclicBarrierThread().start();
		}
	}

}
