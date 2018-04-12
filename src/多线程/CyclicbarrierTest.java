package 多线程;

import java.util.concurrent.CyclicBarrier;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年4月10日 下午10:06:51
* 类说明: 
*/
public class CyclicbarrierTest {
	private static CyclicBarrier cyclicBarrier;
	static class CyclicBarrierThread extends Thread {
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("一个成员到达");
			try {
				cyclicBarrier.await(); // 等待
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
				System.out.println("人都到齐了，开会！");
			}
		});
		for (int i = 0; i < 10; i++) {
			new CyclicBarrierThread().start();
		}
	}

}
